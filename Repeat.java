//6. Из заданной строки получить новую, повторив каждый символ дважды.

package com.epam.projects.eight;

public class Repeat {

    public static void main(String[] args) {

        String str = "My name is Halina";
        StringBuilder newStr = new StringBuilder ();
        for (int count = 0; count < str.length (); count++) {
            String s = String.valueOf (str.charAt (count)).repeat (2);
            System.out.print (s);
            System.out.println("sg");
            System.out.println("forward!");
            System.out.println("noforward!!");
        }
    }
}
