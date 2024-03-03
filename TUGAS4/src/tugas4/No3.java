/*
Buatlah algoritma dalam bahasa Java, yang membaca panjang (integer) tiga buah sisi
sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <= c, lalu menentuka apakah
ketiga sisi tersebut membentuk segitiga siku – siku, segitiga lancip, atau segitiga
tumpul (Petunjuk gunakan hukum Phytagoras).
 */
package tugas4;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Menerima panjang tiga sisi sebuah segitiga
        System.out.println("Masukkan panjang sisi a:");
        int a = scanner.nextInt();

        System.out.println("Masukkan panjang sisi b:");
        int b = scanner.nextInt();

        System.out.println("Masukkan panjang sisi c:");
        int c = scanner.nextInt();

        //Hitung nilai a^2, b^2, dan c^2
        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = c * c;

        //Periksa jenis segitiga berdasarkan hukum Pythagoras
        if (aSquared + bSquared == cSquared) {
            //Segitiga siku-siku
            System.out.println("Segitiga siku-siku");
        } else if (aSquared + bSquared < cSquared) {
            //Segitiga lancip
            System.out.println("Segitiga lancip");
        } else {
            //Segitiga tumpul
            System.out.println("Segitiga tumpul");
        }

        //Selesai
        scanner.close();
    }
}
