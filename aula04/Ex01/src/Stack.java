import javax.swing.*;

public class Stack {
    private Person data[];
    private int size;

    //Alocando endereços de memória através do construtor
    public Stack(int lenght) {
        data = new Person[lenght];
        size = 0;
    }

    public void push(Person value) {
        if (size >= data.length) {
            JOptionPane.showMessageDialog(null, "Pilha cheia");
            return;
        }

        data[size] = value;
        size++;
    }

    public void map() {
        String result = ""; //Alocação de espaço de memória para 'result'
        for (int i = 0; i < size; i++) {
            result += data[i].getName() + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
