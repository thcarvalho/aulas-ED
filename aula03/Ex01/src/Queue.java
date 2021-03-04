import javax.swing.*;

public class Queue {
  private int data[];
  private int size;

  public Queue(int lenght) {
    data = new int[lenght];
    size = 0;
  }

  public void add(int value) {
    if (size >= data.length) {
      JOptionPane.showMessageDialog(null, "Fila cheia");
      return;
    }

    data[size] = value;
    size++;
  }

  public void remove() {
    if (size == 0) {
      JOptionPane.showMessageDialog(null, "Fila vazia");
      return;
    }

    JOptionPane.showMessageDialog(null, "Valor removido: " + data[0]);

    for (int i = 1; i < size; i++) {
      data[i - 1] = data[i];
    }

    size--;
  }

  public void map() {
    String result = "";
    for (int i = 0; i < size; i++) {
      result += data[i] + " ";
    }
      JOptionPane.showMessageDialog(null, result);
  }
}
