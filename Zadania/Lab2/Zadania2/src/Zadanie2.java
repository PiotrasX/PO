import java.util.Scanner;

// Zad 2. Napisz kalkulator obliczający: sumę, różnicę, iloczyn, iloraz, potęgę, pierwiastek,
//      oraz wartości funkcji trygonometrycznych dla zadanego kąta. Użyj biblioteki Math np. Math.Sin(2.5).
//      Proszę pamiętać, że wartości kąta podawane do funkcji mierzone są miarą łukową. Wyniki działania
//      algorytmów wyświetlaj na konsoli. Do obsługi menu proszę użyć konstrukcji switch-case oraz pętli while.

public class Zadanie2
{
    public static void main(String[] args)
    {
        Run();
    }

    public static void Run()
    {
        while (true)
        {
            Menu();
            int wybor = InputInt();
            switch (wybor)
            {
                case 1 -> Suma();
                case 2 -> Roznica();
                case 3 -> Iloczyn();
                case 4 -> Iloraz();
                case 5 -> Potega();
                case 6 -> Pierwiastek();
                case 7 -> funTryg();
                case 8 -> Close();
                default -> Default();
            }
        }
    }

    public static void Menu()
    {
        System.out.println("\n\t\t\t==============================");
        System.out.println("\t\t\t=======   KALKULATOR   =======");
        System.out.println("\t\t\t==============================");
        System.out.println("\t\t\t1. Suma");
        System.out.println("\t\t\t2. Różnica");
        System.out.println("\t\t\t3. Iloczyn");
        System.out.println("\t\t\t4. Iloraz");
        System.out.println("\t\t\t5. Potęga");
        System.out.println("\t\t\t6. Pierwiastek");
        System.out.println("\t\t\t7. Wartości trygonometryczne (sin, cos, tg, ctg)");
        System.out.println("\t\t\t8. Wyjście");
        System.out.println("\t\t\t------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
    }

    public static void Suma()
    {
        System.out.print("\t\t\tSkładnik: ");
        int liczba1 = InputInt();
        System.out.print("\t\t\tSkładnik: ");
        int liczba2 = InputInt();
        int wynik = liczba1 + liczba2;
        System.out.format("\t\t\tSuma '%d + %d' wynosi '%d'\n", liczba1, liczba2, wynik);
    }

    public static void Roznica()
    {
        System.out.print("\t\t\tOdjemna: ");
        int liczba1 = InputInt();
        System.out.print("\t\t\tOdjemnik: ");
        int liczba2 = InputInt();
        int wynik = liczba1 - liczba2;
        System.out.format("\t\t\tRóżnica '%d - %d' wynosi '%d'\n", liczba1, liczba2, wynik);
    }

    public static void Iloczyn()
    {
        System.out.print("\t\t\tCzynnik: ");
        int liczba1 = InputInt();
        System.out.print("\t\t\tCzynnik: ");
        int liczba2 = InputInt();
        int wynik = liczba1 * liczba2;
        System.out.format("\t\t\tIloczyn '%d * %d' wynosi '%d'\n", liczba1, liczba2, wynik);
    }

    public static void Iloraz()
    {
        System.out.print("\t\t\tDzielna: ");
        int liczba1 = InputInt();
        System.out.print("\t\t\tDzielnik: ");
        int liczba2 = InputInt();
        double wynik = (double) liczba1 / liczba2;
        System.out.format("\t\t\tIloraz '%d / %d' wynosi '%f'\n", liczba1, liczba2, wynik);
    }

    public static void Potega()
    {
        System.out.print("\t\t\tPodstawa: ");
        int liczba1 = InputInt();
        System.out.print("\t\t\tWykładnik: ");
        int liczba2 = InputInt();
        double wynik = Math.pow(liczba1, liczba2);
        System.out.format("\t\t\tPotęgowanie '%d ^ %d' wynosi '%.0f'\n", liczba1, liczba2, wynik);
    }

    public static void Pierwiastek()
    {
        System.out.print("\t\t\tLiczba pierwiastkowana: ");
        int liczba1 = InputInt();
        double wynik = Math.sqrt(liczba1);
        System.out.format("\t\t\tPierwiastek kwadratowy z '%d' wynosi '%f'\n", liczba1, wynik);
    }

    public static void funTryg()
    {
        System.out.print("\t\t\tMiara kąta w stopniach: ");
        int liczba1 = InputInt();
        double sin = Math.sin(Math.toRadians(liczba1));
        double cos = Math.cos(Math.toRadians(liczba1));
        double tan = sin / cos;
        double ctg = cos / sin;
        System.out.format("\t\t\tWartość sinus z '%d stopni' wynosi '%f'\n", liczba1, sin);
        System.out.format("\t\t\tWartość cosinus z '%d stopni' wynosi '%f'\n", liczba1, cos);
        System.out.format("\t\t\tWartość tangens z '%d stopni' wynosi '%f'\n", liczba1, tan);
        System.out.format("\t\t\tWartość cotangens z '%d stopni' wynosi '%f'\n", liczba1, ctg);
    }

    public static void Close()
    {
        System.out.print("\t\t\tCzy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = InputString();
        String z1 = "t";
        String z2 = "T";
        String z3 = "tak";
        String z4 = "Tak";
        String z5 = "TAK";
        if (znak.equals(z1) || znak.equals(z2) || znak.equals(z3) || znak.equals(z4) || znak.equals(z5))
        {
            System.out.println("\t\t\tKoniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("\t\t\tAnulowano wyjście");
        }
    }

    public static void Default()
    {
        System.out.println("\t\t\tBłędne dane, koniec programu");
        System.exit(0);
    }

    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        String wyraz = input.nextLine();
        return wyraz;
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }
}