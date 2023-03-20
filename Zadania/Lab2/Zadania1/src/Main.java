import java.util.Random;
import java.util.Scanner;

// Zad 1. Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik).
//      Wprowadzamy liczbę punktów dla każdego studenta. Napisz program,
//      który obliczy średnią liczbę punktów w grupie z wykorzystaniem pętli while.
// Zad 2. Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości
//      oraz sumy liczb ujemnych i dodatnich podanych przez użytkownika.
// Zad 3. Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy
//      wszystkich liczb parzystych w danym ciągu.
// Zad 4. Wykorzystując algorytm z zadania 5, napisz program, który pozwoli użytkownikowi
//      na wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb
//      parzystych w danym ciągu.
// Zad 5. Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo
//      jest palindromem. Palindrom to słowo, które jest takie samo czytane od początku
//      i od końca, np.: kajak.

public class Main
{
    public static void main(String[] args)
    {
        // Zadanie 1
        System.out.println("Zadanie 1");
        System.out.print("Podaj liczbe studentów: ");
        int studenci = InputInt();
        int[] LiczbyPunktow = PunktyDlaStudentow(studenci);
        double SredniaPunkow = ObliczanieSredniej(LiczbyPunktow, studenci);
        System.out.println("Średnia ilość punktów studentów wynosi: " + SredniaPunkow + "\n");

        // Zadanie 2
        System.out.println("Zadanie 2");
        int[] Liczby2 = WczytywanieDoTabeli(10);
        int SumaDod = Sumy(1, 10, Liczby2);
        int SumaUje = Sumy(0, 10, Liczby2);
        int IleDod = Ilosci(1, 10, Liczby2);
        int IleUje = Ilosci(0, 10, Liczby2);
        System.out.println("Suma liczb dodatnich wynosi: " + SumaDod);
        System.out.println("Liczb dodatnich jest: " + IleDod);
        System.out.println("Suma liczb ujemnych wynosi: " + SumaUje);
        System.out.println("Liczb ujemnych jest: " + IleUje + "\n");

        // Zadanie 3
        System.out.println("Zadanie 3");
        System.out.print("Podaj, ile chcesz wprowadzić liczb: ");
        int ileLiczb3 = InputInt();
        int[] Liczby3 = WczytywanieDoTabeli(ileLiczb3);
        int sumaParz3 = SumaParzystych(ileLiczb3, Liczby3);
        System.out.println("Suma wszystkich liczb parzystych wynosi: " + sumaParz3 + "\n");

        // Zadanie 4
        System.out.println("Zadanie 4");
        System.out.print("Podaj, ile chcesz wylosować liczb: ");
        int ileLiczb4 = InputInt();
        int[] Liczby4 = WczytywanieDoTabeliLos(ileLiczb4);
        int sumaParz4 = SumaParzystych(ileLiczb4, Liczby4);
        System.out.println("Suma wszystkich wylosowanych liczb parzystych wynosi: " + sumaParz4 + "\n");

        // Zadanie 5
        System.out.println("Zadanie 5");
        String czyPali = InputString();
        boolean palindrom = CzyPalindrom(czyPali);
        System.out.println("Czy słowo " + czyPali + " jest palindromem? - " + palindrom);
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public static int[] WczytywanieDoTabeli(int i)
    {
        int[] tab = new int[i];
        int x = 0;
        while (x < i)
        {
            System.out.print("Podaj liczbe całkowitą dla " + (x + 1) + " pozycji: ");
            int liczbaWprowadz = InputInt();
            tab[x] = liczbaWprowadz;
            x += 1;
        }
        return tab;
    }

    // Zadanie 1
    public static int[] PunktyDlaStudentow(int i)
    {
        int[] tab = new int[i];
        int x = 0;
        while (x < i)
        {
            System.out.print("Podaj liczbe punktów dla " + (x + 1) + " studenta: ");
            int punkty = InputInt();
            tab[x] = punkty;
            x += 1;
        }
        return tab;
    }

    public static double ObliczanieSredniej(int[] tab, int i)
    {
        double SredniaPunktow = 0;
        int x = 0;
        while (x < i)
        {
            SredniaPunktow += tab[x];
            x += 1;
        }
        SredniaPunktow /= i;
        return SredniaPunktow;
    }
    // Koniec Zadanie 1

    // Zadanie 2
    public static int Sumy(int jakie, int i, int[] tab)
    {
        int x = 0;
        int Suma = 0;
        if (jakie == 1)
        {
            while (x < i)
            {
                if (tab[x] > 0)
                {
                    Suma += tab[x];
                }
                x += 1;
            }
        }
        else
        {
            while (x < i)
            {
                if (tab[x] < 0)
                {
                    Suma += tab[x];
                }
                x += 1;
            }
        }
        return Suma;
    }

    public static int Ilosci(int jakie, int i, int[] tab)
    {
        int x = 0;
        int Ilosc = 0;
        if (jakie == 1)
        {
            while (x < i)
            {
                if (tab[x] > 0)
                {
                    Ilosc += 1;
                }
                x += 1;
            }
        }
        else
        {
            while (x < i)
            {
                if (tab[x] < 0)
                {
                    Ilosc += 1;
                }
                x += 1;
            }
        }
        return Ilosc;
    }
    // Koniec Zadanie 2

    // Zadanie 3
    public static int SumaParzystych(int i, int[] tab)
    {
        int x = 0;
        int SumaParz = 0;
        while (x < i)
        {
            if ((tab[x] % 2) == 0)
            {
                SumaParz += tab[x];
            }
            x += 1;
        }
        return SumaParz;
    }
    // Koniec Zadanie 3

    // Zadanie 4
    public static int[] WczytywanieDoTabeliLos(int i)
    {
        int[] tab = new int[i];
        int x = 0;
        while (x < i)
        {
            Random rand = new Random();
            int liczbaLos = rand.nextInt(54)-9;
            tab[x] = liczbaLos;
            x += 1;
        }
        return tab;
    }
    // Koniec Zadanie 4

    // Zadanie 5
    public static String InputString()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String slowo = input.nextLine();
        return slowo;
    }

    public static boolean CzyPalindrom(String napis)
    {
        int palindrom = 0;
        int dlugoscSlowa = napis.length();
        int y = dlugoscSlowa / 2;
        int x = 0;
        while (x < y)
        {
            if (napis.charAt(x) != napis.charAt(dlugoscSlowa-1-x))
            {
                return false;
            }
            x += 1;
        }
        return true;
    }
    // Koniec Zadanie 5
}