Ini adalah repository pertama saya
Nama    : MOHAMMAD IRVANSYAH ANDI PRATAMA SAPUTRA
NIM     : 264107060007
Kelas   : SIB-1A


        //SK1: logika diskon dan kembalian
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