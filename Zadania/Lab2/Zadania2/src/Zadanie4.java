import java.util.Scanner;

// Zad 4. Napisz program umożliwiający wprowadzanie 10-ciu liczb.
//      Dla wprowadzonych liczb wykonaj odpowiednie algorytmy:
//        • oblicz sumę elementów tablicy.
//        • oblicz iloczyn elementów tablicy.
//        • wyznacz wartość średnią.
//        • wyznacz wartość minimalną.
//        • wyznacz wartość maksymalną.
//      Wyniki działania algorytmów wyświetlaj na konsoli. Utwórz odpowiednie menu.

public class Zadanie4
{
    public static void main(String[] args)
    {
        int ileLiczb = WprowadzLiczbe();
        double[] tab = WprowadzDoTabeli(ileLiczb);
        Run(ileLiczb, tab);
    }

    public static int WprowadzLiczbe()
    {
        System.out.print("Podaj, ile chcesz wprowadzić liczb: ");
        int ileLiczb = InputInt();
        return ileLiczb;
    }

    public static double[] WprowadzDoTabeli(int ileLiczb)
    {
        double[] tab = new double[ileLiczb];
        int x = 0;
        while (x < ileLiczb)
        {
            System.out.print("Podaj liczbe całkowitą dla " + x + " indeksu: ");
            double liczbaWprowadz = InputDouble();
            tab[x] = liczbaWprowadz;
            x += 1;
        }
        return tab;
    }

    public static void Run(int ileLiczb, double[] tab)
    {
        while (true)
        {
            Menu();
            int wybor = InputInt();
            if ((ileLiczb <= 0) && ((wybor == 1) || (wybor == 2) || (wybor == 3) || (wybor == 4) || (wybor == 5))) {System.out.println("\t\t\tDla takiej tablicy nie można przeprowadzić żadnych operacji");}
            else
            {
                switch (wybor)
                {
                    case 1 -> Suma(tab, ileLiczb);
                    case 2 -> Iloczyn(tab, ileLiczb);
                    case 3 -> Srednia(tab, ileLiczb);
                    case 4 -> Min(tab, ileLiczb);
                    case 5 -> Maks(tab, ileLiczb);
                    case 6 -> Zakoncz();
                    default -> Default();
                }
            }
        }
    }

    public static void Menu()
    {
        System.out.println("\n\t\t\t==============================");
        System.out.println("\t\t\t=======   MENU OPCJI   =======");
        System.out.println("\t\t\t==============================");
        System.out.println("\t\t\t1. Suma elementów");
        System.out.println("\t\t\t2. Iloczyn elementów");
        System.out.println("\t\t\t3. Wartość średnia");
        System.out.println("\t\t\t4. Wartość minimalna");
        System.out.println("\t\t\t5. Wartość maksymalna");
        System.out.println("\t\t\t6. Wyjście z programu");
        System.out.println("\t\t\t------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
    }

    public static void Suma(double[] tab, int ileLiczb)
    {
        int x = 1;
        double suma = tab[0];
        while (x < ileLiczb)
        {
            suma += tab[x];
            x += 1;
        }
        System.out.println("\t\t\tSuma elementów tablicy wynosi: " + suma);
    }

    public static void Iloczyn(double[] tab, int ileLiczb)
    {
        int x = 1;
        double iloczyn = tab[0];
        while (x < ileLiczb)
        {
            iloczyn *= tab[x];
            x += 1;
        }
        System.out.println("\t\t\tIloczyn elementów tablicy wynosi: " + iloczyn);
    }

    public static void Srednia(double[] tab, int ileLiczb)
    {
        int x = 1;
        double srednia = tab[0];
        while (x < ileLiczb)
        {
            srednia += tab[x];
            x += 1;
        }
        srednia /= ileLiczb;
        System.out.println("\t\t\tWartość średnia w tablicy wynosi: " + srednia);
    }

    public static void Min(double[] tab, int ileLiczb)
    {
        int x = 1;
        double min = tab[0];
        while (x < ileLiczb)
        {
            if (tab[x] < min) {min = tab[x];}
            x += 1;
        }
        System.out.println("\t\t\tWartość minimalna w tablicy wynosi: " + min);
    }

    public static void Maks(double[] tab, int ileLiczb)
    {
        int x = 1;
        double maks = tab[0];
        while (x < ileLiczb)
        {
            if (tab[x] > maks) {maks = tab[x];}
            x += 1;
        }
        System.out.println("\t\t\tWartość maksymalna w tablicy wynosi: " + maks);
    }

    public static void Zakoncz()
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

    public static double InputDouble()
    {
        Scanner input = new Scanner(System.in);
        double liczba = input.nextDouble();
        return liczba;
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        String wyraz = input.nextLine();
        return wyraz;
    }
}