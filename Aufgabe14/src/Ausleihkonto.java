import java.util.ArrayList;
import java.util.Date;

public class Ausleihkonto {

    private int idDesAusleihers;
    private ArrayList<Medium> ausleihliste;

    Ausleihkonto(int idDesAusleihers, ArrayList<Medium> ausleihliste){
        this.idDesAusleihers = idDesAusleihers;
        this.ausleihliste = ausleihliste;
    }
/*
    public Mahnung mahnungSchicken() {
        // TODO - implement Ausleihkonto.mahnungSchicken
        throw new UnsupportedOperationException();
    }
*/
    public Date mediumVerlängern() {
        // TODO - implement Ausleihkonto.mediumVerlängern
        throw new UnsupportedOperationException();
    }

    public String ausleihstatusAusgeben() {
        // TODO - implement Ausleihkonto.ausleihstatusAusgeben
        throw new UnsupportedOperationException();
    }

    public boolean abgabeDatumÜberschritten() {
        // TODO - implement Ausleihkonto.abgabeDatumÜberschritten
        throw new UnsupportedOperationException();
    }

    public boolean mediumReservieren() {
        // TODO - implement Ausleihkonto.mediumReservieren
        throw new UnsupportedOperationException();
    }

    public boolean abgabedatenAbfragen() {
        // TODO - implement Ausleihkonto.abgabedatenAbfragen
        throw new UnsupportedOperationException();
    }

    public void kontoAuflösen() {
        // TODO - implement Ausleihkonto.kontoAuflösen
        throw new UnsupportedOperationException();
    }

    public void listeVerlängern(Medium neueAusleihe) {
        ausleihliste.add(neueAusleihe);
        System.out.println("Neues Medium hinzugefügt.");
    }

    public void elementLöschen(Medium rückgabe) {
        ausleihliste.remove(rückgabe);
        System.out.println("Medium wurde entfernt.");
    }

}