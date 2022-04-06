public class Tripulante extends Astronauta implements Missao{
    private int qtdMissoes;

    public Tripulante(String cor, String nome, int qtdMissoes) {
        super(cor, nome);
        this.qtdMissoes = qtdMissoes;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de astronauta: tripulante");
    }

    @Override
    public void Reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void Reparar() {
        System.out.println(this.getNome() + " fez um reparo");
    }


    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma missao");
        this.qtdMissoes -= 1;
    }
}
