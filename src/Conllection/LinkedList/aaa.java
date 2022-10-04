package Conllection.LinkedList;


public class aaa {
    public static void main(String[] args) {
        char arr[] = "Av,rnwc".toCharArray();
        try {
            for (int index = 1; index <= arr.length; index++) {
                System.out.println(arr[index]);
            }
        }
        catch(ArrayIndexOutOfBoundsException index) {
            System.out.println("arr[index]" + index);
        }
    }
}
