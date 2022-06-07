import javax.swing.JOptionPane;

public class agenda8 {

    public static void main(String[] args) {
        char opinion;
        int cont = 0;
        int age;
        int otimo = 0, bom = 0, regular = 0, ruim = 0, pessimo = 0;


        JOptionPane.showMessageDialog(null, "Olá, bem vindo ao prgama de verificação de opiniões");

        while (cont<5) {
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva a sua idade:"));

            opinion = JOptionPane.showInputDialog(null, "Digite a sua opinião sendo: (Em maiúscula) " +
                                                                                "\n A- Ótimo"+
                                                                                "\n B- Bom"+
                                                                                "\n C- Regular"+
                                                                                "\n D- Ruim"+
                                                                                "\n E- Péssimo").charAt(0);

        switch (opinion) {

            case 'A' :
                otimo += 1;

                break;

            

            case 'B' :
                bom += 1;
        
                break;
            

            case 'C' :
                regular += 1;
                
                break;
            

            case 'D' :
                ruim += 1;
                
                break;
            

            case 'E' :
                pessimo += 1;
                
                break;
            

            default:

            JOptionPane.showMessageDialog(null, "Entrada incorreta");
        }                                                               
            
         
        cont +=1;
        }

        JOptionPane.showMessageDialog(null, "Formulario completo!" +
                                        "\n Vamos para as análises:");
        
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas que receberam ótimo: " + otimo );

        JOptionPane.showMessageDialog(null, "Média de idade das pessoas que responderam ruim: " + "X" );

        JOptionPane.showMessageDialog(null, "Porcentagem de respostas péssimo: " + (pessimo * 100)/(otimo + pessimo + bom + regular + ruim) + "%" );

        


    }





}
