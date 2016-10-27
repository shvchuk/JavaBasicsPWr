/**
 * Created by Andrzej on 2016-10-27.
 */
public class NajwiekszyWspolnyDzielnikEuklides {

    public static void main(String[] args) {

        int m = 58;
        int n = 36;

        while (m != n ) {
            if (m < n) n = n - m;
            else m = m - n;
        }

        System.out.println("Największy wspólny dzielnik podancyh liczb to: " + m);

    }



}
