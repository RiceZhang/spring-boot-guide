package org.github.guide.service.impl;

import org.github.guide.service.ComputeService;

/**
 * Created by R on 2017/1/3.
 */
public class ComputeServiceImpl implements ComputeService {

    @Override
    public Integer add(int a, int b) {
        return a + b;
    }

}
