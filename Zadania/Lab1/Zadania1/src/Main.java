import java.util.Random;
import java.util.Scanner;

// Zad 1. Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
// Zad 2. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
//      Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
// Zad 3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true, jeśli liczba jest parzysta.
// Zad 4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true, jeśli liczba jest podzielna przez
//      3 i przez 5.
// Zad 5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
// Zad 6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
// Zad 7. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true, jeśli
//      z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
//      Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są
//      przez użytkownika z klawiatury.

public class Main
{
    public static void main(String[] args)
    {
        // Zadanie 1
        System.out.println("Zadanie 1");
        System.out.println(Imie());
        System.out.println(Wiek());
        System.out.println();

        // Zadanie 2
        System.out.println("Zadanie 2");
        int a = InputInt();
        int b = InputInt();
        Dzialania(a, b);
        System.out.println();

        // Zadanie 3
        System.out.println("Zadanie 3");
        int c = InputInt();
        System.out.println("Czy liczba " + c + " jest parzysta? - " + CzyParzysta(c) + "\n");

        // Zadanie 4
        System.out.println("Zadanie 4");
        int d = InputInt();
        System.out.println("Czy liczba " + d + " jest podzielna przez 3 i 5? - " + CzyPodzielna35(d) + "\n");

        // Zadanie 5
        System.out.println("Zadanie 5");
        int e = InputInt();
        System.out.println(e + "^3 = " + Potegowanie(e) + "\n");

        // Zadanie 6
        System.out.println("Zadanie 6");
        int f = InputInt();
        System.out.println("Pierwiastek kwadratowy z " + f + " wynosi " + Pierwiastkowanie(f) + "\n");

        // Zadanie 7
        System.out.println("Zadanie 7");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą, która będzie dolnym przedziałem: ");
        int g = input.nextInt();
        System.out.print("Podaj liczbe całkowitą, która będzie górnym przedziałem: ");
        int h = input.nextInt();
        Random rand = new Random();
        int z1 = rand.nextInt(h - g + 1) + g;
        int z2 = rand.nextInt(h - g + 1) + g;
        int z3 = rand.nextInt(h - g + 1) + g;
        System.out.format("Czy z licz %d, %d, %d można zbudować trójkąt prostokątny? - %b", z1, z2, z3, Trojkat(z1, z2, z3));
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }

    // Zadanie 1
    public static String Imie()
    {
        return "Piotr";
    }

    public static int Wiek()
    {
        return 19;
    }
    // Koniec Zadanie 1

    // Zadanie 2
    public static void Dzialania(int a, int b)
    {
        System.out.format("Suma: %d + %d = %d\n", a, b, (a+b));
        System.out.format("Różnica: %d - %d = %d\n", a, b, (a-b));
        System.out.format("Iloczyn: %d * %d = %d\n", a, b, (a*b));
    }
    // Koniec Zadanie 2

    // Zadanie 3
    public static boolean CzyParzysta(int c)
    {
        if ((c % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Koniec Zadanie 3

    // Zadanie 4
    public static boolean CzyPodzielna35(int d)
    {
        if ((d % 3) == 0)
        {
            if ((d % 5) == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    // Koniec Zadanie 4

    // Zadanie 5
    public static int Potegowanie(int e)
    {
        return (e * e * e);
    }
    // Koniec Zadanie 5

    // Zadanie 6
    public static double Pierwiastkowanie(int f)
    {
        return Math.sqrt(f);
    }
    // Koniec Zadanie 6

    // Zadanie 7
    public static boolean Trojkat(int z1, int z2, int z3)
    {
        if ((z1*z1 + z2*z2 == z3*z3) || (z1*z1 + z3*z3 == z2*z2) || (z3*z3 + z2*z2 == z1*z1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Koniec Zadanie 7
}