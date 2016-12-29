package org.github.guide.service.impl;

import org.github.guide.service.ComputeService;

/**
 * 简单的 dubbo 计算服务
 * Created by zhangrixiong  on 2016/12/29.
 */
public class ComputeServiceImpl implements ComputeService {

    @Override
    public Integer add(int a, int b) {
        return a + b;
    }

}
