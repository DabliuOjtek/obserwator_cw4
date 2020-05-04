public class WyswietlaczFahrenheita implements Obserwator{
    @Override
    public void ustaw(Subject s) {
        System.out.println("Temperatura w Fahrenheitach: " + ((((CzujnikTemperatury)s).getNowaTemperatura()*1.8)+32) +" *F");
    }
}
