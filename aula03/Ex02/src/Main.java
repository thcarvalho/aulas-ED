import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    Stack stack = new Stack(5);
    Queue queue = new Queue(5);
    int opc = 0;

    try {
      while (opc != 9) {
        opc = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO:" +
            "\n1. Adicionar na pilha" +
            "\n2. Remover na pilha" +
            "\n3. Listar pilha" +
            "\n4. Adicionar na fila" +
            "\n5. Remover na fila" +
            "\n6. Listar fila" +
            "\n9. Sair"));

        switch (opc) {
          case 1:
            int stackValue = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
            stack.push(stackValue);
            break;
          case 2:
            int stackPop = stack.pop();
            queue.add(stackPop);
            break;
          case 3:
            stack.map();
            break;
          case 4:
            int queueValue = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
            queue.add(queueValue);
            break;
          case 5:
            int queueRemove = queue.remove();
            stack.push(queueRemove);
            break;
          case 6:
            queue.map();
            break;
          case 9:
            break;
          default:
            JOptionPane.showMessageDialog(null, "Opção invalida");
            break;
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
