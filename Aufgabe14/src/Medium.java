import java.util.ArrayList;
import java.util.Date;

public class Medium {

    public boolean istAusgeliehen;
    private Ausleiher ausleiher;
    private Date ausgeliehenBis;
    private ArrayList<Ausleiher> interessentenListe;
    private int anzahl;
    private int verfügbareAnzahl;
    private boolean istVorbestellt;
    private String kategorie;


    Medium(boolean istAusgeliehen, Ausleiher ausleiher, Date ausgeliehenBis, ArrayList<Ausleiher> interessentenListe, int anzahl, int verfügbareAnzahl, boolean istVorbestellt, String kategorie){
        this.istAusgeliehen = istAusgeliehen;
        this.ausleiher = ausleiher;
        this.ausgeliehenBis = ausgeliehenBis;
        this.interessentenListe = interessentenListe;
        this.anzahl = anzahl;
        this.verfügbareAnzahl = verfügbareAnzahl;
        this.istVorbestellt = istVorbestellt;
        this.kategorie = kategorie;
    }

    public boolean ausleihbar() {
        if(verfügbareAnzahl > 0)
            return true;
        else
            return false;
    }

    public void ausleihen(Ausleiher ausleiher, Date rückgabeDatum) {
        istAusgeliehen = true;
        this.ausleiher = ausleiher;
        this.ausgeliehenBis = rückgabeDatum;
        verfügbareAnzahl--;
    }
}