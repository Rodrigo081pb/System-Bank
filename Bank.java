import java.util.Locale;
import java.util.Scanner;

public class Bank {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Informe o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        // Imprimindo

        System.out.println("Olá " + nome + ", sua Agência é " + agencia + ", o seu saldo é de R$ "
                + String.format(Locale.US, "%.2f", saldo)
                + ". O número da sua conta é " + conta + ". Seja bem-vindo ao IndraBank.");

    }

}
