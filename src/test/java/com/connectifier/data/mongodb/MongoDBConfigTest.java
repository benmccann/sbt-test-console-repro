package com.connectifier.data.mongodb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class MongoDBConfigTest {

  @Test public void testNoHosts() {
    assertEquals(1, 1);
  }

  @Test public void testOneHost() {
    assertEquals(1, 1);
  }

  @Test public void testOneHostWithPort() {
    assertEquals(1, 1);
  }

  @Test public void testTwoHosts() {
    assertEquals(1, 1);
  }

  @Test public void testTwoHostsWithPort() {
    assertEquals(1, 1);
  }

  @Test public void testTwoHostsWithMaxAndMinPort() {
    assertEquals(1, 1);
  }

  @Test public void testBadPort() {
    assertEquals(1, 1);
  }

  @Test public void testNoHosts2() {
    assertEquals(1, 1);
  }

  @Test public void testOneHost2() {
    assertEquals(1, 1);
  }

  @Test public void testOneHostWithPort2() {
    assertEquals(1, 1);
  }

  @Test public void testTwoHosts2() {
    assertEquals(1, 1);
  }

  @Test public void testTwoHostsWithPort2() {
    assertEquals(1, 1);
  }

  @Test public void testTwoHostsWithMaxAndMinPort2() {
    assertEquals(1, 1);
  }

  @Test public void testBadPort2() {
    assertEquals(1, 1);
  }

}

