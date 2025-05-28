package OperasiFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna melalui keyboard
        var keyboard = new Scanner(System.in);
        
        // Meminta input teks dari pengguna
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine(); // Membaca satu baris teks dari input
        
        // Menulis teks ke dalam file "test.txt"
        // Parameter kedua (false) berarti menimpa isi file (overwrite), bukan menambahkan
        try (var writer = new FileWriter("D:\\KULIAH\\Semester 2\\Pemlan\\Tugas Praktikum\\OperasiFile\\test.txt", false)) {
            writer.write(text); // Menulis teks ke file
        } catch (IOException e) {
            // Menampilkan pesan kesalahan jika proses penulisan gagal
            System.err.println("Gagal menulis ke file");
        }
    }
}
