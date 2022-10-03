package Conllection.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Covert {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Orange");
        list.add("Apple");
        list.add("Peach");
        list.add("Guava");
        list.add("Pear");
        List<String> aList = new ArrayList<>(list);
        System.out.println("The ArrayList elements are: ");
        for (Object i : aList) {
            System.out.println(i);
        }




        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        System.out.println(arrList);
        //ArrayList to LinkedList
        LinkedList<String> linkList = new LinkedList<>(arrList);
        System.out.println("Linked List:");
        System.out.println(linkList);
    }
}

