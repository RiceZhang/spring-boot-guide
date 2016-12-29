package org.github.guide;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by R on 2016/12/29.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationDemo.class)
public class ApplicationTests {

    @Test
    public void getHello() throws Exception {
    }

}
