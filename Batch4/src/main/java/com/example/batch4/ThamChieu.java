package com.example.batch4;

public class ThamChieu {
    int data;
    ThamChieu(int dataValue){
        data = dataValue;
    }
    //Truyền tham chiếu
    public static void swap(ThamChieu n1, ThamChieu n2) {
        System.out.println("\tGia tri cac bien ben trong ham swap");
        System.out.println("\t\tTruoc khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        // Swap n1.data with n2.data
        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
        System.out.println("\t\tSau khi swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
    public static void main(String[] args) {
        ThamChieu n1 = new ThamChieu(1);
        ThamChieu n2 = new ThamChieu(2);
        System.out.println("Truoc khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
        swap(n1, n2);//địa chỉ của n1 và n2 đã thay đổi nên
        System.out.println("Sau khi goi ham swap, n1.data = " + n1.data + " va n2.data = " + n2.data);
    }
}
