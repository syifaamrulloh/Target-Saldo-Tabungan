/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan20.target.saldo.tabungan;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program Target Saldo Tabungan dengan bunga 8%
 */
public class PBO11K10118910Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void target_tabungan(){
    int sld =3500000,
        i=1;
    double bunga;
        do {            
            bunga = sld*0.08;
            sld = (int)(sld + bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,10d%n",sld);
            i++;
        } while (sld <= 6000000);
    }
    public static void main(String[] args) {
        target_tabungan();
        
    }
    
}
