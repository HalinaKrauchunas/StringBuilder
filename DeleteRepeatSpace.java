//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc
// cde def", то должно быть выведено "abcdef".

package com.epam.projects.eight;

import com.epam.projects.*;

import java.util.*;

public class DeleteRepeatSpace {

    public static void main(String[] args) {

        InputStreamReader reader = new InputStreamReader (System.in);
        String inputString = reader.readLine ();
        StringBuilder stringBuilder = new StringBuilder ();
        String text = inputString.replace (" ", "");
        LinkedHashSet<Character> temp = new LinkedHashSet<> ();

        for (int i = 0; i < text.length (); i++) {
            if (temp.add (text.charAt (i))) {
                stringBuilder.append (text.charAt (i));
            }
        }
        System.out.println (stringBuilder);
    }
}