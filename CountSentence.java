//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
// вопросительным знаком. Определить количество предложений в строке X.

package com.epam.projects.eight;

import java.util.regex.*;

public class CountSentence {

    public static void main(String[] args) {

        int count = 0;
        String str = "My name is Halina. I have a big dog and a little cat. ";
        Matcher matcher = Pattern.compile ("([.!?])([\\s\\n])([A-Z]*)").matcher (str);
        while (matcher.find ()) {
            count++;
        }
        System.out.println (count + " sentence");
    }
}
