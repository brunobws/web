import java.util.Scanner;

public class agenda3 {
       public static void main (String[] args) {

        String nome;
        long telefone;
        int serie;
        double media;

        Scanner leitor = new Scanner (System.in); 

         System.out.println ("Digite o nome do aluno: ");
         nome=leitor.next ();

         System.out.println ("Digite o telefone (Numero grande): ");
         telefone=leitor.nextLong ();

         System.out.println ("Digite a série (Apenas numeros): ");
         serie=leitor.nextInt ();

         System.out.println ("Digite a média: ");
         media=leitor.nextInt();

         System.out.println ("Dados do aluno:");
         System.out.println ("Nome: " + nome);
         System.out.println ("Telefone: " + telefone);
         System.out.println ("Série: " + serie);
         System.out.println ("Média: " + media);

        

        }
}