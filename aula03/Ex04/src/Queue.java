import javax.swing.*;

public class Queue {
  private Book data[];
  private int size;

  public Queue(int lenght) {
    data = new Book[lenght];
    size = 0;
  }

  public void enqueue(Book value) {
    if (size >= data.length) {
      JOptionPane.showMessageDialog(null, "Fila cheia");
      return;
    }

    data[size] = value;
    size++;
  }

  public void dequeue() {
    if (size == 0) {
      JOptionPane.showMessageDialog(null, "Fila vazia");
      return;
    } else {
      Book value = data[0];
      JOptionPane.showMessageDialog(null, "Livro removido: " + value.getName());

      for (int i = 1; i < size; i++) {
        data[i - 1] = data[i];
      }

      size--;
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
