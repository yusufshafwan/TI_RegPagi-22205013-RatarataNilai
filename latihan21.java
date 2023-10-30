/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class latihan21 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyak nilai mahasiswa: ");
        int banyakNilaimahasiswa = scanner.nextInt();

        // Inisialisasi variabel untuk menyimpan total nilai
        double totalNilai = 0;

        // Loop untuk memasukkan nilai sebanyak yang diinginkan pengguna
        for (int i = 1; i <= banyakNilaimahasiswa; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            double nilai = scanner.nextDouble();

            // Menambahkan nilai ke total
            totalNilai += nilai;
        }

        // Menghitung rata-rata
        double rataRata = totalNilai / banyakNilaimahasiswa;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");
        // Menutup scanner
        scanner.close();
    }
    
}  

