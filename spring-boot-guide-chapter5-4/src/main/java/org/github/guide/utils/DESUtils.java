package org.github.guide.utils;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

/**
 * Created by R on 2016/12/22.
 */
public class DESUtils {

    // 密钥
    private static Key key;
    // KEY种子
    private static String KEY_STR = "encrypt@cncounter.com";
    // 常量
    public static final String UTF_8 = "UTF-8";
    public static final String DES = "DES";

    // 静态初始化
    static{
        try {
            // KEY 生成器
            KeyGenerator generator = KeyGenerator.getInstance(DES);
            // 初始化,安全随机算子
            generator.init(new SecureRandom( KEY_STR.getBytes(UTF_8) ));
            // 生成密钥
            key = generator.generateKey();
            generator = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对源字符串加密,返回 BASE64编码后的加密字符串
     * @param source 源字符串,明文
     * @return 密文字符串
     */
    public static String encode(String source){
        try {
            // 根据编码格式获取字节数组
            byte[] sourceBytes = source.getBytes(UTF_8);
            // DES 加密模式
            Cipher cipher = Cipher.getInstance(DES);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            // 加密后的字节数组
            byte[] encryptSourceBytes = cipher.doFinal(sourceBytes);
            // Base64编码器
            BASE64Encoder base64Encoder = new BASE64Encoder();
            return base64Encoder.encode(encryptSourceBytes);
        } catch (Exception e) {
            // throw 也算是一种 return 路径
            throw new RuntimeException(e);
        }
    }

    /**
     * 对本工具类 encode() 方法加密后的字符串进行解码/解密
     * @param encrypted 被加密过的字符串,即密文
     * @return 明文字符串
     */
    public static String decode(String encrypted){
        // Base64解码器
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            // 先进行base64解码
            byte[] cryptedBytes = base64Decoder.decodeBuffer(encrypted);
            // DES 解密模式
            Cipher cipher = Cipher.getInstance(DES);
            cipher.init(Cipher.DECRYPT_MODE, key);
            // 解码后的字节数组
            byte[] decryptStrBytes = cipher.doFinal(cryptedBytes);
            // 采用给定编码格式将字节数组变成字符串
            return new String(decryptStrBytes, UTF_8);
        } catch (Exception e) {
            // 这种形式确实适合处理工具类
            throw new RuntimeException(e);
        }
    }
    // 单元测试
    public static void main(String[] args) {
        // 需要加密的字符串
        String userName = "root";
        String password = "";
        // 加密
        String encrypted_userName = DESUtils.encode(userName);
        String encrypted_password = DESUtils.encode(password);

        // 解密
        String decrypted_userName = DESUtils.decode(encrypted_userName);
        String decrypted_password = DESUtils.decode(encrypted_password);

        // 输出结果;
        System.out.println("userName: " + userName);
        System.out.println("encrypted: " + encrypted_userName);
        System.out.println("decrypted: " + decrypted_userName);
        System.out.println("password: " + password);
        System.out.println("encrypted: " + encrypted_password);
        System.out.println("decrypted: " + decrypted_password);
    }

}
