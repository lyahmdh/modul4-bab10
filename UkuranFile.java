package OperasiFile;

import java.io.File;

public class UkuranFile {    
    public static void main(String[] args) {
        // Membuat objek File yang menunjuk ke file HTML.txt
        File file = new File("D:\\KULIAH\\Semester 2\\Pemlan\\Tugas Praktikum\\OperasiFile\\HTML.txt"); 

        // Mengecek apakah file tersebut benar-benar ada
        if (file.exists()) {
            // Mengambil ukuran file dalam satuan byte
            long sizeInBytes = file.length();

            // Jika ukuran file kurang dari 1 MB
            if (sizeInBytes < 1024 * 1024) {
                // Konversi dari byte ke kilobyte (1 KB = 1024 byte)
                double sizeInKB = sizeInBytes / 1024.0;
                // Menampilkan ukuran file dalam satuan KB dengan dua angka di belakang koma
                System.out.printf("Ukuran file: %.2f KB%n", sizeInKB);
            } else {
                // Jika ukuran file 1 MB atau lebih, konversi ke megabyte (1 MB = 1024 * 1024 byte)
                double sizeInMB = sizeInBytes / (1024.0 * 1024.0);
                // Menampilkan ukuran file dalam satuan MB dengan dua angka di belakang koma
                System.out.printf("Ukuran file: %.2f MB%n", sizeInMB);
            }
        } else {
            // Jika file tidak ditemukan, tampilkan pesan kesalahan
            System.out.println("File tidak ditemukan.");
        }
    }
}