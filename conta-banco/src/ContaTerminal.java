import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite o Número da Agencia:");
        String agencia = input.nextLine();

        System.out.println("Por favor digite o Número da Conta:");
        int numero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor digite o Nome do Cliente:");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor digite o Saldo da Conta:");
        double saldo = input.nextDouble();

        input.nextLine();        
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+String.format("%.2f", saldo)+" já está disponível para saque.");
    }
}
