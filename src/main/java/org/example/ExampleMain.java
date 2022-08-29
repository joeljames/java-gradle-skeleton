package org.example;

import lombok.extern.slf4j.Slf4j;

import java.time.OffsetDateTime;

@Slf4j
public class ExampleMain {

    public static void main(String[] args) {
        User userFooBar = User.builder()
                .firstName("Foo")
                .lastName("Bar")
                .username("foo.bar")
                .build();
        log.info("Hi from user {}", userFooBar);
    }
}
