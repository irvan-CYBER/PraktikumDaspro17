import java.uril.Scanner;
 public class StudiKasus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEKLARASI VARIABEL
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        
        System.out.println("=== Program Penjualan Es Kopi Susu ===");
        System.out.println("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt ();
        totalHarga = hargaPerCup * jumlahCup;
        System.out.println("Total Harga: " + totalHarga);
    }
 }