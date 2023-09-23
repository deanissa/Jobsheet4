import java.util.Scanner;
public class HargaBayar06 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        int harga, jumlah, jumlahHal;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan Merk buku yang dibeli ");
        String merk=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku ");
        jumlahHal=input.nextInt();
        System.out.println("Masukkan harga yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan diskon harga ");
        dis=input.nextInt();
        System.out.println("Masukkan jumlah-jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total= harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        
        System.out.println("Merk Buku " +merk);
        System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);
    }
}
