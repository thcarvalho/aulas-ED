import javax.swing.*;

public class Stack {
  private Book data[];
  private int size;

  public Stack(int lenght) {
    data = new Book[lenght];
    size = 0;
  }

  public void push(Book value) {
    if (size >= data.length) {
      JOptionPane.showMessageDialog(null, "Pilha cheia");
      return;
    }

    data[size] = value;
    size++;
  }

  public void pop() {
    if (size == 0) {
      JOptionPane.showMessageDialog(null, "Pìlha vazia");
      return;
    } else {
      size--;

      Book value = data[size];
      JOptionPane.showMessageDialog(null, "Livro removido: " + value.getName());
    }
  }

  public void map() {
    String result = "";
    for (int i = 0; i < size; i++) {
      result += data[i].getName() + "\n";
    }
    JOptionPane.showMessageDialog(null, result);
  }
}
