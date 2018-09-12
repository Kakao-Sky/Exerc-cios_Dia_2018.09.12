
import java.util.Scanner;


public class SimuladorBanco {
    
     public static void main(String[] args) {

        Scanner TT = new Scanner(System.in);
        double saldo = 0;
        SimuladorBanco objeto = new SimuladorBanco();
        while (true){
            objeto.Menu();
            System.out.println("O que deseja fazer? ");
            int opcao = TT.nextInt();
            
            switch(opcao){
                case 1:
                    objeto.MostrarSaldo(saldo);
                    break;
                case 2:
                    objeto.Sacar(saldo);
                    break;
                case 3:
                    objeto.Depositar(saldo);
                    break;
                case 4:
                    objeto.Sair();
                    break;
                default:
                    System.out.println("Escolha uma opção válida e tente novamente.");
            }
        }
    }
    public void Menu(){
        System.out.println("______________________");
        System.out.println("___CAIXA_ELETRÔNICO___");
        System.out.println("______________________");
        System.out.println("1-Ver saldo");
        System.out.println("2-Sacar");
        System.out.println("3-Depositar");
        System.out.println("4-Sair");
    }
    
    public double MostrarSaldo(double saldo){
        System.out.println("Seu saldo é R$" + saldo);
        return saldo;
    }
    public double Sacar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Valor que deseja sacar: ");
        System.out.print("R$");
        
        double saque = tcl.nextDouble();
        saldo = saldo - saque;
        System.out.println("Seu saldo agora é R$" + saldo);

        return saldo;
    }
    public double Depositar(double saldo){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Valor que deseja depositar: ");
        System.out.print("R$");
        
        double deposito = tcl.nextDouble();
        saldo = saldo + deposito;
        System.out.println("Seu saldo agora é R$" + saldo);

        return saldo;
    }
    public void Sair(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Você deseja mesmo sair? ");
        System.out.println("Digite 'S' para sim e 'N' para Não, por favor, somente com letras maiúsculas.");
        String resposta = tec.next();
        
        switch(resposta){
            case "S":
                boolean confirmar = true;
                System.exit(0);
                break;
            case "N":
                Menu();
                break;
            default:
                System.out.println("Por favor, escolha uma opção válida e tente novamente.");
                System.out.println("Ou verifique se sua resposta 'S' ou 'N' foi com letras maiúsculas.");
        }
    }

    
}
