public class Jogo implements Comparable<Jogo>{

    private double preco;

    private String genero;
    private String nome;

    public Jogo(String nome, double preco, String genero) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    public Jogo(){}

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoNegativoException {

        if(preco <= 0){
            throw new PrecoNegativoException();
        } else {
            this.preco = preco;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Jogo jogo) {
        return Double.compare(this.preco, jogo.preco);
    }
}
