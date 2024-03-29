import java.util.Scanner;

class JumlahHari2 {
    public int hitungHari(int tahun, int bulan) {
        int jumlahHari = 0;

        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jumlahHari = 31;
                break;
            case 4: case 6: case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                System.out.println("Bulan tidak valid.");
        }

        return jumlahHari;
    }
}

class JumlahHari2Beraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JumlahHari2 jumlahHari2 = new JumlahHari2();

        System.out.print("Masukkan tahun: ");
        int tahun = 0;
        while (!scanner.hasNextInt()) {
            System.out.print("Masukkan tahun dalam bentuk angka: ");
            scanner.next();
        }
        tahun = scanner.nextInt();

        System.out.print("Masukkan bulan: ");
        int bulan = 0;
        while (!scanner.hasNextInt()) {
            System.out.print("Masukkan bulan dalam bentuk angka: ");
            scanner.next();
        }
        bulan = scanner.nextInt();

        if (bulan < 1 || bulan > 12) {
            System.out.println("Bulan tidak valid.");
        } else {
            int jumlahHari = jumlahHari2.hitungHari(tahun, bulan);
            System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah " + jumlahHari + " hari.");
        }

        scanner.close();
    }
}
