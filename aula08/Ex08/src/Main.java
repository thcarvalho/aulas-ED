import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção: \n" +
                    "1. Inserir\n" +
                    "2. Remover\n" +
                    "3. Pesquisar\n" +
                    "4. Exibir\n" +
                    "9. Sair"
            ));
            switch (opc) {
                case 1:
                    tree.insert(Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para inserir")));
                    break;
                case 2:
                    tree.remove(Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para remover")));
                    break;
                case 3:
                    try {
                        System.out.println(tree.get(Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para pesquisar"))));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    tree.print();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
            }
        }
    }
}
