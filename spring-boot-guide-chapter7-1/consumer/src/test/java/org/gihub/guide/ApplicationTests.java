package org.gihub.guide;

import org.github.guide.ApplicationDemo;
import org.github.guide.service.ComputeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  使用 dubbo API 依赖
 * Created by R on 2016/12/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationDemo.class)
public class ApplicationTests {

    @Autowired
    ComputeService computeService;

    /**
     * 测试dubbo 服务接口前, 先开启zk, 以及 dubbo service服务
     * @throws Exception
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("输出：" + computeService.add(1, 2));
        Assert.assertEquals("compute-service:add", new Integer(3), computeService.add(1, 2));
    }
}
