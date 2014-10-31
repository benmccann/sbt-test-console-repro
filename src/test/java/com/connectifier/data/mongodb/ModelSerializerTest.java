package com.connectifier.data.mongodb;

import org.junit.Assert;
import org.junit.Test;

public class ModelSerializerTest {

    @Test
    public void test1() {
        long total = 0;
        for (int i = 0; i <= 1000000; i++) {
            total += i;
        }
        Assert.assertEquals(500000500000l, total);
    }

    @Test
    public void test2() {
        long total = 0;
        for (int i = 0; i <= 1000000; i++) {
            total += i;
        }
        Assert.assertEquals(500000500000l, total);
    }

    @Test
    public void test3() {
        long total = 0;
        for (int i = 0; i <= 1000000; i++) {
            total += i;
        }
        Assert.assertEquals(500000500000l, total);
    }

}

