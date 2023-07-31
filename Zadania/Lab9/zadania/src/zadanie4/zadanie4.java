// Zad. 4 Napisz program, który pobierze od użytkownika ścieżkę do pliku binarnego z datą urodzenia,
//      a następnie wyświetli ją na ekran.

package zadanie4;

import java.io.*;

public class zadanie4
{
    public static void main(String[] args)
    {
        try
        {
            System.out.print("Twoja data urodzin: ");
            DataInputStream zapis = new DataInputStream(new FileInputStream("C:\\Users\\piotr\\Desktop\\Studia\\Semestr 2\\PO\\Zadania\\Lab9\\zadania\\src\\zadanie3\\dataUrodzin.txt"));
            int tekst = 0;
            while (true)
            {
                tekst = zapis.readInt();
                if (tekst == 0) break;
                System.out.print(tekst + " ");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie odnaleziono ścieżki do pliku");
        }
        catch (IOException ignored) {}
    }
}
