import javax.swing.*;

public class List {
    private Knot begin;

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

    public void addStudentOnBeginning(Student element) {
        Knot knot = new Knot(element);
        knot.next = begin;
        begin = knot;
    }

    public void addStudentOnEnd(Student element) {
        if (begin == null) {
            Knot knot = new Knot(element);
            begin = knot;
        } else {
            Knot temp = begin;
            while (temp.next != null) {
                temp = temp.next;
            }
            Knot knot = new Knot(element);
            temp.next = knot;
        }
    }

    public void addStudentOnPosition(Student element, int position) {
        Knot newKnot = new Knot(element);
        if (position == 1) {
            addStudentOnBeginning(element);
        } else {
            Knot temp = begin;
            int count = 1;
            while (temp.next != null && count < position - 1) {
                temp = temp.next;
                count++;
            }

            if (count == position - 1) {
                newKnot.next = temp.next;
                temp.next = newKnot;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel adicionar nessa posição");
            }
        }
    }

    public void removeStudentOnBeginning() {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }
        Student removed = begin.data;
        begin = begin.next;
        JOptionPane.showMessageDialog(null, "Elemento removido: " + removed.getName());
    }

    public void removeStudentOnEnd() {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }

        Student removed;

        if (begin.next == null) {
            removed = begin.data;
            begin = null;
        } else {
            Knot temp1 = begin;
            Knot temp2 = begin;

            while (temp1.next != null) {
                temp2 = temp1;
                temp1 = temp1.next;
            }

            removed = temp1.data;
            temp2.next = null;
        }

        JOptionPane.showMessageDialog(null, "Elemento removido: " + removed.getName());
    }

    public void removeStudentOnPosition(int position) {
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
            return;
        }
        if (position == 1) {
            removeStudentOnBeginning();
            return;
        }
        int i = 1;
        Knot temp = begin;

        while (temp.next!=null) {
            temp = temp.next;
            i++;
        }

        if (position == i) {
            removeStudentOnEnd();
            return;
        }
        if (position > i || position <= 0) {
            JOptionPane.showMessageDialog(null, "Não foi possivel remover nessa posição");
            return;
        }
        i = 1;
        temp = begin;
        Knot temp2 = temp;

        while (i != position) {
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        Student removed = temp.data;
        temp2.next = temp.next;
        JOptionPane.showMessageDialog(null, "Elemento removido: " + removed.getName());
    }

    public void mapList() {
        Knot temp = begin;
        String result = "";
        while (temp != null) {
            result = result + "\n" + temp.data.getName();
            temp = temp.next;
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
