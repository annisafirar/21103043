
package UTSPBO_NO2_SI05B_3043;

public class CommissionEmploy_3043 extends Employ_3043{
public float Komisi;
    public float TotalPenjualan;
    public float Total_gaji;
    
    public CommissionEmploy_3043(){
        
    }
    
    public float TotalGaji(){
        Total_gaji = Gaji_Pokok + (Komisi * TotalPenjualan);
        return Total_gaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Total_gaji);
    }
}
