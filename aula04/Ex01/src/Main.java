import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Stack stack = new Stack(10);
        int opc = 0; //Alocação de espaço em memória para 'opc'

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO:" +
                    "\n1. Verificar fila" +
                    "\n2. Adicionar pessoa" +
                    "\n3. Remover pessoa" +
                    "\n4. Mapear fila" +
                    "\n5. Pesquisar ordem de espera" +
                    "\n6. Verificar pilha de removidos" +
                    "\n9. Sair"));

            switch (opc) {
                case 1:
                    queue.checkQueue();
                    break;
                case 2:
                    //Espaços de memória alocados para formação de objeto 'Person'
                    String name = JOptionPane.showInputDialog("Informe o nome da pessoa");
                    int RG = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do RG"));
                    int phone = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do telefone"));
                    String birthDate = JOptionPane.showInputDialog("Informe a data de nascimento");
                    Date birthDateConverted = null;

                    try {
                        birthDateConverted = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    Person person = new Person(name, RG, phone, birthDateConverted);

                    queue.enqueue(person);
                    break;
                case 3:
                    try {
                        Person personRemoved = queue.dequeue(); //Alocado espaço de memória para 'personRemoved'
                        stack.push(personRemoved);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    queue.map();
                    break;
                case 5:
                    String personName = JOptionPane.showInputDialog("Informe o nome da pessoa");
                    queue.searchPosition(personName);
                    break;
                case 6:
                    stack.map();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
                    break;
            }
        }
    }
}
