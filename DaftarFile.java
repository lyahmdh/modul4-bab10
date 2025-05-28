package OperasiFile;

import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        // Membuat objek File yang menunjuk ke direktori tertentu
        // Pastikan path sesuai dengan lokasi folder yang ingin diakses
        File folder = new File("D:/KULIAH/Semester 2/Pemlan/Tugas Praktikum/OperasiFile/ini-daftar-file");

        // Mengecek apakah folder tersebut ada dan merupakan sebuah direktori
        if (folder.exists() && folder.isDirectory()) {
            // Mengambil daftar file dan folder yang ada di dalam direktori
            File[] daftarFile = folder.listFiles();

            System.out.println("Daftar file di dalam folder:");

            // Melakukan iterasi terhadap semua item dalam folder
            for (int i = 0; i < daftarFile.length; i++) {
                File file = daftarFile[i];
                
                // Menampilkan nama file (bukan folder)
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }            
        } else {
            // Menampilkan pesan jika folder tidak ditemukan atau bukan direktori
            System.out.println("Folder tidak ditemukan atau bukan direktori.");
        }
    }
}
