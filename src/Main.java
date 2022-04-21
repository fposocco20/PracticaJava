public class Main {
    public static void main(String[] args) {
        Persona p = new Persona(); //Instància de Persona

        Persona p1 = new Persona();
            p1.canviarNom("Persona");
            p1.assignarDni("47125637T");
            String dades = p1.obtenirDades();
            System.out.println(dades);
            p1.assignarDni("489636587D"); //Excepció 3a

        Estudiant e = new Estudiant();
            e.canviarNom("Fabio");
            e.assignarDni("48220948E");
            e.posarNota(9.5);
            dades = e.obtenirDades();
            System.out.println(dades);
            e.posarNota(-1); //Excepció 3c
            e.posarNota(12); //Excepció 3c

        Professor t = new Professor();
            t.canviarNom("Oriol");
            t.assignarDni("46538262Q");
            t.canviarSou(2500.00);
            dades = t.obtenirDades();
            System.out.println(dades);
            t.canviarSou(3001); //Excepció 3b
            t.canviarSou(-1); //Excepció 3b

        ProfessorSubstitut subT = new ProfessorSubstitut();
            subT.canviarNom("Marc");
            subT.assignarDni("47852364R");
            subT.canviarSou(1200.00);
            subT.assisgnarSubstitucio("07/04/2022", "20/05/2022");
            dades = subT.obtenirDades();
            System.out.println(dades);

    }
}