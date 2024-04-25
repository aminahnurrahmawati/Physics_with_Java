import java.util.Scanner;
public class rumus_fisika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan pilihan rumus (A/ B/ C) : A (Kecepatan GLB), B (Kecepatan GLBB), C(Jarak GLBB)");

        String pilihan = input.nextLine();

        if (pilihan.equals('A')){
            System.out.println("Anda memilih rumus Kecepatan GLB");
            Kec_GLB();
        } else if  (pilihan.equals('B')){
            System.out.println("Anda memilih rumus Kecepatan GLBB");
            Kec_GLBB();
        } else {
            System.out.println("Anda memilih rumus Jarak GLBB");
            jarak_GLBB();
        }
        input.close();
    }

public static void Kec_GLB(){
    Scanner scanner = new Scanner(System.in);
    System.err.println("Masukkan Jarak");
    double jarak = scanner.nextDouble();
    System.err.println("Masukkan Waktu");
    double waktu = scanner.nextDouble();
    double Kecepatan_akhir = jarak/waktu;
    System.out.println("Jarak yang ditempuh adalah :" + Kecepatan_akhir + "m/s");
    scanner.close();

}

public static void Kec_GLBB(){
    Scanner scanner = new Scanner(System.in);
    System.err.println("Masukkan Kecepatan awal");
    double kec_awal = scanner.nextDouble();
    System.err.println("Masukkan Waktu");
    double waktu = scanner.nextDouble();
    System.out.println("Masukkan Percepatan");
    double percepatan = scanner.nextDouble();
    double Kecepatan_akhir =kec_awal + (percepatan *waktu);
    System.out.println("Kecepatan GLBB adalah :" + Kecepatan_akhir + "m/s");
    scanner.close();
}

public static void jarak_GLBB(){
    Scanner scanner = new Scanner(System.in);
    System.err.println("Masukkan Kecepatan awal");
    double kec_awal = scanner.nextDouble();
    System.err.println("Masukkan Waktu");
    double waktu = scanner.nextDouble();
    System.out.println("Masukkan Percepatan");
    double percepatan = scanner.nextDouble();
    double jarak_akhir = (kec_awal * waktu) + (0.5 * percepatan * Math.pow(waktu, 2));
    System.out.println("Jarak GLBB adalah :" + jarak_akhir + "m/s");
    scanner.close();
}

}
