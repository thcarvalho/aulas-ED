import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    Queue queue = new Queue(5);
    int opc = 0;

    while (opc != 9) {
      opc = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO:" +
          "\n1. Adicionar" +
          "\n2. Remover" +
          "\n3. Listar" +
          "\n9. Sair"));
      switch (opc) {
        case 1:
          int value = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
          queue.add(value);
          break;
        case 2:
          queue.remove();
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
