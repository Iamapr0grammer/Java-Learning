import java.util.Scanner;

public class Lekcja1 {
    public static void main (String[] args){

            // wczytywanie fanych od użytkownika:

            Scanner scanner = new Scanner(System.in);
            String name; // tworzenie zmiennej "name" strong
            System.out.print("Podaj swoje imie: "); // Wyświetlanie użytkownikowi
            // name = scanner.next(); //Czyta jedno słowo od użytkownika
            name = scanner.nextLine(); // Czyta całe słowo od użytkownika

        System.out.print("Hello " + name + "!"); // nie formatowalny
        System.out.printf("Hello! %s", name); // formatowalny z języka programowania C pozwala na używanie zmiennych
    }
}
