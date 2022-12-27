
package UTSPBO_NO2_SI05B_3043;


public class projekplaner_3043 extends Employ_3043 {

    public float Komisi;
    public float Total_HAsil_Proyek;
    public double Total_Gaji;

    public projekplaner_3043() {

    }
       public double TotalGaji(){
        Total_Gaji = Gaji_Pokok + (Komisi * Total_HAsil_Proyek) - (Gaji_Pokok*5/100);
        return Total_Gaji;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Total_Gaji);
    }
}
 
