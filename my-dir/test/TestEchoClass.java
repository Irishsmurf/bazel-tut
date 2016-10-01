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

  @Test
  public void testReturnHex(){
    assertEquals("0x5", echo.returnHex("5"));
    assertEquals("0xA", echo.returnHex("10"));
    assertEquals("0xB", echo.returnHex("11"));
    assertEquals("0x10", echo.returnHex("16"));
    assertEquals("0x142A4A", echo.returnHex("1321546"));
  }
}
