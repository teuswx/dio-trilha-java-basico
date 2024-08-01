import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A agência: ");
        agencia = scanner.nextLine();
        System.out.println("O nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("O saldo: ");
        saldo = scanner.nextDouble();

        String resultado = cadastrarUsuario(numero, agencia, nomeCliente, saldo);

        System.out.println(resultado);
        scanner.close();
    }
    
    

    public  static String cadastrarUsuario(int numero, String agencia, String nomeCliente, double saldo){
        return "\nOlá ".concat(nomeCliente).
        concat(", obrigado por criar uma conta em nosso banco, sua agência é "
        .concat(agencia)
        .concat(", conta ")
        .concat(String.valueOf(numero))
        .concat(" e seu saldo ")
        .concat(String.valueOf(saldo)
        .concat(" já está disponível para saque.\n")));
    }
}
