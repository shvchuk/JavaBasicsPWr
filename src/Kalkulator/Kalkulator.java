package Kalkulator;

public class Kalkulator {

    public static void main(String[] args) { // metoda główna main

        // tworzymy zmienną o nazwie dodajPierwszyZestawLiczb typu Dodawanie; zmienna ta zawiera adres do
        // konkretnego obiektu, który tworzymy poprzez new Dodawanie()

        Dodawanie dodajPierwszyZestawLiczb = new Dodawanie(15,20);

        System.out.println("Wynik dodawania: " + dodajPierwszyZestawLiczb.dodawanieDwochLiczb());
    }

}
