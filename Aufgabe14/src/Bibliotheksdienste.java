import java.util.Date;

public class Bibliotheksdienste implements UserInterface{


    @Override
    public int chooseAction() {
        System.out.println("Bitte wählen Sie eine der folgenden Aufgaben: ");
        System.out.println("1: Eine ausleihberechtigte Person anlegen");
        System.out.println("2: Medium in den Bibliotheksbestand aufnehmen");
        System.out.println("3: Buch ausleihen");
        System.out.println("4: Buch verlängern");
        System.out.println("5: Buch zurückgeben");

        int input = 0;
        if (scanner.hasNextInt())
            input = scanner.nextInt();
        else
            System.out.println("Invalide Eingabe, bitte starten Sie das Programm neu.");
        return input;
    }

    @Override
    public Ausleiher addNewAusleiher(int userID) {
        System.out.println("Um einen neuen Ausleiher anzulegen, werden folgende Eingaben benötigt:");
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Alter: ");
        int alter = scanner.nextInt();
        String fakultät = scanner.next();

        Ausleiher neuerAusleiher = new Ausleiher(userID, name, alter, fakultät);
        return neuerAusleiher;
    }

    @Override
    public void addToBibliotheksbestand(Persistenzschicht persistenzschicht) {
        System.out.println("Um ein neues Buch anzulegen, werden folgende Eingaben benötigt:");

        System.out.println("Titel: ");
        String titel = scanner.next();
        System.out.println("Verlag: ");
        String verlag = scanner.next();
        System.out.println("Autor: ");
        String autor = scanner.next();
        System.out.println("ISBN: ");
        int isbn = scanner.nextInt();
        System.out.println("Kategorie: ");
        String kategorie = scanner.next();
        System.out.println("ID: ");
        int id = scanner.nextInt();
        System.out.println("Anzahl: ");
        int anzahl = scanner.nextInt();

        Buch neuanschaffung = new Buch(anzahl, kategorie, id, titel, verlag, autor, isbn);
        persistenzschicht.artikelHinzufügen(neuanschaffung);
    }

    @Override
    public boolean borrowBook() {
        return false;
    }

    @Override
    public Date extendBook() {
        return null;
    }

    @Override
    public boolean returnBook() {
        return false;
    }


}
