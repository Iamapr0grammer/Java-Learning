public class Lekcja5 {
    public static void main(String[] args) {

        // Warunek jest spełniony tylko wtedy, kiedy w nawiasie jest spełniony warunek true, bez znaczenia ile
        // koniunkcji tam będzie
        if (true)
            System.out.println("Prawda");
        if (false)
            System.out.println("Falsz");

        // problem w tym, że w takim zapisie, tylko jedna linijka pod "if" zostanie zablokowana przez brak spełnienia
        // warunku if, jak pokazano poniżej:

        if (false)
            System.out.println("Falsz");
            System.out.println("Falsz");
            System.out.println("Falsz");

        // by warunek obejmował całą zawartość należy użyć nawiasów klamrowych
        if (false) {
            System.out.println("Nie spełniony");
            System.out.println("Nie spełniony");
            System.out.println("Nie spełniony");
        }

        // coś bardziej zadaniowego, else oznacza, w przeciwnym wypadku, w przeciwnym razie
        int wiek = 19;
        if (wiek >= 18) {
            System.out.println("Osoba pełnoletnia");
        }
        else{
            System.out.println("Osoba niepełnoletnia");
        }

        // można też zagnieżdżać inne warunki w else:
        if (wiek >= 18) {
            System.out.println("Osoba pełnoletnia");
        }
        else{
            if (wiek >= 16) {
                System.out.println("Osoba może pracować");
            }
            else {
                System.out.println("Nie możesz nic!");
            }
        }

        // można też to zrobić bardziej czytelnie:
        if (wiek >= 18) {
            System.out.println("Osoba pełnoletnia");
        }
        else {System.out.println("Osoba niepełnoletnia");
        }

        // można też zagnieżdżać inne warunki w else:
        if (wiek >= 18)
            {System.out.println("Osoba pełnoletnia");
        }
        else {if (wiek >= 16) {
                System.out.println("Osoba może pracować");
            }
            else {System.out.println("Nie możesz nic!");
            }
        }

        // instrukcje warunkowe w przypisywaniu danych, przyjmują 3 zmienne, pierwsza, to zmienna = imie
        // druga zmienna to "Bartek" jest to pierwsze, co jest napisane po pytajniku ?, będzie to przypisane, w
        // przypadku kiedy warunek zostanie spełniony, trzecia zmienna to "Bartuś" będzie przypisany, kiedy
        // warunek przed znakiem zapytania nie zostanie spełniony
        // Operator trójargumentowy

        String imie = wiek >= 18 ? "Bartek" : "Bartuś";
        System.out.println(imie);


    }
}
