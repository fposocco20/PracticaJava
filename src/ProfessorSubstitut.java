public class ProfessorSubstitut extends Professor{

    private double sou;
    private String dataInici;
    private String dataFi;

    public void assisgnarSubstitucio(String dataInici,String dataFi){
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }
    public String obtenirDades(){
        return super.obtenirDades() + ". Es professor/e substitut/e amb les seguents dates assignades; data d'inici de substitucio: " + dataInici + ". Data de fi de substitucio: " + dataFi + ".";
    }
}
