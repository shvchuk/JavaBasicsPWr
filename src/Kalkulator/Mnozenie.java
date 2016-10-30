package Kalkulator;

public class Mnozenie {

    private int a, b; // zmienne które chcemy do siebie dodać

    public Mnozenie(int a, int b){ // konstruktor - przyjmuje informacje o wartościach dodawanych liczb
        this.a = a;                 // oraz tworzy operację arytm. pod tyt. dodawanie
        this.b = b;                 // konstruktor pozwala tworzyć pojedyncze operacje dodawania
    }

    public int mnozenieDwochLiczb() { // metoda
        return a * b;


    }
}
