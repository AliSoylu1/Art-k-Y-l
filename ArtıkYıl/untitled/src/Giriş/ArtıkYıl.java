package Giriş;

import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int year;

        System.out.println("Yıl: ");
        year = input.nextInt();

        if ((year % 100 == 0) && (year % 400 != 0)) {
            System.out.println("Artık Yıl Değildir.");
        } else if (year % 4 == 0) {
            System.out.println("Artık Yıldır.");


        } else {
            System.out.println("Artık Yıl Değil.");
        }
    }
}

