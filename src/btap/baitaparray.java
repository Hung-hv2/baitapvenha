package btap;
import java.util.Arrays;
import java.util.Scanner;

public class baitaparray {
    public static void main(String[] args) {
//        int arr [] = {1,2,3,6,8,7,4,5,3,45,
//        84,65,54,66,33,12,88,99,77};
//        for (int i = 0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        student sv1 = new student(1,"Tùng","hello");
//        student sv2 = new student(2,"Bảo","hello");
//        student sv3 = new student(3,"Anh","hello");
//
//        student [] students = {sv1,sv2,sv3};
//
//
//    }
//    public static student[] bubbleSortDescending(student[] arr){
//        student temp;
//        for(int i=0; i < arr.length-1; i++){
//
//            for(int j=1; j < arr.length-i; j++){
//                if(arr[j-1] < arr[j]){
//                    temp=arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.println("Array after "+(i+1)+"th iteration:"+Arrays.toString(arr));
//        }
//        return arr;


//        // Bài tập 2:tính tổng trong array
//        int arr [] = {1, 5, 6, 8, 9, 11};
//        int sum = 0;
//        for (int i = 0; i<arr.length; i++){
//            sum += arr[i];
//        };
//        System.out.println("tổng của array:" + sum);



        // Bài tập 3: Viết chương trình để thêm sinh viên vào mảng, không thể thêm sinh viên trùng ID;



        //Bai tập 4:viết một chương trình java để xóa một phần tử cụ thể khỏi một mảng

//        int a[] = {1, 2, 3, 6,8};
//        int index = 3;
//        int kichthuocthucte = a.length;
//        for (int i = index; i < a.length-1;i++){
//            a[i] = a[i+1];
//        }
//        kichthuocthucte--;
//        System.out.println("sau khi xóa phần tử thứ 3 khỏi mảng:");
//        for (int i = 0; i < kichthuocthucte; i++){
//            System.out.printf("\na[%d] = %d:",i,a[i]);
//        }


//         Bài tập 5:viết một chương trình java để chèn một phần tử (vị trí cụ thể) vào một mảng (chưa làm)
            int arr [] = {1, 2, 4, 5};



        // Bài tập 6: viết một chương trình java để tìm giá trị lớn nhất và nhỏ nhất của một mảng

//        int number[] = {23, 25, 8, 66, 68, 89};
//        int min = number[0];
//        int max = number[0];
//        for(int i = 0; i <number.length; i++){
//            if(number[i] < min){
//                min = number[i];
//            }
//            if(number[i] > max){
//                max = number[i];
//            }
//        }
//        System.out.println("Giá trị nhỏ nhất:" + min);
//        System.out.println("Giá trị lơn nhất:" + max);



//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap vao so luong phan tu: n = ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        System.out.println("Nhap vao mang cac so nguyen:");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Phan tu thu " + (i + 1) + " la: ");
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Mang vua nhap la:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + "\t");
//        }
//        int min = a[0];
//        for (int i = 1; i < n; i++) {
//            if (min > a[i]) {
//                min = a[i];
//            }
//        }
//        int max = a[0];
//        for (int i = 1; i < n; i++) {
//            if (max < a[i]) {
//                max = a[i];
//            }
//        }
//        System.out.println("\nPhan tu nho nhat cua mang la:" + min);
//        System.out.println("\nPhan tu lon nhat cua mang la:" + max);

        // Bài 7:viết một chương trình java để đảo ngược một mảng các giá trị số nguyên

//        int j=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số phần tử trong mảng:");
//        int n = sc.nextInt();
//        int array[] = new int[n];
//        int rev[] = new int[n];
//        System.out.println("NHập số "+n+" phần tử ");
//        for( int i=0; i < n; i++)
//        {
//            array[i] = sc.nextInt();
//        }
//        System.out.println("Reverse của 1 mảng là :");
//        for( int i=n;i>0 ; i--,j++)
//        {
//            rev[j] = array[i-1];
//            System.out.println(rev[j]);
//        }


        // Bài  8:viết một chương trình java để tìm các giá trị trùng lặp của một mảng các giá trị chuỗi
//        String str = "w3schools";
//        int cnt = 0;
//        char[] inp = str.toCharArray();
//        System.out.println("Duplicate Characters are:");
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length(); j++) {
//                if (inp[i] == inp[j]) {
//                    System.out.println(inp[j]);
//                    cnt++;
//                    break;
//                }
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập giá của mảng:");
//        int num = sc.nextInt();
//        String arr [] = new String[num];
//        System.out.println("Các giá trị là");
//        for(int k= 0; k< arr.length;k++){
//            arr[k] = sc.next();
//        }
//        for(int i = 0; i < arr.length; i++){
//            for ( int j = i+1; j < arr.length;j++) {
//                if ((arr[i] == arr[j]) && (i != j)) {
//                    System.out.println("Giá trị mảng trùng lặp:" + arr[j]);
//                }
//            }
//        }



        // Bài  8:viết một chương trình java để tìm các giá trị trùng lặp của một mảng các số nguyên
//        int [] arr = { 2, 3, 6, 2, 8, 6};
//        for(int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j< arr.length; j++){
//                if((arr[i] == arr[j]) && (i != j)){
//                    System.out.println("Giá trị trùng lặp là: " + arr[j]);
//                }
//            }
//        }


//            Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập giá của mảng:");
//        int num = sc.nextInt();
//        int arr[] = new int[num];
//        for(int i =0; i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                if ((arr[i]==arr[j])&& (i!=j)){
//                    System.out.println("giá trị trùng lặp là:" + arr[j]);
//                }
//            }
//        }



            //Bài 9: Viết chương trình xóa các phần tử trùng lặp khỏi 1 mảng
//            Scanner sc = new Scanner(System.in);
//        System.out.print("Độ dài của mảng:");
//        int hkt = sc.nextInt();
//        int arr [] = new int [hkt];
//        int ar [] = new int[100];
//        System.out.println("Giá trị của mảng:");
//        for(int k = 0; k < arr.length; k++){
//            arr[k] = sc.nextInt();
//        }
//        System.out.println("Xóa phần tử trùng lặp của mảng:");
//        for(int i =0; i < arr.length; i++){
//            ar[arr[i]]++;
//            if(ar[arr[i]]==1){
//                System.out.println(arr[i]);
//            }
//        }



        // Bài 10: Viết chương trình tìm phần tử lớn thứ 2 trong mảng
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Độ dài của mảng:");
//        int num = sc.nextInt();
//        int arr[] = new int[num];
//        System.out.println("Các giá trị của mảng:");
//        for(int k = 0; k < arr.length;k++){
//            arr[k] = sc.nextInt();
//        }
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i + 1; j < arr.length;j++){
//                if(arr[i] > arr[j]){
//                    arr[i] = arr[j];
//                }
//            }
//        }
//        System.out.println("Phần tử lớn thứ 2 của mảng: " + arr[arr.length-2]);


        //Bài 11: kiểm tra sự bằng nhau của 2 mảng (so sánh từng cặp phần tử của mảng)



        // Bài 12: Tìm tổng số lượng số chẵn và lẻ trong mảng
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Độ dài của mảng:");
//        int num = sc.nextInt();
//        int arr [] = new int[num];
//        int ctr = 0;
//        System.out.println("Các giá trị nhập vào của mảng:");
//        for ( int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        for (int j = 0; j < arr.length;j++){
//            if(arr[j] % 2 == 0)
//                ctr ++;
//        }
//        System.out.println("Số chắn là:" + ctr);
//        System.out.println("Số lẻ là:" + (arr.length -ctr));


        // Bài 13: kiểm tra số nhập vào là số chẵn hay số lẻ
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Số nhập vào là: ");
//        int num = sc.nextInt();
//        if(num%2 == 0){
//            System.out.println("là số chẵn:" + num);
//        }else {
//            System.out.println("là số lẻ:" + num);
//        }



        // Bài 14: Xóa bỏ các phần tử trùng lặp của một mảng và trả về độ dài của mảng mới
//        int max = 0;
//        int max_i =0;
//        int max_j = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Số phần tử của mảng:");
//        int num = sc.nextInt();
//        int arr [] = new int[num];
//        System.out.println("Các giá trị nhập vào:");
//        for(int k = 0; k < arr.length; k++){
//            arr[k] = sc.nextInt();
//        }
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i + 1; j < arr.length;j++){
//                if(max < arr[i]*arr[j]){
//                    max = arr[i]*arr[j];
//                    max_i = i;
//                    max_j = j;
//                }
//            }
//        }
//        System.out.println("Hai số là: ("+ arr[max_i] +"),("+ arr[max_j] +") ");
//        System.out.println("Tích của 2 số là:" + (arr[max_i]*arr[max_j]));



    }
}
