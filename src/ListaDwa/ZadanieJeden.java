package ListaDwa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZadanieJeden {
    private int w;
    private int tab[];

    ZadanieJeden(int w){
        this.w = w;
        tab = new int[w];
        WypelnijObliczMax();
    }

    private void WypelnijObliczMax() {

        int wartoscMaksymalna;

        Random rand = new Random();
        System.out.print("Zawartość tablicy: ");

        for(int i = 0; i < w; i++ ){
            tab[i] = rand.nextInt(1000);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Tablica raz jeszcze: " + Arrays.toString(tab));

        wartoscMaksymalna = tab[0];
        for(int i = 1; i < w; i++){
            if(wartoscMaksymalna < tab[i]){
                wartoscMaksymalna = tab[i];
            }
        }

        System.out.println("Wartość maksymalna w tablicy: " + wartoscMaksymalna);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wymiarTablicy;

        System.out.println("podaj wymiary tablicy jednowymiarowej: ");
        wymiarTablicy = scanner.nextInt();
        // System.out.println(wymiarTablicy);
        ZadanieJeden wynik = new ZadanieJeden(wymiarTablicy);



    }
}
