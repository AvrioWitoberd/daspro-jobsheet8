import java.util.Scanner;

public class Porseni04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cabor1 = "Badminton";
        String cabor2 = "Tenis Meja";
        String cabor3 = "Basket";
        String cabor4 = "Bola Voli";

        String atlet1_badminton = "", atlet2_badminton = "", atlet3_badminton = "", atlet4_badminton = "", atlet5_badminton = "";
        String atlet1_tenis = "", atlet2_tenis = "", atlet3_tenis = "", atlet4_tenis = "", atlet5_tenis = "";
        String atlet1_basket = "", atlet2_basket = "", atlet3_basket = "", atlet4_basket = "", atlet5_basket = "";
        String atlet1_voli = "", atlet2_voli = "", atlet3_voli = "", atlet4_voli = "", atlet5_voli = "";

        System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabor1 + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Atlet ke-" + i + ": ");
            switch (i) {
                case 1: atlet1_badminton = sc.nextLine(); break;
                case 2: atlet2_badminton = sc.nextLine(); break;
                case 3: atlet3_badminton = sc.nextLine(); break;
                case 4: atlet4_badminton = sc.nextLine(); break;
                case 5: atlet5_badminton = sc.nextLine(); break;
            }
        }

        System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabor2 + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Atlet ke-" + i + ": ");
            switch (i) {
                case 1: atlet1_tenis = sc.nextLine(); break;
                case 2: atlet2_tenis = sc.nextLine(); break;
                case 3: atlet3_tenis = sc.nextLine(); break;
                case 4: atlet4_tenis = sc.nextLine(); break;
                case 5: atlet5_tenis = sc.nextLine(); break;
            }
        }

        System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabor3 + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Atlet ke-" + i + ": ");
            switch (i) {
                case 1: atlet1_basket = sc.nextLine(); break;
                case 2: atlet2_basket = sc.nextLine(); break;
                case 3: atlet3_basket = sc.nextLine(); break;
                case 4: atlet4_basket = sc.nextLine(); break;
                case 5: atlet5_basket = sc.nextLine(); break;
            }
        }

        System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabor4 + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Atlet ke-" + i + ": ");
            switch (i) {
                case 1: atlet1_voli = sc.nextLine(); break;
                case 2: atlet2_voli = sc.nextLine(); break;
                case 3: atlet3_voli = sc.nextLine(); break;
                case 4: atlet4_voli = sc.nextLine(); break;
                case 5: atlet5_voli = sc.nextLine(); break;
            }
        }

        System.out.println("\nInformasi Nama Atlet:");
        System.out.println("Cabang Olahraga: " + cabor1);
        System.out.println("Atlet ke-1: " + atlet1_badminton);
        System.out.println("Atlet ke-2: " + atlet2_badminton);
        System.out.println("Atlet ke-3: " + atlet3_badminton);
        System.out.println("Atlet ke-4: " + atlet4_badminton);
        System.out.println("Atlet ke-5: " + atlet5_badminton);
        
        System.out.println("\nCabang Olahraga: " + cabor2);
        System.out.println("Atlet ke-1: " + atlet1_tenis);
        System.out.println("Atlet ke-2: " + atlet2_tenis);
        System.out.println("Atlet ke-3: " + atlet3_tenis);
        System.out.println("Atlet ke-4: " + atlet4_tenis);
        System.out.println("Atlet ke-5: " + atlet5_tenis);
        
        System.out.println("\nCabang Olahraga: " + cabor3);
        System.out.println("Atlet ke-1: " + atlet1_basket);
        System.out.println("Atlet ke-2: " + atlet2_basket);
        System.out.println("Atlet ke-3: " + atlet3_basket);
        System.out.println("Atlet ke-4: " + atlet4_basket);
        System.out.println("Atlet ke-5: " + atlet5_basket);
        
        System.out.println("\nCabang Olahraga: " + cabor4);
        System.out.println("Atlet ke-1: " + atlet1_voli);
        System.out.println("Atlet ke-2: " + atlet2_voli);
        System.out.println("Atlet ke-3: " + atlet3_voli);
        System.out.println("Atlet ke-4: " + atlet4_voli);
        System.out.println("Atlet ke-5: " + atlet5_voli);

        sc.close();
    }
}
