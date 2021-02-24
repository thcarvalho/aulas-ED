package Ex02;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    int op = 0;
    List list = new List();
    String element;
    int position;

    while (op != 9) {
      op = Integer.parseInt(JOptionPane.showInputDialog(
          "\nEscolha uma opção" +
              "\n1. Verificar lista" +
              "\n2. Adicionar String no início" +
              "\n3. Adicionar String no final" +
              "\n4. Adicionar String em qualquer posição" +
              "\n5. Remover String do começo" +
              "\n6. Remover String do final" +
              "\n7. Remover String de qualquer posição" +
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
          element = JOptionPane.showInputDialog("Insira alguma string");
          list = ListFunctions.addStringOnBeginning(list, element);
          break;
        case 3:
          element = JOptionPane.showInputDialog("Insira alguma string");
          list = ListFunctions.addStringOnEnd(list, element);
          break;
        case 4:
          element = JOptionPane.showInputDialog("Insira alguma string");
          position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
          list = ListFunctions.addStringOnPosition(list, element, position);
          break;
        case 5:
          list = ListFunctions.removeStringOnBeginning(list);
          break;
        case 6:
          list = ListFunctions.removeStringOnEnd(list);
          break;
        case 7:
          position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
          list = ListFunctions.removeStringOnPosition(list, position);
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
