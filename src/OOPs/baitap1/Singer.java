package OOPs.baitap1;

import java.util.Scanner;

public class Singer extends Person{
    private String bandName;

    public void intputSinger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bandName: ");
        this.bandName = input.next();
    }
    protected void sinsing(){
        System.out.println("singsing...");
    }
    protected void playgitar(){
        System.out.println("playgitar...");
    }
    protected void eat(String food) {
        System.out.println(food);
    }


    public void showSinger() {
        System.out.println("Nhập bandName: " + this.bandName);
    }
}
