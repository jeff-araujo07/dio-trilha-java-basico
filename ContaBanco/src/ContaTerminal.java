import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o Número da Conta: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o Número da Agência: ");
        String agencia = scan.nextLine();

        System.out.print("Digite o Nome Completo: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Informe o saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}