import java.util.ArrayList;
import java.util.Arrays;

public class Institut {
    private String nom;

    ArrayList<Persona> persones = new ArrayList<Persona>();
    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void afegirProfe(Professor professor){
        persones.add(professor);
    }
    public void afegirEstudiant(Estudiant estudiant){
        persones.add(estudiant);
    }


    public void imprimirInformacio(){
        for (int i=0; i<persones.size(); i++){
            String dades = persones.get(i).obtenirDades();
            System.out.println(dades);
        }
    }
}
