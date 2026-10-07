import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Shape> daftarBentuk = new ArrayList<>();

        int pilihan = 0;

        System.out.println("=========================================");
        System.out.println("     PROGRAM GEOMETRI SEDERHANA");
        System.out.println("=========================================");

        while (pilihan != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Square");
            System.out.println("2. Tambah Circle");
            System.out.println("3. Tambah Cylinder");
            System.out.println("4. Lihat Semua Bentuk");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();

                    System.out.print("Masukkan warna: ");
                    String warnaSquare = input.next();

                    Shape square = new Square(sisi, warnaSquare);
                    daftarBentuk.add(square);

                    System.out.println("Square berhasil dibuat.");
                    break;

                case 2:
                    System.out.print("Masukkan radius: ");
                    double jari = input.nextDouble();

                    System.out.print("Masukkan warna: ");
                    String warnaCircle = input.next();

                    Shape circle = new Circle(jari, warnaCircle);
                    daftarBentuk.add(circle);

                    System.out.println("Circle berhasil dibuat.");
                    break;

                case 3:
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();

                    System.out.print("Masukkan radius: ");
                    double radius = input.nextDouble();

                    System.out.print("Masukkan warna: ");
                    String warnaCylinder = input.next();

                    Shape cylinder = new Cylinder(tinggi, radius, warnaCylinder);
                    daftarBentuk.add(cylinder);

                    System.out.println("Cylinder berhasil dibuat.");
                    break;

                case 4:
                    System.out.println("\n--- INFORMASI BENTUK ---");

                    if (daftarBentuk.isEmpty()) {
                        System.out.println("Belum ada objek yang dibuat.");
                    } else {
                        for (Shape bentuk : daftarBentuk) {
                            bentuk.printInfo();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        input.close();
    }
}