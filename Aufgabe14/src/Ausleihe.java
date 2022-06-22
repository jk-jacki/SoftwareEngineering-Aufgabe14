import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Ausleihe {

    public Medium ausleihMedium;
    private int idDesAusleihers;
    private Date rückgabeDatum;
    private int verlängerCounter;

    Ausleihe(Medium ausleihMedium){
        this.ausleihMedium = ausleihMedium;
        this.verlängerCounter = 0;
    }

    public Date rückgabedatumFestlegen() {
        rückgabeDatum = Date.from((LocalDate.now().plusMonths(1)).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(rückgabeDatum);
        return rückgabeDatum;
    }

    public boolean verlängerCounterIncrease() {
        if(verlängerCounter < 3) {
            verlängerCounter++;
            return true;
        }
        else {
            System.out.println("Sie haben das Medium bereits zu oft verlängert.");
            return false;
        }
    }

    public void ausleiherIDsetzen(int id) {
        idDesAusleihers = id;
        System.out.println("Ausleiher ID: " + idDesAusleihers);
    }

}