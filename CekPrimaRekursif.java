import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return cekPrimaRekursif(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan nilai bilangan: ");
        int bilangan = input02.nextInt();

        if (cekPrimaRekursif(bilangan, bilangan / 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}
