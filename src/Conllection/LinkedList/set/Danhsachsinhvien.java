package Conllection.LinkedList.set;
//Bài tập: tạo mảng sinh viên, dùng array-list (tạo Student dùng constructor)
//những sinh viên cùng id không được thêm vào mảng
//so sánh 2 sinh viên với nhau, in ra sinh viên lớn tuổi hơn

import java.util.ArrayList;

public class Danhsachsinhvien {
    private ArrayList<Student> danhSach;
    public Danhsachsinhvien() {
        this.danhSach = new ArrayList<Student>();
    }
    public Danhsachsinhvien(ArrayList<Student> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSinhVien(Student sv) {
    }
}
