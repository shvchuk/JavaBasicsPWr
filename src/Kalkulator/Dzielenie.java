package Kalkulator;

public class Dzielenie {

    private int a, b; // zmienne które chcemy do siebie dodać

    public Dzielenie(int a, int b){ // konstruktor - przyjmuje informacje o wartościach dodawanych liczb
        this.a = a;                 // oraz tworzy operację arytm. pod tyt. dodawanie
        this.b = b;                 // konstruktor pozwala tworzyć pojedyncze operacje dodawania
    }

    public int dzielenieDwochLiczb() { // metoda
              return a / b;
    }
}
