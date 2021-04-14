//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
// английские буквы.

package com.epam.projects.eight;

public class UpperLower {

    public static void main(String[] args) {

        String str = "My name a Halina";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i <= str.length () - 1; i++) {
            if (Character.isUpperCase (str.charAt (i))) {
                countUpper++;
            }
            if (Character.isLowerCase ((str.charAt (i)))) {
                countLower++;
            }
        }
        System.out.println ("Upper: " + countUpper);
        System.out.println ("Lower: " + countLower);
    }
}
