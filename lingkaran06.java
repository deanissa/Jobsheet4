/**
 * lingkaran06
 */

 import java.util.Scanner;
public class lingkaran06 {
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);

        int r;
        double keliling, luas, phi=3.14;

        System.out.println ("Masukkan jari jari lingkaran :");
        r=input.nextInt();
        keliling= 2*phi*r;
        luas= phi*r*r;

        System.out.println("Hasil Keliling :" + keliling);
        System.out.println("Hasil Luas :" + luas);
    }

    
}