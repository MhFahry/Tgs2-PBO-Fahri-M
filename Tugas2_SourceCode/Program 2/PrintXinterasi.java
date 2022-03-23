/* 13020200006, Fahri M, Rabu 23 Maret 2022 */
import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {

     /**
      * @param args
      */
     public static void main(String[] args) {
           // TODO Auto-generated method stub
           /* Kamus : */
           int Sum=0;
           int x;
           Scanner masukan=new Scanner(System.in);
           /* Program */
           System.out.print ("Masukkan nilai x (int), akhiri dengan 000 : ");
           x = masukan.nextInt(); /* First Elmt */
           if (x == 999){
                 System.out.print ("Kasus kosong \n");

           }else{     
                  /* MInimal ada satu data yang dijumlahkan*/
                 Sum = x; /* Inisialisasi; invariant !! */
                 for (;;){
                       System.out.print ("Masukkan nilai x (int), akhiri dengan 000 : ");
                       x = masukan.nextInt(); /* Next Elmt */
                       if(x==000) 
                             break;
                       else{
                             Sum = Sum + x; /* Proses */
                       }
                 }
           }
           System.out.println("Hasil penjumlahan = "+ Sum);
     /* Terminasi */
     }
}