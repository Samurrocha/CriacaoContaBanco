import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("coloque o número da conta");
        int numConta=input.nextInt();

        System.out.println("coloque o número da agência");
        String numAgência=input.next();

        System.out.println("coloque o seu nome");
        String nomeCliente=input.next();


        System.out.println("coloque o saldo da conta");
        double numSaldo=input.nextDouble();


        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+numAgência+", conta "+numConta+" ,e seu saldo "+numSaldo+" já está disponível para saque");




    }
}