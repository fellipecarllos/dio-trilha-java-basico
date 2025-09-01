import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Informe o número da Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Informe o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Informe o Saldo: ");
        double saldo = scanner.nextDouble();
        String mensagem = "Olá " + nomeCliente 
                + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero 
                + " e seu saldo R$ " + saldo 
                + " já está disponível para saque.";

        System.out.println(mensagem);
        scanner.close();
    }
}
