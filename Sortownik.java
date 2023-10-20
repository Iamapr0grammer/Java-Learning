import java.util.Scanner;
import java.util.Arrays;

public class Sortownik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarujemy ile liczb będzie od użytkownika
        System.out.print("Podaj liczbę elementów: ");
        int n = input.nextInt();

        // tworzymy listę dla tych liczb, określając ilość liczb od użytkownika jako ilość komórek w tabelce
        int[] numbers = new int[n];

        // prosimy użytkownika, by podał kolejno wszystkie liczby
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Sortujemy liczby
        Arrays.sort(numbers);

        // podajemy posortowane liczby
        System.out.println("Posortowane liczby:");
        for (int num : numbers) {
            System.out.println(num);
        }

        input.close();
    }
}