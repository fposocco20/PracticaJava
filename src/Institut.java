import java.util.ArrayList;
import java.util.Arrays;

public class Institut {
    private String nom;

    ArrayList<Persona> persones = new ArrayList<Persona>();
    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void afegirPersona(Persona persona){
        persones.add(persona);
    }

    public void imprimirInformacio() throws Exception {
        System.out.println("Institut "+this.nom + ". Llistat de persones: ");
        for (int i=0; i<persones.size(); i++){
            String dades = persones.get(i).obtenirDades();
            System.out.println(dades);
            //System.out.println(persones.get(i).getClass());
        }
    }
}
