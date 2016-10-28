package Kalkulator;

public class Dodawanie {

    private int a, b; // zmienne które chcemy do siebie dodać

    public Dodawanie(int a, int b){ // konstruktor - przyjmuje informacje o wartościach dodawanych liczb
        this.a = a;                 // oraz tworzy operację arytm. pod tyt. dodawanie
        this.b = b;                 // konstruktor pozwala tworzyć pojedyncze operacje dodawania
    }

    public int dodawanieDwochLiczb() { // metoda
        return a + b;


    }
}
