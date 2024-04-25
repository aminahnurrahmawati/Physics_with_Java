import java.util.Scanner;

public class resistansi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah resistor: ");
        int jumlahResistor = scanner.nextInt();

        // Array untuk menyimpan nilai resistansi masing-masing resistor
        double[] resistansi = new double[jumlahResistor];

        // Meminta pengguna untuk memasukkan nilai resistansi untuk setiap resistor
        for (int i = 0; i < jumlahResistor; i++) {
            System.out.print("Masukkan nilai resistansi resistor ke-" + (i + 1) + ": ");
            resistansi[i] = scanner.nextDouble();
        }

        // Membersihkan buffer
        scanner.nextLine();

        System.out.println("Pilihlah Jenis Rangkaian");
        String pilihan = scanner.next();

        if (pilihan.equalsIgnoreCase("Seri")) {
            System.out.println("Anda memilih Rangkaian seri");
            // Menghitung resistansi total
            double resistansiTotalSeri = hitungResistansiTotalSeri(resistansi);
            // Menampilkan resistansi total
            System.out.println("Resistansi total dari rangkaian resistor seri adalah: " + resistansiTotalSeri + " ohm");
        } else if (pilihan.equalsIgnoreCase("Paralel")) {
            System.out.println("Anda memilih Rangkaian Paralel");
            double resistansiTotalParalel = hitungResistansiParalel(resistansi);
            System.out.println("Resistansi total dari rangkaian resistor paralel adalah: " + resistansiTotalParalel + " ohm");
        }
        scanner.close();
    }

    // Fungsi untuk menghitung resistansi total dari rangkaian resistor seri
    public static double hitungResistansiTotalSeri(double[] resistansi) {
        double resistansiTotal = 0;

        // Menjumlahkan nilai resistansi dari masing-masing resistor
        for (int i = 0; i < resistansi.length; i++) {
            resistansiTotal += resistansi[i];
        }

        return resistansiTotal;
    }

    // Fungsi untuk menghitung resistansi total dari rangkaian resistor paralel
    public static double hitungResistansiParalel(double[] resistansi) {
        double inversResistansiTotal = 0;

        // Menghitung invers dari resistansi total (jumlah invers dari setiap resistansi)
        for (int i = 0; i < resistansi.length; i++) {
            inversResistansiTotal += 1.0 / resistansi[i];
        }

        // Resistansi total adalah invers dari invers dari resistansi total
        return 1.0 / inversResistansiTotal;
    }
}
