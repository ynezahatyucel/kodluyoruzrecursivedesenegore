package Giris;

import java.util.Scanner;

public class odevDesenegore {
    static int azalt(int x){
        if (x<=0)
            return x;
        else{
            System.out.print(x+" ");
            return azalt(x-5);
        }
    }
    static int arttır(int n1, int n2){
        if (n1>=n2)
            return n1;
        else{
            System.out.print(n1+" ");
            return arttır(n1+5,n2);
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n=input.nextInt();
        System.out.println(arttır(azalt(n),n));

    }
}
