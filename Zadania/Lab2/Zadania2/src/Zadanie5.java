// Zad 5. Napisz program wyświetlający liczby od 20-0, z wyłączeniem liczb {2,6,9,15,19}.
//      Do realizacji zadania wyłączenia użyj instrukcji continue.

public class Zadanie5
{
    public void main()
    {
        int x = 20;
        while (x >= 0)
        {
            if (x==2 || x==6 || x==9 || x==15 || x==19)
            {
                x -= 1;
                continue;
            }
            System.out.println("x=" + x);
            x -= 1;
        }
    }
}