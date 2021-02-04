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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //object
        Lingkaran luas = new Lingkaran();
        Persegi bangun = new Persegi();
        
        //Mendeklarasikan Variabel
        int kode;
        String nama_perhitungan;
        //Untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);
        //Perintah untuk mengeluarkan output program
        //User memasukkan nilai variabel
        System.out.print("Masukkan Kode Perhitungan [1...2]:");
        kode = input.nextInt();
        //Menentukan Pilihan Dengan Menggunakan Percabangan
        switch(kode)
        {
            case 1:
                luas.hitunglingkaran();
            break;
            case 2:
                bangun.hitungpersegi();
            break;
            default:
                nama_perhitungan = "Anda Salah Memasukkan Kode";
            break;
        }
        
        
        
        
        
        
                
    }

    
    

    
    
}
