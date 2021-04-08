import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        List list = new List();
        double element;
        int position;

        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "\nEscolha uma opção" +
                    "\n1. Verificar lista" +
                    "\n2. Adicionar Temperatura no início" +
                    "\n3. Adicionar Temperatura no final" +
                    "\n4. Adicionar Temperatura em qualquer posição" +
                    "\n5. Remover Temperatura do começo" +
                    "\n6. Remover Temperatura do final" +
                    "\n7. Remover Temperatura de qualquer posição" +
                    "\n8. Percorrer lista" +
                    "\n9. Encerrar"
            ));

            switch (op) {
                case 1:
                    list.verifyList();
                case 2:
                    element = Double.parseDouble(JOptionPane.showInputDialog("Insira alguma temperatura"));
                    list.addTemperatureOnBeginning(element);
                    break;
                case 3:
                    element = Double.parseDouble(JOptionPane.showInputDialog("Insira alguma temperatura"));
                    list.addTemperatureOnEnd(element);
                    break;
                case 4:
                    element = Double.parseDouble(JOptionPane.showInputDialog("Insira alguma temperatura"));
                    position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
                    list.addTemperatureOnPosition(element, position);
                    break;
                case 5:
                    list.removeTemperatureOnBeginning();
                    break;
                case 6:
                    list.removeTemperatureOnEnd();
                    break;
                case 7:
                    position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
                    list.removeTemperatureOnPosition(position);
                    break;
                case 8:
                    list.mapList();
                    break;
                case 9:
                    break;
                default:
                    break;
            }
        }
    }
}
