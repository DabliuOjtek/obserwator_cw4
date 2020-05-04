import java.util.ArrayList;

public class Subject {
    protected ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
    public void dodajObserwatora(Obserwator o){
        obserwatorzy.add(o);
    }
    public void usunObserwatora(Obserwator o){
        obserwatorzy.remove(o);
    }
    public void powiadomObserwatora(){
        for(Obserwator o: obserwatorzy){
            o.ustaw(this);
        }
    }
}
