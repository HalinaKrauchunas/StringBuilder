//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда
// самых длинных слов может быть несколько, не обрабатывать.

package com.epam.projects.eight;

import com.epam.projects.*;

import java.util.*;

import static java.util.Arrays.*;

public class MaxLenWord {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader (System.in);
        String inputString = reader.readLine ();
        stream (inputString.split (" ")).max (Comparator.comparingInt (String::length));

    }
}


