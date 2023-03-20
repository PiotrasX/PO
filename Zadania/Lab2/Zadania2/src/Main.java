import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Dostępne zadania:");
        System.out.println("- Zadanie 1");
        System.out.println("- Zadanie 5");
        System.out.println("- Zadanie 6");
        System.out.println("- Zadanie 7");
        System.out.print("Jakie chcesz zadanie wyświetlić?: ");
        Scanner input = new Scanner(System.in);
        int zadanie = input.nextInt();
        System.out.println();
        if (zadanie == 1)
        {
            Zadanie1 z1 = new Zadanie1();
            z1.main();
        }
        else if (zadanie == 5)
        {
            Zadanie5 z5 = new Zadanie5();
            z5.main();
        }
        else if (zadanie == 6)
        {
            Zadanie6 z6 = new Zadanie6();
            z6.main();
        }
        else if (zadanie == 7)
        {
            Zadanie7 z7 = new Zadanie7();
            z7.main();
        }
        else
        {
            System.out.println("Nie istnieje takie zadanie");
        }
    }
}