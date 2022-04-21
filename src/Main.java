import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona(); //Instància de Persona
            String dades = p.obtenirDades();
            //System.out.println(dades); //Excepció 3d

        Persona p1 = new Persona();
            p1.canviarNom("Persona");
            p1.assignarDni("47125637T");
            //dades = p1.obtenirDades();
            //System.out.println(dades);
            //p1.assignarDni("489636587D"); //Excepció 3a


        Estudiant e = new Estudiant();
            e.canviarNom("Fabio");
            e.assignarDni("48220948E");
            e.posarNota(5.3);
            //dades = e.obtenirDades();
            //System.out.println(dades);
            //e.posarNota(-1); //Excepció 3c
            //e.posarNota(12); //Excepció 3c


        Professor t = new Professor();
            t.canviarNom("Oriol");
            t.assignarDni("46538262Q");
            t.canviarSou(2500.00);
            //dades = t.obtenirDades();
            //System.out.println(dades);
            //t.canviarSou(3001); //Excepció 3b
            //t.canviarSou(-1); //Excepció 3b

        ProfessorSubstitut subT = new ProfessorSubstitut();
            subT.canviarNom("Marc");
            subT.assignarDni("47852364R");
            subT.canviarSou(1200.00);
            Date dataInici = new Date(2022,04,7);
            Date dataFi = new Date(2022,05, 20);
            subT.assisgnarSubstitucio(dataInici, dataFi);
            //dades = subT.obtenirDades();
            //System.out.println(dades);

        Institut i = new Institut();
            i.canviarNom("La Guineueta");
            i.afegirEstudiant(e);
            i.afegirProfe(t);
            i.afegirProfe(subT);
            i.imprimirInformacio();

    }
}