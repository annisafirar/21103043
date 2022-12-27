
package UTSPBO_NO3_SI05B_3043;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        
   
        Asprak_3043[] k = new Asprak_3043[1];
        Student_staff[] q = new Student_staff[1];
        
        k[0] = new Asprak_3043();
        q[0] = new Student_staff();

      
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
         
        try {

            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                k[i].nim = x.readLine();
                System.out.print("Nama             : ");
                k[i].nama = x.readLine();
                System.out.print("Jurusan          : ");
                k[i].jurusan =x.readLine();
                System.out.print("IPK              : ");
                k[i].ipk =Integer.parseInt(x.readLine());
                System.out.print("Mata Kuliah      : ");
                k[i].mkAsisten = x.readLine();
                System.out.print("Jumlah Pertemuan : ");
                k[i].jmlPertemuan = Integer.parseInt(x.readLine());
                System.out.println();
            }
            
           
            System.out.println("Data Asisten Praktikum");
            for(Asprak_3043 K : k){
                K.Tampil_DataAsprak();
                System.out.println("");
            }


            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                q[i].nim = x.readLine();
                System.out.print("Nama        : ");
                q[i].nama = x.readLine();
                System.out.print("Jurusan     : ");
                q[i].jurusan =x.readLine();
                System.out.print("IPK         : ");
                q[i].ipk =Integer.parseInt(x.readLine());
                System.out.print(" Unit Kerja : ");
                q[i].unitKerja = Integer.parseInt(x.readLine());
                System.out.print("Jam Kerja   : ");
                q[i].jamKerja = Integer.parseInt(x.readLine());
                System.out.println();
            }
            

            System.out.println("Data Student Staff");
            for(Student_staff Q : q){
                Q.tampilDataStudentStaff();
                System.out.println("");
            }
        } 
        catch (Exception ex){ 
            System.out.println(ex);
        }
        
    }
}
