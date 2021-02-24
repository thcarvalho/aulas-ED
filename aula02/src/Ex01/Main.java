package Ex01;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    int op = 0;
    List list = new List();
    char element;
    int position;

    while (op != 9) {
      op = Integer.parseInt(JOptionPane.showInputDialog(
          "\nEscolha uma opção" +
              "\n1. Verificar lista" +
              "\n2. Adicionar caractere no início" +
              "\n3. Adicionar caractere no final" +
              "\n4. Adicionar caractere em qualquer posição" +
              "\n5. Remover caractere do começo" +
              "\n6. Remover caractere do final" +
              "\n7. Remover caractere de qualquer posição" +
              "\n8. Percorrer lista" +
              "\n9. Encerrar"
      ));

      switch (op) {
        case 1:
          String response = ListFunctions.verifyList(list);
          if (response == "full") {
            JOptionPane.showMessageDialog(null, "Lista está cheia");
            break;
          } else if (response == "empty") {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
            break;
          } else {
            JOptionPane.showMessageDialog(null, "Lista tem espaços a preencher");
            break;
          }
        case 2:
          element = JOptionPane.showInputDialog("Insira algum caracter").charAt(0);
          list = ListFunctions.addCharOnBeginning(list, element);
          break;
        case 3:
          element = JOptionPane.showInputDialog("Insira algum caracter").charAt(0);
          list = ListFunctions.addCharOnEnd(list, element);
          break;
        case 4:
          element = JOptionPane.showInputDialog("Insira algum caracter").charAt(0);
          position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
          list = ListFunctions.addCharOnPosition(list, element, position);
          break;
        case 5:
          list = ListFunctions.removeCharOnBeginning(list);
          break;
        case 6:
          list = ListFunctions.removeCharOnEnd(list);
          break;
        case 7:
          position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
          list = ListFunctions.removeCharOnPosition(list, position);
          break;
        case 8:
          JOptionPane.showMessageDialog(null, ListFunctions.mapList(list));
          break;
        case 9:
          break;
        default:
          break;
      }
    }
  }
}
