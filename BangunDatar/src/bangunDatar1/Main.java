package bangunDatar1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char y_t;
        Scanner input = new Scanner(System.in);
        float set_a, set_t, set_tps, set_r, set_ts;
        int menu;
        Segitiga segitiga = new Segitiga();
        PrismaSegitiga ps = new PrismaSegitiga();
        LimasSegitiga ls = new LimasSegitiga();
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        Silinder silinder = new Silinder();
        Kerucut kerucut = new Kerucut();
        Kerucut kt = new KerucutTerpancung();

        do {
            System.out.println("================MENU================");
            System.out.println("1. Segitiga");
            System.out.println("2. Lingkaran");
            System.out.println("3. Exit");
            System.out.println("Pilih menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("HITUNG LUAS SEGITIGA");
                    System.out.println("Masukkan ukuran alas  : ");
                    set_a = input.nextInt();
                    System.out.println("Masukkan ukuran tinggi segitiga : ");
                    set_t = input.nextInt();
                    segitiga.NilaiSegitiga(set_a, set_t);
                    System.out.println(segitiga.Cetak() + segitiga.getLuassegitiga(set_a, set_t));

                    System.out.println("HITUNG PRISMA DAN LIMAS SEGITIGA BERDASARKAN LUAS SEGITIGA YANG TELAH DIBUAT");
                    System.out.println("Masukkan ukuran tinggi bangun ruang : ");
                    set_tps = input.nextInt();
                    segitiga.NilaiSegitiga(set_a, set_t);
                    ps.VolumePrisma(set_a, set_t, set_tps);
                    System.out.println(ps.Cetak() + ps.NilaiVolumePrisma());
                    ls.VolumeLimas(set_a, set_t, set_tps);
                    System.out.println(ls.Cetak() + ls.VolumeLimas());

                    break;


                case 2:
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    lingkaran.NilaiLingkaran(set_r);
                    System.out.println("Luas Lingkaran : " + lingkaran.getLuasLingkaran(set_r));
                    bola.VolumeBola(set_r);
                    System.out.println("Volume Bola : " + bola.NilaiVolumeBola());
                    System.out.println("Hitung " + silinder.Cetak2());
                    System.out.println("Masukkan tinggi silinder : ");
                    set_ts = input.nextInt();
                    silinder.VolumeSilinder(set_r, set_ts);
                    System.out.println(silinder.Cetak2() + silinder.NilaiVolumeSilinder());
                    System.out.println("Hitung " + kerucut.Cetak2());
                    System.out.println("Masukkan tinggi kerucut : ");
                    set_ts = input.nextInt();
                    kerucut.VolumeKerucut(set_r, set_ts);
                    System.out.println(kerucut.Cetak2() + kerucut.NilaiVolumeKerucut());
                    System.out.println("Volume Kerucut Terpancung : ");
                    kt.VolumeKerucut(set_r, set_ts);
                    System.out.println(kt.NilaiVolumeKerucut());
                    break;
            }
            System.out.println("Pilih menu lagi?");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    }
}
