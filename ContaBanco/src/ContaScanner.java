import java.util.Locale;
import java.util.Scanner;

public class ContaScanner {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);

        System.out.println("Por favor, digite o n\u00famero da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o n\u00famero da Ag\u00eancia ");
        String agencia = scanner.next();

        System.out.println("Por favor, entre com nome ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, entre com saldo da conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já estão disponível para saque");
        scanner.close();
    }
}
