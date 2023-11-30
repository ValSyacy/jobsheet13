import java.util.Scanner;

public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n) {
        if (n > 0) {
            return n + penjumlahanRekursif(n - 1);
        } else {
            return 0;
        }
    }

    static void cetakDeretPerhitungan(int n) {
        if (n > 0) {
            cetakDeretPerhitungan(n - 1);
            System.out.print(n);
            if (n > 1) {
                System.out.print("+");
            }else{
                System.out.print("+");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int f, hasil;

        System.out.print("Masukkan nilai f: ");
        f = input02.nextInt();

        System.out.print("Deret Perhitungan untuk f = " + f + ": ");
        cetakDeretPerhitungan(f);

        hasil = penjumlahanRekursif(f);
        System.out.println(" = " + hasil);
    }
}
