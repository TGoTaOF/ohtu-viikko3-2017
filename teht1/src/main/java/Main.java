import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("anna kertoja ");
        int mult = scanner.nextInt();
        Multiplier kolme = new Multiplier(mult);
        System.out.println("anna luku ");
        int luku = scanner.nextInt();

        System.out.println("luku kertaa " + mult + " on "+kolme.multipliedBy(luku) );
    }
}
