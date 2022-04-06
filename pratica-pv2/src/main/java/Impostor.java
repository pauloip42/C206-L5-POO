public class Impostor extends Astronauta implements Sabotar, Executar, Missao{
    private int qtdMortes;

    public Impostor(String cor, String nome) {
        super(cor, nome);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de astronauta: impostor");
    }


    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilacao");
    }

    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do " + local);
    }

    @Override
    public void executar() {
        System.out.println(this.getNome() + " matou um tripulante");
        qtdMortes += 1;
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicacao");
    }

    @Override
    public void Reportar() {
        System.out.println(this.getNome() + " fez um self-report");
    }

    @Override
    public void Reparar() {
        System.out.println(this.getNome() + " fingiu que fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma tarefa falsa");
    }
}
