
import java.util.Scanner;

public class NumerosPrimos {
        public static void main(String[] args) {
                   Scanner tec = new Scanner(System.in);
                   
                   System.out.print("Número a ser analisado: ");
                   int num = tec.nextInt();  
//                   while(num > 1){
//                       if (num % (num - 1) == 0){
//                               System.out.println("Este número é divisível por " + num + ", logo, não é primo.");
//                               
//                       } else{
//                           System.out.println("Este número é primo.");
//                           
//                       }
//                       num--;
//                   }

                       if (num % 2 == 0 && num != 2){
                               System.out.println("Esse número é divisível por 2, logo, não é primo.");
                       } else if (num % 3 == 0 && num != 3){
                               System.out.println("Esse número é divisível por 3, logo, não é primo.");
                       } else if (num % 4 == 0 && num != 4){
                               System.out.println("Esse número é divisível por 4, logo, não é primo.");
                       } else if (num % 5 == 0 && num != 5){
                               System.out.println("Esse número é divisível por 5, logo, não é primo.");
                       } else if (num % 6 == 0 && num != 6){
                               System.out.println("Esse número é divisível por 6, logo, não é primo.");
                       } else if (num % 7 == 0 && num != 7){
                               System.out.println("Esse número é divisível por 7, logo, não é primo.");
                       } else if (num % 8 == 0 && num != 8){
                               System.out.println("Esse número é divisível por 8, logo, não é primo.");
                       } else if (num % 9 == 0 && num != 9){
                               System.out.println("Esse número é divisível por 9, logo, não é primo.");
                       } else if (num % 10 == 0 && num != 10){
                               System.out.println("Esse número é divisível por 10, logo, não é primo.");
                       } else{
                               System.out.println("Esse número é primo.");
                       }
    }
}
