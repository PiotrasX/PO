package Person;

public class Main
{
    public static void main(String[] args)
    {
        // Obiekt lub instancja klasy
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Jan", "Kowalski", 12);
        // Odwołanie się do danej osoby i jej parametrów
        osoba1.wypisz();
        osoba2.wypisz();
        osoba2.setWiek(11);
        System.out.println(osoba2.toString());
    }
}
