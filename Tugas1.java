import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        for (int i = 0; i < N - 2; i++) {
            System.out.print(N + " ");
            for (int j = 0; j < N - 2; j++) {
                System.out.print("  ");
            }
            System.out.print(N);
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
    }
}
