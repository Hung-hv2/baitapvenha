package OOPs.Baitap4;

import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private String gender;
    void inputAuthor() {
        Scanner author = new Scanner(System.in);
        System.out.println("Nhập tên:");
        name = author.next();
        System.out.println("Nhập email:");
        email = author.next();
        System.out.println("Nhập gender:");
    }
    public Author (String name, String email, String gender) {
        this.name = name;
        this.email = email;
    }

}
