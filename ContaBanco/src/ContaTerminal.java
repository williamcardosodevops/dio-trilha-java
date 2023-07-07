public class ContaTerminal {
    public static void main(String[] args) throws Exception {

      String nomeCliente = args[0];

      String agencia = args[1];

      int numero = Integer.valueOf(args[2]);

      double saldo = Double.valueOf(args[3]);

      System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já estão disponível para saque");
    }
}
