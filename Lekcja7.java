public class Lekcja7 {
    public static void main(String[] args){

        // Pętle

        // while, warunek kontynuacji pentli, czyli wykonuje się tak długo, jak ten warunek jest spełniony
        int wynik = 0;
        while (wynik < 10000) {
            wynik += 1;
            System.out.println(wynik);
        }

        //do while zawsze się wykona przynajmniej 1 rasy, a dopiero później sprawdzi warunek, w przeciwieństwie do while

        do{
            wynik--;
            System.out.println(wynik);
        } while (wynik > 0);


        // for, tak zwana pętla z licznikiem, wykona się tylko określiną ilość razy. W pierwszej części wstawiamy ile
        // razy ma się wykonać, w drugim miejscu określamy warunek, a w trzecim miejscu działania
        // Wszystkie zmienne określone w pętli for działa tylko w pętli for, czyli próba wywołania jakiejkolwiek
        // zmiennej, spoza pętli for, zakończy się fiaskiem.
        // Bo to dego nie dopuścić, należy zadeklatować te zmienne poza pętlą for
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }

        int x = 6;
        for (; x > 0;){
            x--;
            System.out.println(x);
        }

        // (deklaruje zmienną, tylko raz ; sprawdza warunek ; działanie, działanie, które może być wykonane na końcu,
        // po tym kiedy wszystkie inne działania z pętli for, zostały wykonane, te pole można zostawić puste)

    }
}
