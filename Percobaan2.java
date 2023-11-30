import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = input02.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input02.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.print(bilangan + "^" + pangkat + " dicetak: ");
        for (int i = 0; i < pangkat; i++) {
            System.out.print(bilangan);
            if (i < pangkat - 1) {
                System.out.print("x");
            }
        }
        System.out.println(" = " + hasil);
    }
}
