import java.util.Scanner;

public class RataNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int i = 1, j;
        double nilaiMhs, totalNilai, rataNilai;
       
                i = 1;
                while (i <= 5) {
                    System.out.println("Input Nilai Mahasiswa ke " + i);
                    totalNilai = 0;
                    for (j = 1; j <= 5; j++) {
                        System.out.print("Nilai ke-" + j + " = ");
                        nilaiMhs = sc.nextDouble();
                        totalNilai  +=   nilaiMhs;
                    }
                    rataNilai = totalNilai / 5;
                    System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
                    System.out.println();
                    i++;
                }
          }   
    }