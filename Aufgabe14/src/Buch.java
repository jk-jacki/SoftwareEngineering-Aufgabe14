import java.util.ArrayList;
import java.util.Date;

public class Buch extends Medium {

    private int id;
    private String autor;
    private String verlag;
    private int isbn;
    private String titel;

    Buch(boolean istAusgeliehen,
         Ausleiher ausleiher,
         Date ausgeliehenBis,
         ArrayList<Ausleiher> interessentenListe,
         int anzahl,
         int verfügbareAnzahl,
         boolean istVorbestellt,
         String kategorie,
         int id,
         String titel,
         String verlag,
         String autor,
         int isbn){
        super(istAusgeliehen, ausleiher, ausgeliehenBis, interessentenListe, anzahl, verfügbareAnzahl, istVorbestellt, kategorie);
        this.id = id;
        this.titel = titel;
        this.verlag = verlag;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Konstruktor für neues Buch
    Buch(int anzahl, String kategorie, int id, String titel, String verlag, String autor, int isbn){
        super(false,null,null,null,anzahl, anzahl,false,kategorie);
        this.id = id;
        this.titel = titel;
        this.verlag = verlag;
        this.autor = autor;
        this.isbn = isbn;
    }
}