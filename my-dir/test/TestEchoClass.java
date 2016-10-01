package com.paddez;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.paddez.EchoClass;

public class TestEchoClass {
  String message = "Hello!";
  EchoClass echo = new EchoClass();

  @Test
  public void testEchoMessage() {
    assertEquals(message, echo.returnString("Hello!"));
  }
}
