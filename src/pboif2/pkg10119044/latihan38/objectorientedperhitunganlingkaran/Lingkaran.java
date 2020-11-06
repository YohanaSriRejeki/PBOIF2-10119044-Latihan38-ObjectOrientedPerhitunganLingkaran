/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan38.objectorientedperhitunganlingkaran;
import java.util.InputMismatchException;
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
class Lingkaran {
    public double diameter;
    public final double PHI = 3.14;
    
    Scanner sc = new Scanner(System.in);
 
    public double cekDiameter(){
        while (true) {
           try{
            return sc.nextInt();
           }
           catch (InputMismatchException ex){
            sc.next();
            System.out.println("Nilai diameter tidak sesuai");
            System.out.println();
            System.out.print("Masukkan nilai diameter lingkaran : ");
            }     
        }     
    }
    
    public double hitungJariJari(){
        int jari = (int) (diameter/2);
        
        return jari;
    }
    
    public double hitungLuas(){
        double luas;
        
        luas = PHI*1/4*diameter*diameter;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling;
 
        keliling = PHI*diameter;
        return keliling;
    }
}
