package OOPs.baitap1;

import java.util.Scanner;

public class Person {
        private String name;
        private String designation;
        public void intputperson() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập name:");
            this.name = scanner.next();
            System.out.println("Nhập designation: ");
            this.designation = scanner.next();
        }
        protected void learn(){
            System.out.println("learn...");
        }
        protected void walk(){
            System.out.println("walk...");
        }
        protected void eat(){
            System.out.println("eat...");
        }
        public void showPerson(){
            System.out.println("Nhập name: " + this.name + "   " + "Nhập designation: " + this.designation );
        }

}
