public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    // Na composição, você cria o tudo(all) e a parte juntos


//    Arma arma = new Arma(); //Composição
    Arma arma;
    public Nave(String nome, int velocidade, boolean velocidadeDaLuz) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
        //this.arma = new Arma() //Outra forma de composição
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println((this.velocidadeDaLuz)?"Viaja na velocidade da luz":"Não viaja na velocidade da luz");
        if(this.arma != null){
            System.out.println("Tipo da arma: " + this.arma.tipo);
            System.out.println("Poder da arma: " + this.arma.poder);
        }else
            System.out.println("A nave não possui arma");
    }

    void addArma(Arma arma){
        this.arma = arma;
    }
}
