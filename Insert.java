//2. В строке вставить после каждого символа 'a' символ 'b'.

package com.epam.projects.eight;

public class Insert {

    public static void main(String[] args) {

        String str = "My name is Halina.";
        System.out.println (str.replaceAll ("a", "ab"));
    }
}
