public class Robo {
    public static int cont;

    public String nome;
    public int nSerie;

    public Robo(String nome){
        this.nome = nome;
        cont++;
        this.nSerie = cont;
    }

    public static void setCont(int cont){
        Robo.cont = cont;
    }

    public static int getCont(){
        return Robo.cont;
    }

    public static void mostraMensagem(){
        System.out.println("Oi, eu sou robo");
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de Série: " + this.nSerie + "\n");
    }

}
