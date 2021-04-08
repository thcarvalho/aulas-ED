import javax.swing.*;

public class List {
    private Node begin;
    public int length;

    public List() {
        begin = null;
    }

    public void verifyList() {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }
        JOptionPane.showMessageDialog(null, "Lista com elementos");
    }

    public void addTemperatureOnBeginning(double element) {
        Node node = new Node(element);
        node.next = begin;
        begin = node;
        length++;
    }

    public void addTemperatureOnEnd(double element) {
        if (begin == null) {
            Node node = new Node(element);
            begin = node;
        } else {
            Node temp = getLastNode(begin);
            Node node = new Node(element);
            temp.next = node;
        }
        length++;
    }

    public void addTemperatureOnPosition(double element, int position) {
        if (position == 1) {
            addTemperatureOnBeginning(element);
            return;
        }
        if (position == length) {
            addTemperatureOnEnd(element);
            return;
        }
        if (position > length) {
            JOptionPane.showMessageDialog(null, "Posição invalida");
            return;
        }

        Node node = new Node(element);
        Node temp = getNodeOnPosition(position-1, 1, begin);
        Node temp2 = getNodeOnPosition(position, 1, begin);
        temp.next = node;
        node.next = temp2;

        length++;
    }

    public void removeTemperatureOnBeginning() {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }
        double removed = begin.data;
        begin = begin.next;
        JOptionPane.showMessageDialog(null, "Elemento removido: " + removed);
        length--;
    }

    public void removeTemperatureOnEnd() {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }

        Node node = getNodeOnPosition(length -1, 1, begin);
        double removed = node.next.data;
        node.next = null;

        JOptionPane.showMessageDialog(null, "Elemento removido: " + removed);
        length--;
    }

    public void removeTemperatureOnPosition(int position) {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }
        if (position == 1) {
            removeTemperatureOnBeginning();
            return;
        }
        if (position == length) {
            removeTemperatureOnEnd();
            return;
        }
        if (position > length) {
            JOptionPane.showMessageDialog(null, "Posição inválida");
            return;
        }

        Node removed = getNodeOnPosition(position, 1, begin);
        Node aux = getNodeOnPosition(position-1, 1, begin);

        aux.next = removed.next;

        JOptionPane.showMessageDialog(null, "Elemento removido: " + removed.data);
        length--;
    }

    // Recursividade direta: o método chama ele mesmo para achar o ultimo nó da lista
    public Node getLastNode(Node node) {
        if (node.next != null) {
            return getLastNode(node.next);
        }
        return node;
    }

    // Recursividade direta:
    // o método chama ele mesmo utilizando o tamanho da lista e a posição informada por parametro pra encontrar o elemento
    public Node getNodeOnPosition(int position, int aux, Node node) {
        if (node.next != null && aux != position) {
            return getNodeOnPosition(position, aux+1, node.next);
        }
        return node;
    }

    public void mapList() {
        Node temp = begin;
        String result = "";
        while (temp != null) {
            result = result + "\n" + temp.data;
            temp = temp.next;
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
