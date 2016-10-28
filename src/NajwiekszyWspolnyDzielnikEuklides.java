public class NajwiekszyWspolnyDzielnikEuklides {

    public static void main(String[] args) {

        int m = 58;
        int n = 36;

        while (m != n ) {
            if (m > n) m = m - n;
            else n = n - m;
        }
        System.out.println("Największy wspólny dzielnik podancyh liczb to: " + m);
    }
}
