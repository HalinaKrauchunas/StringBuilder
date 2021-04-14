//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

package com.epam.projects.eight;

import java.util.regex.*;

public class CountSpace {

    public static void main(String[] args) {

        String string = "Hello,   my frie  nd      !";
        int maxCount = 0;
        Matcher matcher = Pattern.compile ("(\\s+)").matcher (string);
        while (matcher.find ()) {
            String sub = matcher.group ();
            if (sub.length () > maxCount) {
                maxCount = sub.length ();
            }
        }
        System.out.println ("Count space: " + maxCount);
    }
}
