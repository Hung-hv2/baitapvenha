package Conllection.LinkedList;

import java.io.File;

public class ccc {
    public static void main(String[] args) {
        // xảy ra exception 1
        char arr[] = "Av,rnwc".toCharArray();
        try {
            for (int index = 1; index <= arr.length; index++) {
                System.out.println(arr[index]);
            }
        }
        catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("arr[index]" + index);
        }

        // xảy ra exception 2
        System.out.println("In String");
        try {
            String text = null;
            System.out.println(text.length());
        }
        catch (NullPointerException a) {
            System.out.println("aaa" +a);
        }

        // xảy ra exception 3
        File textFile = new File("Runner.java");
        System.out.println("Duong dan tuyet doi: " + textFile.getAbsoluteFile());
    }
}
