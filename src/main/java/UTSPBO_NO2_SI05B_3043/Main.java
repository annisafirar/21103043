
package UTSPBO_NO2_SI05B_3043;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
      public static void main(String[] args) {
        salarieemploy_3043 x = new salarieemploy_3043();
        CommissionEmploy_3043 y = new CommissionEmploy_3043();
        projekplaner_3043 z = new projekplaner_3043();
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data pegawai");
            System.out.print("Nama: ");
            x.Name = a.readLine();
            System.out.print("NIP: ");
            x.NIP = a.readLine();
            System.out.print("Gaji pokok: ");
            x.Gaji_Pokok = Float.parseFloat(a.readLine());
            x.TampilData();
            
            System.out.print("Nama: ");
            y.Name = a.readLine();
            System.out.print("NIP: ");
            y.NIP = a.readLine();
            System.out.print("GajiPokok: ");
            y.Gaji_Pokok = Float.parseFloat(a.readLine());
            System.out.print("Komisi: ");
            y.Komisi = Float.parseFloat(a.readLine());
            System.out.print("Total Penjualan: ");
            y.TotalPenjualan = Float.parseFloat(a.readLine());
            y.TotalGaji();
            y.TampilData();
            
            System.out.print("Nama: ");
            z.Name = a.readLine();
            System.out.print("NIP: ");
            z.NIP = a.readLine();
            System.out.print("Gaji Pokok: ");
            z.Gaji_Pokok = Float.parseFloat(a.readLine());
            System.out.print("Komisi: ");
            z.Komisi = Float.parseFloat(a.readLine());
            System.out.print("Total Hasil Proyek: ");
            z.Total_HAsil_Proyek = Float.parseFloat(a.readLine());
            z.TotalGaji();
            z.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
  

