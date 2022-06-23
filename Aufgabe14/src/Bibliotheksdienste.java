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
    public Ausleiher addNewAusleiher() {
        return null;
    }

    @Override
    public void addToBibliotheksbestand() {

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
