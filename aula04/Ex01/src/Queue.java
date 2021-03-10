import javax.swing.*;

public class Queue {
    private Person data[]; //Associação com a classe Person
    private int size;

    //Alocando endereços de memória através do construtor
    public Queue(int lenght) {
        data = new Person[lenght];
        size = 0;
    }

    public void checkQueue() {
        if (size == 0) {
            JOptionPane.showMessageDialog(null, "Fila vazia");
        } else if(size == data.length - 1) {
            JOptionPane.showMessageDialog(null, "Fila cheia");
        } else {
            JOptionPane.showMessageDialog(null, "Fila tem espaço");
        }
    }

    public void enqueue(Person value) {
        if (size >= data.length) {
            JOptionPane.showMessageDialog(null, "Fila cheia");
            return;
        }

        data[size] = value;
        size++;
    }

    public Person dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Fila vazia");
        } else {
            Person person = data[0]; //Alocação de espaço de memória para 'person'
            JOptionPane.showMessageDialog(null, "Pessoa removida: " + person.getName());

            for (int i = 1; i < size; i++) {
                data[i - 1] = data[i];
            }

            size--;
            return person;
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
