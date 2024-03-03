/*
Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.
 */
package tugas4;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            
            //Menerima tiga sisi dari pengguna
            System.out.println("Masukkan panjang sisi ke-1:");
            double sisi1 = scanner.nextDouble();

            System.out.println("Masukkan panjang sisi ke-2:");
            double sisi2 = scanner.nextDouble();

            System.out.println("Masukkan panjang sisi ke-3:");
            double sisi3 = scanner.nextDouble();

            //Periksa apakah semua sisi sama
            if (sisi1 == sisi2 && sisi2 == sisi3) {
                //Jika semua sisi sama, tampilkan "Termasuk Kubus"
                System.out.println("Termasuk Kubus");
            } else {
                //Jika ada sisi yang tidak sama, tampilkan "Bukan Kubus"
                System.out.println("Bukan Kubus");
            }
        }
    }
    
}
