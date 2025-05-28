package OperasiFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile1 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        
        // Meminta user untuk memasukkan teks yang ingin disimpan
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();
        
        // Menuliskan teks ke dalam file "test.txt"
        // Parameter kedua (true) berarti mode append, yaitu menambahkan ke akhir file tanpa menimpa isi sebelumnya
        try (var writer = new FileWriter("D:\\KULIAH\\Semester 2\\Pemlan\\Tugas Praktikum\\OperasiFile\\test.txt", true)) {
            writer.write(text); // Menulis teks ke file
        } catch (IOException e) {
            // Menangani jika terjadi kesalahan saat menulis ke file
            System.err.println("Gagal menulis ke file");
        }
    }
}