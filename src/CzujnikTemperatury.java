public class CzujnikTemperatury extends Subject{
    private double temperatura;

    public void ustaw(double nowaWartosc){
        temperatura = nowaWartosc;
        powiadomObserwatora();
    }

    public double getNowaTemperatura(){
        return temperatura;
    }

}
