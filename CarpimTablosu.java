package Exercise;

import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaclarin carpimini istiyorsunuz");
        int sayi=scan.nextInt();
        System.out.println("Sayinin kaca kadar carpimini istediginizi girin");
        int carpimEnd=scan.nextInt();
        for(int i=0; i<=carpimEnd; i++){
            System.out.println(sayi+"(*)"+i+"(=)"+sayi*i);
        }

    }
}
