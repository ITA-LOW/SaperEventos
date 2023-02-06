
import java.util.Scanner;

public class Participantes {
    public void participante(){
    Scanner input = new Scanner(System.in);
    System.out.println("Informações dos participantes do evento acadêmico:");
    
    System.out.print("Nome: ");
    String name = input.nextLine();

    System.out.print("Idade: ");
    int age = input.nextInt();

    System.out.print("Instituição de ensino: ");
    String educationInstitution = input.next();

    System.out.print("Área de estudo: ");
    String fieldOfStudy = input.next();

    System.out.println("Informações do participante:");
    System.out.println("Nome: " + name);
    System.out.println("Idade: " + age);
    System.out.println("Instituição de ensino: " + educationInstitution);
    System.out.println("Área de estudo: " + fieldOfStudy);
    }
}
