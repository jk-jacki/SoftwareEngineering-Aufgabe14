public class Main {
    public static void main(String[] args){
        Bibliotheksdienste dienst = new Bibliotheksdienste();

        int aktion = dienst.chooseAction();

        switch (aktion){
            case 1 :
                dienst.addNewAusleiher();
                break;
            case 2:
                dienst.addToBibliotheksbestand();
                break;
            case 3:
                dienst.borrowBook();
                break;
            case 4:
                dienst.extendBook();
                break;
            case 5:
                dienst.returnBook();
                break;
            default:
                System.out.println("Sie haben eine invalide Eingabe getätigt, bitte starten Sie das Programm neu.");
                break;
        }
    }
}