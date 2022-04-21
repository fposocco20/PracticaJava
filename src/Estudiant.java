public class Estudiant extends Persona {
//hereda tot el que té Persona gràcies al "extends Persona"
    private double nota;

    public Estudiant(){ //Constructors
    }

    public void posarNota(double nota){
        if (this.nota >0 && this.nota <= 10) {
            this.nota = nota;
        }
        else{
            System.out.println("Error. La nota ha d'estar entre el 0.1 i el 10.");
        }
    }
    public String obtenirDades(){
        return super.obtenirDades() + ", es estudiant i te una nota de " + this.nota;
    }
}
