public class Lekcja2 {
    public static void main(String[] args){

        // printlm =! print. print z dodatkiem ln wydrukuje w kolejnej linii

        // w PHP można nazwać zmiennę zaczynając od $ o tak: #var = 5

        // Znak, zmienne powinniśmy zaczynać z małej litery, bez znaków specjalnych
        char zmChar;
        // Znak musi być w pojedyńczych apostrofach '' i przchowuje jeden znak
        zmChar = 'B';
        System.out.println(zmChar);

        // String, String to jest typ danych, który jest klasą, dlatego deklarujemy go z dużej litery
        String zmString;
        zmString = "Maciek";
        System.out.println(zmString);

        // Boolean - typowa zmienna typu, prawda/fałsz. Typ logiczny. Można przypisać tylko 2 wartości: true oraz false
        boolean zmBoolean = true;
        System.out.println(zmBoolean);

        // byte = typ danych, które przechowują tylko liczby całkowite, dzielą się na to, ile bitów jest przeznaczone
        // na zapis tej zmiennej (jak duże liczby mogą pomieścić)
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        byte zmByte3 = 100;
        System.out.println("Byte: " + zmByte + " - " + zmByte2);
        System.out.println("Przykład liczby Bytowej: " + zmByte3);
        // byte przechowa liczby od -128 do 127, program nie pozwoli na przechowanie większej, albo mniejszej liczby

        // short = short pozwala na przechowywanie troszkę większych liczb
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        short zmShort3 = 23333;
        System.out.println("Short: " + zmShort + " - " + zmShort2);
        System.out.println("Przykład liczby short: " + zmShort3);

        // int = intiger, najbardziej popularna zmienna, liczby około dwó-milioardowe
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        int zmInt3 = 2100000000;
        System.out.println("Intiger: " + zmInt + " - " + zmInt2);
        System.out.println("Przykład liczby Intiger: " + zmInt3);

        // long = można przechowywać duże liczby, ale należy pamiętać, by na końcu liczby dodać literkę L, w przeciwnym
        // wypadku program automatycznie zrobi z tej liczby ingiter (INT)
        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        long zmLong3 = 9223372036854775807L;
        System.out.println("long: " + zmLong + " - " + zmLong2);
        System.out.println("Przykład liczby long: " + zmLong3);

        // jeśli będzie potrzebne przechowanie jeszcze większej liczby to jest już zaimplementowana klasa, zawana jako
        // Big intiger, ale to już zupełnie inna zabawa, i zapisuje się w supełnie inny sposób

        // flat = liczby rzeczywiste, albo, informatycznie mówiąc, zmiennoprzecinkowych. na końcu float musi być
        // oznaczona literką F
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        float zmFloat3 = 26.931321F;
        System.out.println("float: " + zmFloat + " - " + zmFloat2);
        System.out.println("Przykład liczby float: " + zmFloat3);

        // double = podobny do float, z tym, że posiada troszkę większą precyzję. Na końcu można dodać D, ale nie trzeba
        double zmDouble= Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        double zmDouble3 = 500.435;
        System.out.println("double: " + zmDouble + " - " + zmDouble2);
        System.out.println("Przykład liczby double: " + zmDouble3);

        // Stałe, liczby, które się nigdy nie zmienią w czasie trwania programu

        final int liczba = 256;
        System.out.println("Final: " + liczba);








    }
}
