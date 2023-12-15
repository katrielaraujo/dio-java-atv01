import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String clienteNome = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.3f já está disponível para saque",clienteNome,agencia,numero,saldo);
    }
}