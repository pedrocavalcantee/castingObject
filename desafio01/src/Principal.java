import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        //Criando a ArrayList e inicializando valores
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Gui");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Iasmin");

        //Percorrendo e imprimindo os valores da ArrayList
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}
