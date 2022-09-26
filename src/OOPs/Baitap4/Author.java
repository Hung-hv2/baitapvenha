package OOPs.Baitap4;

import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private String gender;
    void inputAuthor(){
        Scanner author = new Scanner(System.in);
        System.out.println("Nhập tên:" + name);
        name = author.next();
        System.out.println("Nhập email:" + email);
        email = author.next();
        System.out.println("Nhập gender" + gender);
    }

}
