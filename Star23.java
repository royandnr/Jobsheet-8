import java.util.Scanner;   // import class Scanner

public class Star23 {       // class
    public static void main(String[] args) {    // method main
        Scanner sc = new Scanner(System.in);    //objek Scanner

        System.out.print("Masukkan nilai N = ");    // input untuk nilai N
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {  // perulangan for
            System.out.print("*");
        }
    }
}