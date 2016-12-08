package org.github.guide.mappper;

import org.github.guide.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by R on 2016/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest  {

    @Autowired
    UserMapper userMapper;

    @Test
    public void find() throws Exception {
         List<Object> t = userMapper.find();
         System.out.println("XXX" + t.size() );
    }

}