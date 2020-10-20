/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;
import java.util.Scanner;2
/**
 *
 * @author ASUS
 */
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a1; //angka1
        int a2; //angka2
        int hasil;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input angkaa-1: ");
        a1 = input.nextInt();
        System.out.print("Input angkaa-2: ");
        a2 = input.nextInt()
        
        //PENJUMLAHAN
        hasil = a1 + a2;
        System.out.println("Hasil Penjumlahan: "+hasil);
        
        System.out.print("Input angkaa-1: ");
        a1 = input.nextInt();
        System.out.print("Input angkaa-2: ");
        a2 = input.nextInt();
        
        //PENGURANGAN
        hasil = a1 - a2;
        System.out.println("Hasil Pengurangan: "+hasil);
        
        System.out.print("Input angkaa-1: ");
        a1 = input.nextInt();
        System.out.print("Input angkaa-2: ");
        a2 = input.nextInt();
        
        //PERKALIAN
        hasil = a1 * a2;
        System.out.println("Hasil Perkalian: "+hasil);
        
        System.out.print("Input angkaa-1: ");
        a1 = input.nextInt();
        System.out.print("Input angkaa-2: ");
        a2 = input.nextInt();
        
        //PEMBAGIAN
        hasil = a1 / a2;
        System.out.println("Hasil Pembagian: "+hasil);
        
        System.out.print("Input angkaa-1: ");
        a1 = input.nextInt();
        System.out.print("Input angkaa-2: ");
        a2 = input.nextInt();
        
        //SISA BAGI /MODULO
        hasil = a1 % a2;
        System.out.println("Hasil Modulo/sisa bagi: "+hasil);
    }
    
}
