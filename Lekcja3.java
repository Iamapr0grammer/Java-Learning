public class Lekcja3 {
    public static void main(String[] args){
        int a = 25;
        int b = 10;
        int wynik = a - b;
        System.out.println(wynik);

        int wynikdzielenia = a / b;
        System.out.println(wynikdzielenia);
        // wynik jest 2, ponieważ int nie jest w stanie przechowywać liczb wieloprzecinkowych

        double wynikdzieleniapoprawny = (double)a / b;
        System.out.println(wynikdzieleniapoprawny);
        // to co się stało, to rzutowanie, będzie o tym później

        // można też uzyskać resztę z dzielenia używając operatora %
        int wynikprocenta = a % b;
        System.out.println(wynikprocenta);
        // należy uważać, bo dzielenie przez 0 wywoła wyjątek (błąd)

        // jest jeszcze mnożenie *, oraz zachowana jest kolejność działania matematycznego łącznie z nawiasami.
        int a1 = 25;
        int b1 = 10;
        int wynik1 = a1 * b1;
        System.out.println(wynik1);

        int wynik2 = 2 + 2 * 2;
        System.out.println(wynik2);

        int wynik3 = (2 + 2) * 2;
        System.out.println(wynik3);

        // działa też += oraz -= z pythona, to duże ułatwienie, są też operatory *=, /=, %=

        // używając Math możemy osiągnąć bardziej skąplikowane działania matematyczne, na przykład pow do potęgowania
        System.out.println(Math.pow(9, 6));

        // inkrementacja, czyli zwiększenie zawsze o 1 = c++
        int c = 1;
        c++;
        System.out.println(c);

        // postinkrementacja jest to dodanie później, w tym przypadku po tym, kiedy wykonane zostało zadanie
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);

        // ++c = dodaje a później wyświetla
        // c++ = wyświetla i później dodaje



    }
}
