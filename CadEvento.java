
import java.util.ArrayList;
import java.util.Scanner;

public class CadEvento {
  private ArrayList<EventoAcademico> eventos = new ArrayList<>();

  public void CadastroEvento() {
    Scanner input = new Scanner(System.in);
    
    while (true) {
      System.out.println("Escolha uma opção:");
      System.out.println("1. Cadastrar novo evento");
      System.out.println("2. Listar todos os eventos");
      System.out.println("3. Sair");

      int choice = input.nextInt();
      input.nextLine();

      switch (choice) {
        case 1:
          registrarEvento(input);
          break;
        case 2:
          listarEventos();
          break;
        case 3:
          System.out.println("Saindo...");
          return;
        default:
          System.out.println("Opção inválida.");
      }
    }
  }

  private void registrarEvento(Scanner input) {
    System.out.print("Nome do evento: ");
    String nome = input.nextLine();

    System.out.print("Data (dd/mm/aaaa): ");
    String data = input.nextLine();

    System.out.print("Local: ");
    String local = input.nextLine();

    EventoAcademico evento = new EventoAcademico(nome, data, local);
    eventos.add(evento);
    System.out.println("Evento cadastrado com sucesso.");
  }

  private void listarEventos() {
    System.out.println("Lista de eventos:");
    for (EventoAcademico evento : eventos) {
      System.out.println("- " + evento.getNome() + " em " + evento.getData() + " em " + evento.getLocal());
    }
  }

  static class EventoAcademico {
    private String nome;
    private String data;
    private String local;

    EventoAcademico(String nome, String data, String local) {
      this.nome = nome;
      this.data = data;
      this.local = local;
    }

    public String getNome() {
      return nome;
    }

    public String getData() {
      return data;
    }

    public String getLocal() {
      return local;
    }
  }
}
