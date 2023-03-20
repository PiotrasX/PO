import java.util.Random;
import java.util.Scanner;

public class Main // początek klasy Main
{
    public static void main(String[] args) // początek metody main
    {
        System.out.println(Name());
        System.out.println(Age());
        int a = InputInt();
        int b = InputInt();
        Dzialania(a,b);

        Random rand = new Random();
        // [0;10]
        int liczba1 = rand.nextInt(11);
        System.out.println(liczba1);
        // [-5;15]
        int liczba2 = rand.nextInt(21) - 5;
        System.out.println(liczba2);
        // [x;y]
        int x = 1, y = 32;
        int liczba3 = rand.nextInt(y - x + 1) + x;
        System.out.println(liczba3);

    }   // koniec metody main

    public static String Name()
    {
        return "JAN";
    }

    public static int Age()
    {
        return 12;
    }

    public static int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = input.nextInt();
        return liczba;
    }

    public static void Dzialania(int a, int b)
    {
        System.out.format("Suma %d + %d wynosi %d\n", a, b, (a+b));
        System.out.format("Różnica %d - %d wynosi %d\n", a, b, (a-b));
        System.out.println("Iloczyn " + a + " * " + b + " wynosi " + (a*b));
        System.out.println("Iloraz całkowity " + a + " / " + b + " wynosi " + (a/b));
    }
}   // koniec klasy Main