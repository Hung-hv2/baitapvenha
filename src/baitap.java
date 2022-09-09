import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {

        // baitap1 đếm số lần xuất hiện của kí tự h trong chuỗi nhập vào
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        char c = sc.next().charAt(0);
//        int answer = 0;
//        for(int i = 0; i < s.length(); i++){
//            if ( s.charAt (i)==c){
//                answer ++;
//            }
//        }
//        System.out.print(answer);


        // baitap 2 cộng 2 chuỗi bat kì
//        String a = "Hoang Van Hung";
//        String b = "Kim thanh thuy";
//        System.out.println(a + " " + b);


        //baitap 3 dùng hàm để viết hoa tat cả trong chuỗi
//        String a ="jabfasjndjsafkmasnfk";
//        String upper = a.toUpperCase();
//        System.out.println(upper);


        //baitap 4 đếm các kí tự hoa trong chuỗi
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int a = 0;
//        for (int i = 0; i<s.length(); i++){
//            if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ){
//                a++;
//            }
//        }
//        System.out.print(a);


        //baitap 5 đếm các kí tự số trong chuỗi
//        Scanner sc = new Scanner(System.in);
//        String t = sc.next();
//        int hung = 0;
//        for(int i = 0; i < t.length();i++){
//            if(t.charAt(i) >= '0' && t.charAt(i) <= '9'){
//                hung++;
//            }
//        }
//        System.out.println(hung);


        //baitap 6 in ra cac kí tự tại vị trí lẻ trong chuỗi (chưa làm đc)
//        Scanner sc = new Scanner(System.in);
//        String h = sc.next();
//        int a = 0;
//        for (int i = 0; i <= h.length();i++){
//            if (i % 2 == 1){
//                System.out.println(a);
//            }
//        }


        //baitap 7 in ra các kí tu dac biệt trong chuỗi


        //baitap 8 cắt khoảng trắng ở 2 đầu trong chuỗi
//        String a = "        welcome to Thái Bình;          ";
//        String h = a.trim();
//        System.out.println("loại bỏ khoảng trắng 2 đầu:" + h);


        //baitap 9 đếm tổng chữ cái thường trong chuỗi
//        Scanner sc = new Scanner(System.in);
//            String t = sc.next();
//            int hung= 0;
//            for(int i = 0; i < t.length();i++){
//                if(t.charAt(i) >= 'a' && t.charAt(i) <= 'z'){
//                    hung++;
//            }
//        }
//        System.out.println(hung);


        //baitap10 cắt chuỗi kí tự từ 2 đến hết chuỗi
//        String a = "Kim Thanh Thuy";
//        String h = a.substring(2);
//        System.out.println(h);


        //baitap 11: Tách tất cả các kí tự số trong chuỗi về mảng số nguyên


        //baitap 12: Cắt chuỗi từ kí tự thứ 2 đến kí tự thứ 8 trong chuỗi
//        String t = "Kim Thanh Thuy 05/10/1997";
//        String h = t.substring(2,8);
//        System.out.println(h);


        //baitap 13: đếm số kí tự trong chuỗi


        //baitap 14: Đếm 1 chuỗi có bao nhiêu kí tự số và chữ cái

//        String kytu;
//        int kytuso = 0, kytuchu = 0;
//        Scanner sc = new Scanner(System.in);
//        kytu = sc.nextLine();
//        for(int i = 0 ; i < kytu.length(); i++){
//            if (Character.isLowerCase(kytu.charAt(i))) {
//                kytuchu++;
//            }
//            if (Character.isDigit(kytu.charAt(i))) {
//                kytuso++;
//            }
//        }
//        System.out.println("chuỗi:" + "ký tự chữ:" + kytuchu + "Ký tự số:" + kytuso);


        //Baitap 15: lấy kí tự ở ví trí 2-3-4 trong chuỗi
//        String t = "hahsd332";
//        String str = t.substring(2,4);
//        System.out.println("Ký tự tại vị trí thứ 2-3-4: " + str);


        //baitap 16: thay thế chữ kí tự a thành kí tự b loại trừ kí tự đầu tiên
        // Sample string:restart      Expected Result: resta$t

//        String h = "restart";
//        String replace = h.replace("r", "$");
//        System.out.println(replace);


        //Baitap 17: Hoán đổi 2 kí tự đầu tiên của 2 chuỗi (chưa làm được)
        // sample string: "abc", "xyz"    expected result: "zbc", "ayz"
//        String h = "abc";
//        String t = "xyz";
//        String str = switch (h."0", t.0);
//        System.out.println(str);


        //Baitap 18: tìm từ dài nhất trong chuỗi và độ dài của từ đó ( chưa làm )
//        String h;
//        Scanner sc = new Scanner(System.in);
//        h = sc.nextLine();
//        System.out.print("xâu kí tự:" + h);


        //Baitap 19:viết một chương trình java để loại bỏ các ký tự có giá trị chỉ số lẻ của một chuỗi nhất định


        //Baitap 20:viết một hàm java để đảo ngược một chuỗi nếu độ dài của nó là bội số của 4
//        baitap rev=new baitap();
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a string : ");
//        String  str=sc.nextLine();
//        System.out.println("Reverse of a String  is : "+rev.reverse(str));
//            }
//        static String reverse(String s) {
//            String rev = "";
//            for (int j = s.length(); j > 0; --j) {
//                rev = rev + (s.charAt(j - 1));
//            }
//            return rev;


        //Bai 21: write a java function to convert a given string to all uppercase if it contains at least 2 uppercase characters in the first  characters
        //viết một hàm java để chuyển đổi một chuỗi nhất định thành tất cả các chữ hoa nếu nó chứa ít nhất 2 ký tự hoa trong các ký tự đầu tiên


//        String str;
//        Scanner sc = new Scanner(System.in);
//        str = sc.nextLine();
//
//        // Chuyển đổi chuỗi trên thành tất cả các chữ hoa
//        String upper_str = str.toUpperCase();
//
//        System.out.println("String in uppercase: " + upper_str);


    }
    }
