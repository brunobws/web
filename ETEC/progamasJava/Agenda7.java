import javax.swing.JOptionPane;

public class Agenda7 {

    public static void main(String[] args) {
        // declaração de variaveis
        double price;
        String name;
        double desconto;

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao progama de desconto 50%");

        for (int contador = 0; contador <= 10; contador++) {

            name = JOptionPane.showInputDialog(null, "Repetições: " + contador
                    + "\n Digite o nome do produto: ");

            price = Double.parseDouble(JOptionPane.showInputDialog(null,"Item: " + name + "(" + contador + ")"
                    + "\n Digite o preço do produto: "));

            desconto = price / 2;

            JOptionPane.showMessageDialog(null, "Olá, o produto " + name + " com desconto aplicado resultou em: " + desconto);
        }

        JOptionPane.showMessageDialog(null, "Obrigado, tenha um bom dia");

    }
}