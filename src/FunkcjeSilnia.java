public class FunkcjeSilnia {

    public static void main(String[] args) {

    }

    class SumaSzeregu {

        public int suma(int x, double E) {
            int a = 1;
            int s = 1;
            int i = 0;

            while(a >= E) {
                i = i+1;
                a = a*(x/i);
                s = s + a;
            }

            return s;
        }
    }
}
