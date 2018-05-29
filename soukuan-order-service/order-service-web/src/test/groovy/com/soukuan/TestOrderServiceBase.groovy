package com.soukuan

import com.soukuan.base.GroovySpockBaseTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = OrderServiceApplication.class)
@SpringBootTest(classes = OrderServiceApplication.class)
@ActiveProfiles("spock")
class TestOrderServiceBase extends GroovySpockBaseTest {

    final def MESSAGE_URL = "/message"

}
