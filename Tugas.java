import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner NumScanner = new Scanner(System.in);
        System.out.println("Masukkan nama Anda = ");
        String nama = scanner.next();
        int[] nilai = new int[5];
        double jumlahNilai = 0;
        double min = 101;
        double max = 0;
        int i;
        for (i = 0; i <5; i++) {
            System.out.println("Masukkan nilai ke- " + (i+1) + " : ");
            nilai[i] = NumScanner.nextInt();
            if (i == 1){
                min = nilai[i];
                max = nilai[i];
            }
            else if (min > nilai[i]){
                min = nilai[i];
            }
            else if (max < nilai[i]){
                max = nilai[i];
            }
            jumlahNilai = jumlahNilai + nilai[i];
        }
        double avg;
            avg = jumlahNilai / i;

        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Rata - rata Nilai : " + avg);
    }
}
