import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========LOMBA PROSENI========");
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); 
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};

        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.print("\nMasukkan nama politeknik ke-" + (i + 1) + ": ");
            String namaPoliteknik = sc.nextLine();

            System.out.println("Politeknik: " + namaPoliteknik);

            for (String cabor : cabangOlahraga) {
                System.out.println("Cabang Olahraga: " + cabor);
                for (int j = 0; j < 5; j++) {
                    System.out.print("Nama atlet ke-" + (j + 1) + ": ");
                    String namaAtlet = sc.nextLine();
                    System.out.println(" - " + namaAtlet); // Langsung ditampilkan
                }
            }
        }
    }
}
