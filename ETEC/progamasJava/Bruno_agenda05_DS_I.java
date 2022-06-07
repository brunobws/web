import javax.swing.JOptionPane;

public class Bruno_agenda05_DS_I {

    public static void main (String [] args) {
        int age;

        JOptionPane.showMessageDialog(null,"Bem vindo ao progama de verificação de idade");

        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade"));

        if (age>=60 && age<80) {
            JOptionPane.showMessageDialog(null, "Sua idade é de: " + age);
            JOptionPane.showMessageDialog(null, "Você está na fila prioritária");

        } else {
            if (age>=80) {
                JOptionPane.showMessageDialog(null, "Sua idade é de: " + age);
                JOptionPane.showMessageDialog(null, "Você está na fila 80+");
    
            }
        } 
        
       if (age<60) {

                JOptionPane.showMessageDialog(null, "Sua idade é de: " + age);
                JOptionPane.showMessageDialog(null, "Você está na fila comum");
    
        }
        
        
    }

}
