import javax.swing.*;

public class Stack {
    private Product data[]; //Associação com a classe Product
    private int size;

    //Alocando endereços de memória através do construtor
    public Stack(int lenght) {
        data = new Product[lenght];
        size = 0;
    }

    public void checkStack() {
        if (size == 0) {
            JOptionPane.showMessageDialog(null, "Pilha vazia");
        } else if(size == data.length - 1) {
            JOptionPane.showMessageDialog(null, "Pilha cheia");
        } else {
            JOptionPane.showMessageDialog(null, "Pilha tem espaço");
        }
    }

    public void push(Product value) {
        if (size >= data.length) {
            JOptionPane.showMessageDialog(null, "Pilha cheia");
            return;
        }

        data[size] = value;
        size++;
    }

    public Product pop() throws Exception {
        if (size == 0) {
            throw new Exception("Pilha vazia");
        } else {
            Product product = data[0]; //Alocação de espaço de memória para 'product'
            JOptionPane.showMessageDialog(null, "Produto removido: " + product.getName());

            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
            }

            size--;
            return product;
        }
    }

    public void map() {
        String result = ""; //Alocação de espaço de memória para 'result'
        for (int i = 0; i < size; i++) {
            result += data[i].getName() + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public void searchPosition(String name){
        for (int i = 0; i < size; i++) {
            if (data[i].getName().toLowerCase().contains(name.toLowerCase())) {
                JOptionPane.showMessageDialog(null, name +" está na "+(i+1)+"° posição da fila");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, name +" não está na fila");
    }
}
