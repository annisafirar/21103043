
package UTSPBO_NO3_SI05B_3043;

public class Asprak_3043 extends Mahasiswa_3043 {
    String mkAsisten;
    int jmlPertemuan;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void Tampil_DataAsprak() {
        super.Tampil_Data_Mahasiswa();
        System.out.println(" Mata Kuliah    : " + mkAsisten);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan);
        System.out.println(" Total Pendapatan : " + totalPendapatan());
        
        
    }
    
}
