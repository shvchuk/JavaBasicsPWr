package Kalkulator;

public class Kalkulator {

    public static void main(String[] args) { // metoda główna main

        // tworzymy zmienną o nazwie dodajPierwszyZestawLiczb typu Dodawanie; zmienna ta zawiera adres do
        // konkretnego obiektu, który tworzymy poprzez new Dodawanie()

        Dodawanie dodajPierwszyZestawLiczb = new Dodawanie(15,20);
        Dzielenie podzielDwieLiczby = new Dzielenie(10, 2);
        Odejmowanie minusDwieLiczby = new Odejmowanie(10, 5);
        Mnozenie razyDwieLiczby = new Mnozenie(10, 3);

        System.out.println("Wynik dodawania: " + dodajPierwszyZestawLiczb.dodawanieDwochLiczb());
        System.out.println("Wynik dzielenia: " + podzielDwieLiczby.dzielenieDwochLiczb());
        System.out.println("Wynik odejmowania: " + minusDwieLiczby.odejmowanieDwochLiczb());
        System.out.println("Wynik mnozenia: " + razyDwieLiczby.mnozenieDwochLiczb());
    }

}
