public class Lekcja9 {
    public static void main(String[] args){

        // Tablice, z angielskiego arise, pozwalają przetrzymywać zbiory danych, bazy danych
        // pierwsze co nam potrzebne, to typ danych, jakich chcemy przechowywać w tej tablicy, na przykład String
        // w drugim nawiasie deklarujemy, ile elementów będzie miałą tablica, nie więcej i nie mniej

        String[] tab = new String[20];

        // Zbiór danych, jednego typu, który posiada pewną ilość [20] komurek, na przechowywanie danych, jest dobry
        // na początek, kiedy uczymy się o danych, można to szybko stworzyć

        // Przypisujemy wartości używając poniszej komendy:
        tab[0] = "Ania";
        tab[1] = "Paulina";
        tab[2] = "Natalia";
        tab[3] = "Bartek";
        tab[4] = "Maciek";
        tab[5] = "Paweł";

        System.out.println(tab[0]);

        System.out.println(tab.length);
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }


        // Taki sposób zadeklarownia tablicy, podając znaki od razu po znaku = również działą

        int[] tabelka2 = {0, 1, 2, 3, 4, 5};

        for (int i = 0; i < tabelka2.length; i++){
            System.out.println(tabelka2[i]);
        }

        String uczen1 = "Ania";
        String uczen2 = "Bartek";
        String uczen3 = "Agnieszka";
        int info = 6;
        System.out.println(info);
    }
}
