import java.util.ArrayList;

public class Estudiant extends Persona {
//hereda tot el que té Persona gràcies al "extends Persona"
    private double nota;

    public Estudiant(){ //Constructors
    }

    ArrayList<Double> notes = new ArrayList<>();
    public void posarNota(double nota) throws Exception {
        if (nota > 0.0 && nota < 10.1) {
            notes.add(nota);
        }
        else{
            throw new Exception("Error, la nota no pot ser inferior a 0 ni superior a 10.");
        }
    }
    public String obtenirDades() throws Exception {
        return super.obtenirDades() + ", es estudiant. " + obtenirNotes() + ". "
                + obtenirNotaMitja() + ". " + obtenirNotaAlta() + ". " + obtenirNotaBaixa();
    }

    public String obtenirNotes() throws Exception{
        String n = "";
        for (int i=0; i< notes.size();i++){
            n = n + "  " + notes.get(i);
        }
        return ("Llistat de notes de l'alumne:") + n;
    }

    public String obtenirNotaMitja(){
        double n = 0.0;
        for (int i=0; i< notes.size(); i++){
            n = n + notes.get(i);
        }
        double mitjana = n / notes.size();
        double roundOff = Math.round(mitjana * 100.0) / 100.0;
        return ("La nota mitjana d'aquest alumne es: ") + roundOff;
    }

    public String obtenirNotaAlta(){
        double n = 0.0;
        for (int i =0; i<notes.size(); i++) {
            if (n < notes.get(i)) {
                n = notes.get(i);
            }
        }
        return "La nota mes alta es " + n;
    }

    public String obtenirNotaBaixa(){
        double n = 10.0;
        for (int i =0; i<notes.size(); i++) {
            if (n > notes.get(i)) {
                n = notes.get(i);
            }
        }
        return "La nota mes baixa es " + n + ". ";
    }
}
