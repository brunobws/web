import javax.swing.JOptionPane;

public class agenda10 {

    public static void main(String[] args) {

        int progam [] [] = new int [10] [10];

        String display = "";
        int soma = 0;

        JOptionPane.showMessageDialog(null, "Olá bem vindo ao promgrama de marizes");

        for(int i = 0; i <10; i++) {
            for(int j = 0; j <10; j++) {
                progam [i] [j] = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número para que:" 
                                                                            + "\n Linha: " + i                                                                                       
                                                                            + "\n coluna: " + j));
                soma += progam [i] [j];
        }
        
            }

            for(int i = 0; i <10; i++) {
                for(int j = 0; j <10; j++) {
                    display += progam [i] [j] + " | ";
            }

             display += "\n";

                }

            JOptionPane.showMessageDialog(null, "Progama de matrizes finalizado");

            JOptionPane.showMessageDialog(null, "A matriz resultou em:"
                                                + "\n" +   display);
            JOptionPane.showMessageDialog(null, "A soma de todos os valores dessa matriz é: " + soma );

    }

}

    

