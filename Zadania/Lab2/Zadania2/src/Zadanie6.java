import java.util.Scanner;

// Zad 6. Napisz program, który w nieskończoność pyta użytkownika o liczby całkowite.
//      Pętla nieskończona powinna się zakończyć gdy użytkownik wprowadzi liczbę mniejszą od zera.
//      Do opuszczenia pętli nieskończonej użyj instrukcji break.

public class Zadanie6
{
    public void main()
    {
        while (true)
        {
            int liczba = InputInt();
            if (liczba < 0)
            {
                System.out.println("Zakończono działanie nieskończonej pętli");
                break;
            }
        }
    }

    public int InputInt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = input.nextInt();
        return liczba;
    }
}