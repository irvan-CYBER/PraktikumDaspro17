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

        //SK2: proses perhitungan diskon
        if (totalHarga >= 100000) {
            diskon = hargaPerCup * jumlahCup * 10/100;
        } else if (totalHarga >= 50000) {
            diskon = hargaPerCup * jumlahCup * 5/100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup. Kurang: " + kurang);
        }   
    }
 }