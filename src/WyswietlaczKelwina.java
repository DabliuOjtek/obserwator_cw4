public class WyswietlaczKelwina implements Obserwator{
    @Override
    public void ustaw(Subject s) {
        System.out.println("Temperatura w Kelwinach: " + (((CzujnikTemperatury)s).getNowaTemperatura()+ 273.15) +" *K");
    }

}

