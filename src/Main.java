public class Main {
    public static void main(String[] args) {
        CzujnikTemperatury czujnikTemperatury = new CzujnikTemperatury();

        WyswietlaczCelsjusza wyswietlaczCelsjusza = new WyswietlaczCelsjusza();
        WyswietlaczFahrenheita wyswietlaczFahrenheita = new WyswietlaczFahrenheita();
        WyswietlaczKelwina wyswietlaczKelwina = new WyswietlaczKelwina();

        czujnikTemperatury.dodajObserwatora(wyswietlaczCelsjusza);
        czujnikTemperatury.dodajObserwatora(wyswietlaczFahrenheita);
        czujnikTemperatury.dodajObserwatora(wyswietlaczKelwina);

        czujnikTemperatury.ustaw(20);
        czujnikTemperatury.ustaw(10);
        czujnikTemperatury.ustaw(-50.5);

    }
}