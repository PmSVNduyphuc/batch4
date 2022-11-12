package com.example.batch4;

public class ThamTri {
    //Truyền Tham Trị
    public static void swap(int n1, int n2) {
        System.out.println("\tGia tri cac bien ben trong ham swap");
        System.out.println("\t\tTruoc khi swap, n1 = " + n1 + " va n2 = " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tSau khi swap, n1 = " + n1 + " va n2 = " + n2);
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Truoc khi goi ham swap, num1 = " + num1 + " va num2 = " + num2);
        swap(num1, num2);//Giá trị chỉ thay đổi ở đoạn phương thức swap khi bị gọi đến
        //Hết phương thức giá trị quay trở lại lúc đầu
        System.out.println("Sau khi goi ham swap, num1 = " + num1 + " va num2 = " + num2);
    }
}