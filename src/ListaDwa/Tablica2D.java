package ListaDwa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tablica2D {

    private int w, k;
    private int tab[][];

    Tablica2D(int w, int k){

        this.w = w;
        this.k = k;

        tab = new int[w][k];

        Wypelnij();

    }

    private void Wypelnij() {

        Random rand = new Random();


        for (int i = 0; i < w; i++) {
            for (int j = 0; j < k; j++) {
                tab[i][j] = rand.nextInt(1000);
                System.out.print("Wartość:" + "[" + i + "][" + j + "] " + tab[i][j] + " ");
            }

            System.out.println("");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wiersze;
        int kolumny;

        System.out.println("podaj ilość wierszy tablicy: ");
        wiersze = scanner.nextInt();
        System.out.println("podaj ilość kolumn tablicy: ");
        kolumny = scanner.nextInt();

        Tablica2D tablicaNowa = new Tablica2D(wiersze, kolumny);
    }
}
