import java.util.Date;

public class ProfessorSubstitut extends Professor{

    //private double sou;
    private Date dataInici;
    private Date dataFi;

    public void assisgnarSubstitucio(Date dataInici,Date dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }
    public String obtenirDades(){
        return super.obtenirDades() + ". Es professor/e substitut/e amb les seguents dates assignades; data d'inici de substitucio: " + dataInici.toString() + ". Data de fi de substitucio: " + dataFi.toString() + ".";
    }
}
