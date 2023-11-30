import java.util.Scanner;

public class DeretDescending {
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input02.nextInt();

        System.out.println("Deret Descending Rekursif:");
        deretDescendingRekursif(n);

        System.out.println("\nDeret Descending Iteratif:");
        deretDescendingIteratif(n);
    }
}
