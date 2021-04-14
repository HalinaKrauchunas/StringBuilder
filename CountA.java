//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

package com.epam.projects.eight;

import java.util.regex.*;

public class CountA {

    public static void main(String[] args) {
        String str = "Mamaaa a";
        int countA = 0;
        Matcher matcher = Pattern.compile ("a").matcher (str);
        while (matcher.find ()) {
            countA++;
        }
        System.out.println ("Count 'a': " + countA);
    }
}
