import java.util.Scanner;

// Zad 7. Napisz program umożliwiający wprowadzanie n liczb oraz sortujący te liczby
//      metodą bąbelkową lub wstawiania. Wyniki wyświetlaj na konsoli.

public class Zadanie7
{
    public void main()
    {
        System.out.print("Ile chcesz wprowadzić liczb?: ");
        int n = InputInt();
        int[] Liczby = Wprowadzanie(n);
        int[] Poczatkowa = Przepisz(n, Liczby);
        int[] Posortowana = Sortowanie(n, Liczby);
        System.out.print("\nPoczątkowa tabelka: ");
        Wypisz(n, Poczatkowa);
        System.out.print("Posortowana tabelka: ");
        Wypisz(n, Posortowana);
    }

    public int[] Wprowadzanie(int n)
    {
        int[] tab = new int[n];
        int x = 0;
        while (x < n)
        {
            System.out.print("Podaj liczbe całkowitą dla " + (x + 1) + " pozycji: ");
            int liczbaWprowadz = InputInt();
            tab[x] = liczbaWprowadz;
            x += 1;
        }
        return tab;
    }

    public int[] Przepisz(int n, int[] Liczby)
    {
        int[] tab = new int[n];
        for (int x=0; x<n; x++)
        {
            tab[x] = Liczby[x];
        }
        return tab;
    }

    public int[] Sortowanie(int n, int[] tab)
    {
        int kolej = 0;
        while (kolej < n-1)
        {
            Wypisz(n, tab);
            System.out.println("Sortowanie "+ (kolej+1) +" kolejka:");
            int x = 0;
            while (x < n-1-kolej)
            {
                if (tab[x] > tab[x+1])
                {
                    System.out.println(tab[x]+">"+tab[x+1]+", więc zamiana kolejności");
                    int tymczas = tab[x];
                    tab[x] = tab[x+1];
                    tab[x+1] = tymczas;
                }
                else
                {
                    System.out.println(tab[x]+"<"+tab[x+1]+", więc brak zamiany kolejności");
                }
                x += 1;
            }
            kolej += 1;
        }
        return tab;
    }

    public int InputInt()
    {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public void Wypisz(int n, int[] tab)
    {
        System.out.print("\n[");
        int x = 0;
        while (x < n-1)
        {
            System.out.print(tab[x] + ", ");
            x += 1;
        }
        System.out.println(tab[x] + "]");
    }
}