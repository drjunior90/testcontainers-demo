package com.danieljr.testcontainers.demo.infrastructure.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import com.danieljr.testcontainers.demo.infrastructure.configuration.TestConfig;
import com.danieljr.testcontainers.demo.infrastructure.container.MongoDbExtension;

@Retention(RUNTIME)
@Target(TYPE)
@ExtendWith(MongoDbExtension.class)
@SpringBootTest(classes = TestConfig.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Inherited
public @interface IT {
}
