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
public class Persegi {
    
    //Mendefinisikan atribut
    int s;
    
    //Method Void Kedua
    public void hitungpersegi(){
        //Untuk mengambil input dari keyboard
        Scanner input = new Scanner (System.in);
        //Proses untuk menghitung luas Persegi
        System.out.println("Perhitungan Luas Persegi");
        System.out.println("========================");
        System.out.print("Masukkan Nilai Sisisnya: ");
        s = input.nextInt();
        System.out.println("Hasil Perhitungan Luas Persegi Adalah: "+s*s);
    }
    
}
