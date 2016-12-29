import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.github.guide.Application;
import org.github.guide.aspect.WebLogAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by R on 2016/12/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    private static final Logger logger = LogManager.getLogger(ApplicationTests.class);

    @Test
    public void test() throws Exception {
        logger.info("输出info");
        logger.debug("输出debug");
        logger.error("输出error");
    }
}
