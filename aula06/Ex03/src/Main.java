import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        List list = new List();
        Student element;
        int position;

        while (op != 9) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "\nEscolha uma opção" +
                    "\n1. Verificar lista" +
                    "\n2. Adicionar aluno no início" +
                    "\n3. Adicionar aluno no final" +
                    "\n4. Adicionar aluno em qualquer posição" +
                    "\n5. Remover aluno do começo" +
                    "\n6. Remover aluno do final" +
                    "\n7. Remover aluno de qualquer posição" +
                    "\n8. Percorrer lista" +
                    "\n9. Encerrar"
            ));

            switch (op) {
                case 1:
                    list.verifyList();
                case 2:
                    element = generateStudent();
                    list.addStudentOnBeginning(element);
                    break;
                case 3:
                    element = generateStudent();
                    list.addStudentOnEnd(element);
                    break;
                case 4:
                    element = generateStudent();
                    position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
                    list.addStudentOnPosition(element, position);
                    break;
                case 5:
                    list.removeStudentOnBeginning();
                    break;
                case 6:
                    list.removeStudentOnEnd();
                    break;
                case 7:
                    position = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição"));
                    list.removeStudentOnPosition(position);
                    break;
                case 8:
                    list.mapList();
                    break;
                case 9:
                    break;
                default:
                    break;
            }
        }


    }

    static Student generateStudent() {
        String name = JOptionPane.showInputDialog("Insira o nome");
        int RA = Integer.parseInt(JOptionPane.showInputDialog("Insira o RA"));
        String currentClass = JOptionPane.showInputDialog("Insira sua turma");
        String semester = JOptionPane.showInputDialog("Insira o semestre atual");

        Student student = new Student(RA, name, currentClass, semester);
        return student;
    }
}
