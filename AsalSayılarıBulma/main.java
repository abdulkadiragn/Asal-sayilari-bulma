package AsalSayılarıBulma;

import java.util.Scanner;

public class main {
    public static boolean asalMi(int sayi){

        for(int i = 2; i<sayi;i++){

            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz. Bu program girdiginiz sayıdan önce bulunan bütün asal sayıları ekrana yazdıracaktır.");
        int girilenSayi = scanner.nextInt();
        for(int i = 2; i < girilenSayi; i++){

            if(asalMi(i)){
                System.out.println(i);
            }
        }
    }
}
