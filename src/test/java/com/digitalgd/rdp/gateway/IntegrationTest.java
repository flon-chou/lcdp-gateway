package com.digitalgd.rdp.gateway;

import com.digitalgd.rdp.gateway.LcdpGatewayApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = LcdpGatewayApp.class)
public @interface IntegrationTest {
}
