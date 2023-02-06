import CadEvento.CadEvento;
import participantes.Participantes;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Participantes p1 = new Participantes();
        CadEvento semanaAcademica = new CadEvento();

        //p1.participante();
        semanaAcademica.CadastroEvento();
    }
}
