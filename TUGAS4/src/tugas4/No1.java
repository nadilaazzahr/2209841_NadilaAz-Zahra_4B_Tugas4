/*
Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai dengan
n, dimana n diinput dari alat masukan, n>=1.
*/

package tugas4;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            //Meminta user menginput bilangan bulat
            System.out.println("Masukkan bilangan bulat: ");
            int n = scanner.nextInt();
            int i=1;
            
            while(i<=n){
                System.out.print(i+ " ");
                i++;
            }
        }
    }
    
}
