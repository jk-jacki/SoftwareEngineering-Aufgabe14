import java.util.ArrayList;

public class Persistenzschicht {

    private ArrayList<Medium> bibliotheksbestand = null;
    private ArrayList<Ausleiher> registrierteAusleiher = null;

    public void artikelHinzufügen(Medium medium){
        bibliotheksbestand.add(medium);
    }

}
