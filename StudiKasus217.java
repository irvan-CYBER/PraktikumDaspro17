import java.util.Scanner;

public class StudiKasus217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data Utama
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        // SK2: cabang lomba
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara: ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int selisih = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + selisih + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
    }
}