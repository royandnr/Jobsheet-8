import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabor = 4;    // input cabornya ada 4 cabor yaitu badminton, tenis meja, basket, bola voli

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");    // input jumlah politeknik yang mendaftar
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        for (int i = 1; i <= jumlahPoliteknik; i++) { // jumlah politeknik berapa kali sesuai yang diinput
            System.out.println("\n==============================");
            System.out.print("Masukkan nama Politeknik ke-" + i + ": "); // masukkan nama politeknik
            String namaPoliteknik = sc.nextLine();

            System.out.println("Data atlet dari " + namaPoliteknik + ":"); // input data atlet dari tiap politeknik

            for (int j = 1; j <= jumlahCabor; j++) {    // Perulangan ini berjalan sebanyak jumlah cabang olahraga (4 kali).
                String namaCabor = "";
                if (j == 1) namaCabor = "Badminton";
                else if (j == 2) namaCabor = "Tenis Meja";
                else if (j == 3) namaCabor = "Basket";
                else if (j == 4) namaCabor = "Bola Voli";

                System.out.println("\nCabang Olahraga: " + namaCabor);  // menampilkan nama cabang olahraga yang sedang di input 

                // Input 5 atlet untuk tiap cabor
                for (int k = 1; k <= 5; k++) {  // perulangan 5 kali dan untuk memasukkan 5 nama atlet per cabor
                    System.out.print("Nama Atlet ke-" + k + ": ");
                    String namaAtlet = sc.nextLine();
                }

                // Setelah selesai input 5 atlet untuk cabang tertentu akan mecetak pesan ini percabor
                System.out.println("Atlet cabang " + namaCabor + " sudah berhasil terdaftar\n");
            }
        }

        sc.close();
        System.out.println("\n=== Semua Data Atlet Berhasil Dimasukkan ===");
    }
}
