import javax.swing.JOptionPane;

public class agenda4_rcc {


public static void main (String[] args ) {
    double brasil;
    double regiao;
    String name_region;
    double process;

    JOptionPane.showMessageDialog(null, "Olá, bem vindo a progama de percentual de casos de covid regional brasileiro");

    brasil = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero de casos de covid no Brasil:"));

    name_region = JOptionPane.showInputDialog(null, "Digite o nome da região desejada:");

    regiao = Double.parseDouble(JOptionPane.showInputDialog(null, "Por fim, digite o numero de casos da região " + name_region));

    process = (regiao * 100)/brasil;

    JOptionPane.showMessageDialog(null, "olá, a região " + name_region + " teve " + process + "% de casos no brasil");







}
    
}