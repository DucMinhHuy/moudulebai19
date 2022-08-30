package baitap2;

import java.util.Scanner;

public class PhoneNumber {
    public static final String[]Value={};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  num=sc.nextLine();
        Number number=new Number();
        if(number.check(num)){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
    }
}
