//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

package com.epam.projects.eight;

public class WordCake {

    public static void main(String[] args) {

        String str = "информатика";
        String newStr = str.charAt (7) + str.substring (3, 5) + str.charAt (7);
        System.out.println (newStr);
    }
}
