import java.util.Scanner;

public class agenda4 {

    public static void main (String[] args) {
        String nome;
        float nota1;
        float nota2;
        float media;

        Scanner leitor = new Scanner (System.in);

        System.out.println ("Digite o nome do aluno: ");
        nome=leitor.next ();

        System.out.println ("Digite a primeira nota: ");
        nota1=leitor.nextInt();

        System.out.println ("Digite a segunda nota: ");
        nota2=leitor.nextInt();

        media = (nota1 + nota2)/2;

        System.out.println ("Olá, a nota de " + nome + " é = " + media);
        
    }
    
}


