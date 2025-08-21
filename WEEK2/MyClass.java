package WEEK2;

import java.util.regex.Pattern;

class MyClass {

  private static Pattern PATT = Pattern.compile("(");
  public static void main(String[] args) {
        try {
            new MyClass();
        } catch (Throwable t) {}
        finally{new MyClass();}
    }

}

