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
    @Override
    protected void learn() {
        System.out.println("learn của dancer");
    }
    protected void walk() {
        System.out.println("walk của dancer");
    }
    protected void eat() {
        System.out.println("eat của dancer");
    }

    public void  showDancer() {
        System.out.println("Nhập groupName: " + this.groupName);
    }
}
