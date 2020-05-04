public class WyswietlaczCelsjusza implements Obserwator{
    @Override
    public void ustaw(Subject s) {
        System.out.println("Temperatura w Celcjuszach: " + ((CzujnikTemperatury)s).getNowaTemperatura() +" *C");
    }

}
