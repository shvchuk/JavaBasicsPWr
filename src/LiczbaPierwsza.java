public class LiczbaPierwsza {


    public static boolean czyLiczbaPierwsza(int liczba) {
        System.out.println("Sprawdzamy czy liczba " + liczba + " jest pierwsza.");

        boolean liczbaPierwsza = true;

        if (liczba % 2 == 0) { // sprawdzamy czy podana liczba jest parzysta
            return false;
        } else {
            for (int i = 3; i <= liczba / 2; i = i + 2){ // sprawdzamy czy podana liczba dzieli się przez liczbę
                if (liczba % i == 0){ // nieparzystą 3, 5, 7, 9, 11 itd.
                    liczbaPierwsza = false;
                } else {
                    liczbaPierwsza = true;
                }
            }
        }
        return liczbaPierwsza;
    }

    public static void main(String[] args) { // metoda główna main

        System.out.println(czyLiczbaPierwsza(151));
    }

}
