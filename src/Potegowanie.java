public class Potegowanie {

    public static void main(String[] args) {

        // POTEGOWANIE PRZY UZYCIU KLASY Math

		double a = Math.pow(5,2);
		System.out.println(a);


	    // POTEGOWANIE NA PIECHOTE


		double x = 5;
		int k = 2;
		double suma = 1;

		if(k == 0) {
			suma = 1;
		} else {
			for(int i = 1; i <= k; i++){
				suma = suma * x;
			}
		}
		System.out.println(suma);
	}
}

