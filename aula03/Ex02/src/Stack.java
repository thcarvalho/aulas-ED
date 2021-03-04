import javax.swing.*;

public class Stack {
  private int data[];
  private int size;

  public Stack(int lenght) {
    data = new int[lenght];
    size = 0;
  }

  public void push(int value) {
    if (size >= data.length) {
      JOptionPane.showMessageDialog(null, "Pilha cheia");
      return;
    }

    data[size] = value;
    size++;
  }

  public int pop() throws Exception {
    if (size == 0) {
      JOptionPane.showMessageDialog(null, "Pìlha vazia");
      throw new Exception("Pilha vazia");
    } else {
      size--;

      int value = data[size];
      JOptionPane.showMessageDialog(null, "Valor removido: " + value);

      return value;
    }
  }

  public void map() {
    String result = "";
    for (int i = 0; i < size; i++) {
      result += data[i] + " ";
    }
    JOptionPane.showMessageDialog(null, result);
  }
}
