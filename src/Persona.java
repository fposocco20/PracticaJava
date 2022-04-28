public class Persona {
    //atributs (sempre privats)
    private String nom;
    private String dni;
    //funcions (poden ser publiques o privades)
    public Persona(){
        //Constructores no porten tipus de retorn
    }

    //aquesta funció canvia el nom
    public void canviarNom(String nom){
        this.nom = nom;
    }
    public void assignarDni(String dni) throws Exception {
        if (this.dni == null) {
            this.dni = dni;
        }
        else {
            throw new Exception("Error. Ja hi havia un dni assignat a aquesta persona.");
        }
    }
    //funció que retorna nom i dni de la persona
    public String obtenirDades() throws Exception {
        if (this.dni == null || this.nom == null){
            throw new Exception("Error. Aquesta persona no te nom o dni assignats.");
        }
        else {
            return "Aquesta persona es diu " + this.nom + ", amb DNI: " + this.dni;
        }
    }
}
