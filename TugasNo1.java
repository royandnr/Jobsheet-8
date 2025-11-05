import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai (minimal 3) : ");  // input nilai N
        int N = sc.nextInt();   // menggunakan integer karena bilangan bulat dan menggunakan nextint karena integer

        if (N < 3) {    // jika nilai N kurang dari 3 maka program berhenti dan akan mencetak pesan "nilai minimal 3!"
            System.out.println("Nilai minimal 3!");
            return; // "return" berfungsi untuk menghentikan eksekusi dari suatu metode (fungsi) dan mengembalikan nilai (jika ada) ke pemanggilnya
        }

        for (int i = 1; i <= N; i++ ) {     // i disini adalah indeks baris (1 sampai N). int i = 1 merupakan inisialisasi nya (untuk mendeklarasikan dan memberikan nilai awal pada variabel), lalu ada kondisi contohnya i <= N maksudnya perulangann akan terus berjalan selama nilainya true jika kondisi false maka perulangan akan berhenti, perubahan dilakukan di setiap akhir kali siklus perulangan dan biasanya untuk menambah atau mengurangi variabel penghitung contoh i++ (menambah 1 kali tiap putaran)
            for (int j = 1; j <= N; j++) {  // j disini adalah indeks kolom (1 sampai N). 
                if (i == 1 || i == N || j == 1 || j == N) { // i == 1 (baris pertama yaitu diatas), i == N (baris terakhir yaitu dibawah), 
                    System.out.print(N + " ");  // 1 spasi
                } else {
                    System.out.print("  "); // 2 spasi
                } 
            } 
            System.out.println();
        }
    }
}
