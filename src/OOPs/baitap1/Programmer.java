package OOPs.baitap1;

import java.util.Scanner;

public class Programmer extends Person {
    private String companyName;

    public void intPutProgrammer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập companyName: ");
        this.companyName = input.next();
    }
    protected void coding() {
        System.out.println("Coding...");
    }

    public void showProgrammer() {
        System.out.println("Nhập companyName: " + this.companyName);
    }
}
