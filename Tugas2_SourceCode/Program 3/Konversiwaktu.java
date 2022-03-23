/* 13020200006, Fahri M, Rabu 23 Maret 2022 */

import java.util.Scanner;

public class Konversiwaktu {
    
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;
    
            System.out.print("Masukkan Angka Untuk Di Konversi: ");
            totalDetik = input.nextInt();
    
            detikSekarang=totalDetik%60;
            totalMenit=totalDetik/60;
            menitSekarang=totalMenit%60;
            totalJam=totalMenit/60;
            jamSekarang = totalJam%24;
            System.out.println("Konversi Nilai : "+ totalDetik + " Ke Waktu, Adalah : ");
            System.out.println("("+jamSekarang+":"+menitSekarang+":"+detikSekarang+")");	
    }
}