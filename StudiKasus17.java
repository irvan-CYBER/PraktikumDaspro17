import java.util.Scanner;
 public class StudiKasus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SK1: input dan deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt ();
        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        System.out.println("Total Harga: " + totalHarga);