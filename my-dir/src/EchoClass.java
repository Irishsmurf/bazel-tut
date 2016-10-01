package com.paddez;

public class EchoClass {
  public EchoClass(){
  }

  public String returnHex(String decimal) {
    String hex = Integer.toHexString(Integer.parseInt(decimal));
    return "0x"+hex.toUpperCase();
  }

  public String returnString(String toReturn) {
    return toReturn;
  }
}
