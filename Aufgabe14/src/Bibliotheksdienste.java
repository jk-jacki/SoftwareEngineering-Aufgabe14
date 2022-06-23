import java.util.Date;

public class Bibliotheksdienste implements UserInterface{

    public void main(String[] args){
        int aktion = chooseAction();

        switch (aktion){
            case 1 :
                addNewAusleiher();
                break;
            case 2:
                addToBibliotheksbestand();
                break;
            case 3:
                borrowBook();
                break;
            case 4:
                extendBook();
                break;
            case 5:
                returnBook();
                break;
            default:
                System.out.println("Sie haben eine invalide Eingabe getätigt, bitte starten Sie das Programm neu.");
                break;
        }
    }

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
