package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트가 수행하기 전에 실행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트가 수행된 후에 실행\n");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트코드가 실행되기 전에 최초로 수행\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트코드가 실행된 후에 마지막로 수행\n");
    }

    @Test
    void test1() {
        System.out.println("테스트코드 작성 1");
    }

    @Test
    void test2() {
        System.out.println("테스트코드 작성 2");
    }
}
