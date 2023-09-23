import java.util.Scanner;
public class gaji6 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;


        System.out.println("Masukkan gaji anda");
        gaji=input.nextInt();
        System.out.println("Masukkan potongan gaji anda");
        potGaji=input.nextInt();
        System.out.println("Masukkan jumlah hari kerja masuk anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan jumlah hari kerja tidak masuk anda");
        JmlTdkMasuk=input.nextInt();
        


        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk-potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
}
