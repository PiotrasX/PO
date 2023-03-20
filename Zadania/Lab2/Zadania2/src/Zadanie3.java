import java.util.Scanner;

// Zad 3. Napisz program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy.
//      Następnie utwórz następujące funkcjonalności używając pętli for:
//        • Wyświetlanie tablicy od pierwszego do ostatniego indeksu.
//        • Wyświetlanie tablicy od ostatniego do pierwszego indeksu.
//        • Wyświetlanie elementów o nieparzystych indeksach.
//        • Wyświetlanie elementów o parzystych indeksach.
//      Wyniki działania algorytmów wyświetlaj na konsoli. Dla wyboru powyższych funkcjonalności programu
//      utwórz odpowiednie menu. Do obsługi menu użyć rozbudowanej konstrukcji else-if oraz pętli do-while.

public class Zadanie3
{
    public static void main(String[] args)
    {
        int ileLiczb = WprowadzLiczbe();
        double[] tab = WprowadzDoTabeli(ileLiczb);
        Run(ileLiczb, tab);
    }

    public static void Run(int ileLiczb, double[] tab)
    {
        do
        {
            Menu();
            int wybor = InputInt();
            if (wybor == 1 || wybor == 2 || wybor == 3 || wybor == 4) {Wyswietl(wybor, ileLiczb, tab);}
            else if (wybor == 5) {Zakoncz();}
            else {Default();}
        } while (true);
    }

    public static void Menu()
    {
        System.out.println("\n\t\t\t==============================");
        System.out.println("\t\t\t=======   MENU OPCJI   =======");
        System.out.println("\t\t\t==============================");
        System.out.println("\t\t\t1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu");
        System.out.println("\t\t\t2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu");
        System.out.println("\t\t\t3. Wyświetlanie elementów o nieparzystych indeksach");
        System.out.println("\t\t\t4. Wyświetlanie elementów o parzystych indeksach");
        System.out.println("\t\t\t5. Wyjście z programu");
        System.out.println("\t\t\t------------------------------");
        System.out.print("\t\t\tWybierz operacje: ");
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

    public static void Wyswietl(int wybor, int ileLiczb, double[] tab)
    {
        if (ileLiczb <= 0) {System.out.println("\t\t\t[]");}
        else
        {
            System.out.print("\t\t\t[");
            if (wybor == 1)
            {
                for(int x = 0; x < ileLiczb - 1; x++) {System.out.print(tab[x] + ", ");}
                System.out.println(tab[ileLiczb - 1] + "]");
            }
            else if (wybor == 2)
            {
                for(int x = ileLiczb - 1; x > 0; x--) {System.out.print(tab[x] + ", ");}
                System.out.println(tab[0] + "]");
            }
            else if (wybor == 3)
            {
                if (ileLiczb == 1) {System.out.println("]");}
                else
                {
                    for(int x = 1; x < ileLiczb - 2; x += 2) {System.out.print(tab[x] + ", ");}
                    if (ileLiczb % 2 == 0) {System.out.println(tab[ileLiczb - 1] + "]");}
                    else {System.out.println(tab[ileLiczb - 2] + "]");}
                }
            }
            else if (wybor == 4)
            {
                if (ileLiczb == 1) {System.out.println(tab[0] + "]");}
                else
                {
                    for(int x = 0; x < ileLiczb - 2; x += 2) {System.out.print(tab[x] + ", ");}
                    if (ileLiczb % 2 == 1) {System.out.println(tab[ileLiczb - 1] + "]");}
                    else {System.out.println(tab[ileLiczb - 2] + "]");}
                }
            }
        }
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