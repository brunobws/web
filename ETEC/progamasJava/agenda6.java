import javax.swing.JOptionPane;

public class agenda6 {

    public static void main (String [] args) {
     String name;
     int age;
      

        JOptionPane.showMessageDialog(null,"Bem vindo ao progama de calendário de vacinação");

        name = (JOptionPane.showInputDialog(null, "Digite o seu nome"));
        age = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite uma opção de acordo com a sua idade:"

                + "\n 1- Entre 80 a 85 anos"
                + "\n 2- Entre 75 a 79 anos"
                + "\n 3- Entre 70 a 74 anos"
                + "\n 4- Entre 65 a 69 anos"
                + "\n 5- Entre 60 a 64 anos"));
        
        

        switch (age) {

            case 1:

                JOptionPane.showMessageDialog(null, "Olá " + name + ", de acordo com o calendario de vacinação, o senhor(a) terá de vacinar na segunda-feira");

                break;

            case 2:

                JOptionPane.showMessageDialog(null, "Olá " + name + ", de acordo com o calendario de vacinação, o senhor(a) terá de vacinar na terça-feira");

                break;

            case 3:

                JOptionPane.showMessageDialog(null, "Olá " + name + ", de acordo com o calendario de vacinação, o senhor(a) terá de vacinar na quarta-feira");

                break;

            case 4:

                JOptionPane.showMessageDialog(null, "Olá " + name + ", de acordo com o calendario de vacinação, o senhor(a) terá de vacinar na quinta-feira");

                break;

            case 5:

                JOptionPane.showMessageDialog(null, "Olá " + name + ", de acordo com o calendario de vacinação, o senhor(a) terá de vacinar na sexta-feira");

                break;

            default:

                JOptionPane.showMessageDialog(null, "Olá " + name + ", o senhor(a) está fora deste período de vacinação");

               break;
            
        } 

        JOptionPane.showMessageDialog(null, "Obrigado!");

    }
    

}
   

    
