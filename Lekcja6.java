public class Lekcja6 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int poraRoku = 5;

        // switch jest to przełącznik, najpierw podajemy, do jakiej zmiennej ma się odnosić, w nawiasach okrągłych.
        // później, w nawiasach klamrowych, kolejne przypadki {case}, problem w tym, że w momencie, kiedy
        // warunek zostanie spełnony, to każdy case nizej, też będzie wykonany, by to się nie stało, należy
        // dodać komendę break;
        // Defauls będzie wykonany, gdy żadnej inny case nie będzie możliwy do przypisania
        switch (poraRoku){
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Żyjesz na innej planecie");
        }
    }
}
