//3. Проверить, является ли заданное слово палиндромом.

package com.epam.projects.eight;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Hahah";
        StringBuffer newStr = new StringBuffer (str).reverse ();
        if(str.equalsIgnoreCase(newStr.toString ())){
            System.out.println ("Palindrome");
        } else {
            System.out.println ("It is not palindrome");
        }
    }
}

