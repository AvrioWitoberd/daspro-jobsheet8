import java.util.Scanner;

public class RataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int nilaiMhs;
        float nilai;
        float totalNilai;
        float rataNilai;

        i=1;
        while (i<=5) {
            totalNilai=0;
            for (j=1;j<=5;j++){
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + ": " + rataNilai);
            i++;
        }
        sc.close();
    }
}