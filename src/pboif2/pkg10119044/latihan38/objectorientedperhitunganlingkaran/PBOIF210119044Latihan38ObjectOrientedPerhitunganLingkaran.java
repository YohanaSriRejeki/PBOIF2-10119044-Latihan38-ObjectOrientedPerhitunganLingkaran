/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan38.objectorientedperhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil perhitungan
 * lingkaran, dengan diameter yang dimasukkan oleh user dengan metode object oriented
 */
public class PBOIF210119044Latihan38ObjectOrientedPerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran ling = new Lingkaran();
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");  
        ling.diameter = ling.cekDiameter();
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran : "+ling.hitungJariJari()+" cm");
        System.out.println("Luas Lingkaran : "+ ling.hitungLuas()+" cm");
        System.out.println("Keliling Lingkaran : "+ling.hitungKeliling()+" cm");
    }
}
