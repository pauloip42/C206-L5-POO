public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }


    void mostraInfo(){
        System.out.println("Codigo de Serie: " + this.codigoSerie);
        System.out.println("Codigo do Produto: " + this.codigoProduto);
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " +  this.categoria);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
