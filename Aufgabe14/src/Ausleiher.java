import java.util.Date;
public class Ausleiher {

    private int id;
    private String name;
    private int alter;
    private String fakultät;

    Ausleiher(int id, String name, int alter, String fakultät){
        this.id = id;
        this.name = name;
        this.alter = alter;
        this.fakultät = fakultät;
    }

    public void ausleihen(Ausleihe ausleihe, Ausleihkonto konto) {
        // TODO - implement Ausleiher.ausleihen
        if(ausleihe.ausleihMedium.ausleihbar()) {
            konto.listeVerlängern(ausleihe.ausleihMedium);
            Date rückgabeDatum = ausleihe.rückgabedatumFestlegen();
            ausleihe.ausleiherIDsetzen(id);
            ausleihe.ausleihMedium.ausleihen(this, rückgabeDatum);

        }
        else {
            System.out.println("Ausleihe leider nicht möglich.");
        }
    }

    public void TitelAnfragen() {
        // TODO - implement Ausleiher.TitelAnfragen
        throw new UnsupportedOperationException();
    }

    public void rückgabe() {
        // TODO - implement Ausleiher.rückgabe
        throw new UnsupportedOperationException();
    }

    public String verlustmeldungSchicken() {
        // TODO - implement Ausleiher.verlustmeldungSchicken
        throw new UnsupportedOperationException();
    }

    public boolean anmelden() {
        // TODO - implement Ausleiher.anmelden
        throw new UnsupportedOperationException();
    }

}