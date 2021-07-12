package main;

import bilanganoperasibanyak.BilanganOperasi;
import nilaimahasiswa.NilaiMahasiswa;
import programku.ProgramKu;
import suhu.KonversiSuhu;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = "Syahrul Al-Rasyid";
        String nim = "191011400371";
        String kelas = "04TPLE007";

        // Konversi suhu
        JFrame suhu = new KonversiSuhu();
        suhu.setVisible(true);

        // Program Ku
        JFrame programKu = new ProgramKu();
        programKu.setVisible(true);

        // Perjumlahan 2 bilangan dengan banyak operasi
        JFrame opts = new BilanganOperasi();
        opts.setVisible(true);

        // GUI nilai mahasiswa
        JFrame nilaiMahasiswa = new NilaiMahasiswa();
        nilaiMahasiswa.setVisible(true);
    }
}
