/* 13020200006, Fahri M, Rabu 23 Maret 2022 */
import java.util.Scanner;

/* Membaca Integer Dengan Class Scanner*/
public class BacaData {
    
    /**
    * @param args
    */
    public static void main(String[] args) {
     // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* Coba Ketik : masukan.nextInt();
        Apa perubahannya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}