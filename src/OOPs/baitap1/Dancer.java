package OOPs.baitap1;

import java.util.Scanner;

public class Dancer extends Person{
    private String groupName;
    public void inPutDancer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập groupName: ");
        this.groupName = input.next();
    }
    protected void dancing(){
        System.out.println("dancing...");
    }

    public void  showDancer() {
        System.out.println("Nhập groupName: " + this.groupName);
    }
}
