public class Professor extends Persona {
    private double sou;

    public Professor(){ //Constructors
    }

    public void canviarSou(double nouSou) {
        if (nouSou < 3000 && nouSou > 0) {
            this.sou = nouSou;
        }
        else {
            System.out.println("Error, el sou ha de ser superior a 0 i inferior a 3000.");
        }
    }

    public String obtenirDades(){
        return super.obtenirDades() + ", es professor/a i te un sou de " + this.sou;
    }
}
