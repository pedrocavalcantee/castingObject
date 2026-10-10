import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        contaBancaria conta1 = new contaBancaria(225);
        conta1.setSaldo(320);

        contaBancaria conta2 = new contaBancaria(226);
        conta2.setSaldo(850);

        contaBancaria conta3 = new contaBancaria(227);
        conta3.setSaldo(654);

        ArrayList<contaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        double maiorSaldo = 0;

        for (int i = 0; i < contas.size(); i++) {
            double saldoAtual = contas.get(i).getSaldo();
            if(saldoAtual > maiorSaldo){
                maiorSaldo = saldoAtual;
            }
            System.out.println("O saldo da conta atual é: R$" + saldoAtual);
        }
        System.out.println("O maior saldo foi: R$" + maiorSaldo);
    }  
}
