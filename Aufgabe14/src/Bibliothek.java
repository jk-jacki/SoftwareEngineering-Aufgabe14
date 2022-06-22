import java.util.ArrayList;

public class Bibliothek {

    private ArrayList<Medium> bibliotheksbestand;
    private ArrayList<Ausleiher> registrierteAusleiher;
    private ArrayList<Mitarbeiter> mitarbeiter;
    private ArrayList<Medium> anschaffungsListe;

    Bibliothek(ArrayList<Medium> bibliotheksbestand, ArrayList<Ausleiher> registrierteAusleiher, ArrayList<Mitarbeiter> mitarbeiter, ArrayList<Medium> anschaffungsListe){
        this.bibliotheksbestand = bibliotheksbestand;
        this.registrierteAusleiher = registrierteAusleiher;
        this.mitarbeiter = mitarbeiter;
        this.anschaffungsListe = anschaffungsListe;
    }

    public boolean verfügbarkeitAbfragen() {
        // TODO - implement Bibliothek.verfügbarkeitAbfragen
        throw new UnsupportedOperationException();
    }

    public void anschaffungswunschEntgegennehmen() {
        // TODO - implement Bibliothek.anschaffungswunschEntgegennehmen
        throw new UnsupportedOperationException();
    }

}