import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        RemovedProductsStack removedProductsStack = new RemovedProductsStack(10);
        int opc = 0; //Alocação de espaço em memória para 'opc'

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO:" +
                    "\n1. Verificar pilha" +
                    "\n2. Adicionar produto" +
                    "\n3. Remover produto" +
                    "\n4. Mapear pilha" +
                    "\n5. Pesquisar ordem de espera" +
                    "\n6. Verificar pilha de removidos" +
                    "\n9. Sair"));

            switch (opc) {
                case 1:
                    stack.checkStack();
                    break;
                case 2:
                    //Espaços de memória alocados para formação de objeto 'Product'
                    String name = JOptionPane.showInputDialog("Informe o nome do produto");
                    double value = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));

                    Product product = new Product(name, value, quantity);

                    stack.push(product);
                    break;
                case 3:
                    try {
                        Product productRemoved = stack.pop(); //Alocado espaço de memória para 'productRemoved'
                        removedProductsStack.push(productRemoved);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    stack.map();
                    break;
                case 5:
                    String productName = JOptionPane.showInputDialog("Informe o nome do produto");
                    stack.searchPosition(productName);
                    break;
                case 6:
                    removedProductsStack.map();
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
