/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class Lingkaran {
    
    //Mendefinisikan atribut
    double phi = 3.14;
    int r;
    
    //Method Void Pertama
    public void hitunglingkaran(){
        //Untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);
        //Proses untuk menghitung luas lingkaran
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("==========================");
        System.out.print("Masukkan Nilai Jari-Jarinya: ");
        r = input.nextInt();
        System.out.println("Hasil Perhitungan Luas Lingkaran Adalah: "+phi*r*r);
    }
        
    }
    

