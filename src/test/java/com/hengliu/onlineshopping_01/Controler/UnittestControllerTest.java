package com.hengliu.onlineshopping_01.Controler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
class UnittestControllerTest {
    @Resource
    UnittestController ut;
    AutoCloseable closeable;
    @Mock
    FKdependency fk;
    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        closeable.close();
    }

    @Test
    void add5() {
        ut = new UnittestController(fk);
        when(fk.add(anyInt(),anyInt())).thenReturn(100);
        int result = ut.add5(3,4);
        assertEquals(105,result);
    }
}