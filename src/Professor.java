public class Professor extends Persona {
    private double sou;

    public Professor(){ //Constructors
    }

    public void canviarSou(double nouSou) throws Exception {
        if (nouSou < 3000 && nouSou > 0) {
            this.sou = nouSou;
        }
        else {
            throw new Exception("Error, el sou ha de ser superior a 0 i inferior a 3000.");
        }
    }

    public String obtenirDades() throws Exception {
        return super.obtenirDades() + ", es professor/a i te un sou de " + this.sou;
    }
}
