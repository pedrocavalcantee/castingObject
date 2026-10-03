import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Notebook", 2500.0);
        Produto outroProduto = new Produto("Smartphone", 1500.0);
        Produto terceiroProduto = new Produto("Tablet", 800.0);
        double mediaPreco = 0;

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(outroProduto);
        produtos.add(terceiroProduto);

        for (Produto item : produtos) {
            System.out.println(item.getNome() + " R$ " + item.getPreco());
            mediaPreco += item.getPreco();

        }

        mediaPreco /= produtos.size();
        System.out.println("A média dos preços dos produtos é: R$ " + mediaPreco);
        }
}