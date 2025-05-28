package OperasiFile;

import java.io.File;

public class HapusFile {
    public static void main(String[] args) {
        // Membuat objek File yang menunjuk ke folder yang akan dihapus
        // Hati-hati: pastikan path benar karena semua file di dalam folder akan dihapus
        File folder = new File("D:/KULIAH/Semester 2/Pemlan/Tugas Praktikum/OperasiFile/ini-dihapus");

        // Mengecek apakah folder ada dan merupakan direktori
        if (folder.exists() && folder.isDirectory()) {
            // Mengambil semua file dan folder di dalam folder tersebut
            File[] fileDiDalam = folder.listFiles();

            // Menghapus semua file di dalam folder (tidak termasuk subfolder)
            for (File file : fileDiDalam) {
                if (file.isFile()) {
                    file.delete(); // Menghapus file
                }
            }

            // Menghapus folder utama setelah file di dalamnya terhapus
            if (folder.delete()) {
                System.out.println("Folder dan semua file di dalamnya berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus folder. Pastikan folder kosong dan tidak digunakan.");
            }
        } else {
            // Menampilkan pesan jika folder tidak ditemukan atau bukan direktori
            System.out.println("Folder tidak ditemukan atau bukan direktori.");
        }
    }
}
