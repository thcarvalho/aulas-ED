import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    Queue queue = new Queue(5);
    int opc = 0;

    while (opc != 9) {
      opc = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO:" +
          "\n1. Adicionar livro" +
          "\n2. Remover livro" +
          "\n3. Listar fila" +
          "\n9. Sair"));

      switch (opc) {
        case 1:
          String bookName = JOptionPane.showInputDialog("Informe o nome do livro");
          int bookQuantity = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de exemplares"));
          Book book = new Book(bookName, bookQuantity);

          queue.enqueue(book);
          break;
        case 2:
          queue.dequeue();
          break;
        case 3:
          queue.map();
          break;
        case 9:
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção invalida");
          break;
      }
    }
  }
}
