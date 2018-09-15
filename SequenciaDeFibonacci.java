
import java.util.Scanner;

public class SequenciaDeFibonacci {
        public static void main(String[] args) {
                Scanner tcl = new Scanner(System.in);
                
                int a = 1;
                int b = 1;
                int soma = a + b;
                
                System.out.println("Quantas posições deve ter esse vetor?");
                int NumP = tcl.nextInt();
                
                int vetor[] = new int[NumP];
                
                System.out.println(a);
                System.out.println(b);
                System.out.println(soma);
                for (int i = 0; i < vetor.length; i++) {
                       b = a;
                       a = soma;
                       soma = a + b;
                       
                       System.out.println(soma);
            }
    }
}
