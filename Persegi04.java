import java.util.Scanner;

public class Persegi04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N untuk persegi pertama (minimal 3): ");
        int N1 = sc.nextInt();

        if (N1 < 3) {
            System.out.println("Nilai N untuk persegi pertama harus minimal 3.");
            return; 
        }
        System.out.print("Masukkan nilai N untuk persegi kedua (minimal 3): ");
        int N2 = sc.nextInt();
        if (N2 < 3) {
            System.out.println("Nilai N untuk persegi kedua harus minimal 3.");
            return;
        }
        System.out.print("Masukkan angka untuk persegi pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka untuk persegi kedua: ");
        int angka2 = sc.nextInt();

        for (int i = 1; i <= Math.max(N1, N2); i++) {
            for (int j = 1; j <= N1; j++) {
                if (i <= N1) { 
                    if (i == 1 || i == N1 || j == 1 || j == N1) {
                        System.out.print(angka1 + " ");
                    } else {
                        System.out.print("  "); 
                    }
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.print("    "); 
            for (int j = 1; j <= N2; j++) {
                if (i <= N2) { 
                    if (i == 1 || i == N2 || j == 1 || j == N2) {
                        System.out.print(angka2 + " "); 
                    } else {
                        System.out.print("  "); 
                    }
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
        sc.close();
    }
}