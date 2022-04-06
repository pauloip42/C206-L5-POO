public abstract class Astronauta {
    public static int cont;

    private String cor;
    private String nome;
    public Skin skin = new Skin();
    public Pet pet = new Pet();

    public Astronauta(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
        cont++;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Skin: " + this.skin.getTipo());
        System.out.println("Pet: " + this.pet.getNome());
    }

    public void verCameras(){
        System.out.println(this.getNome() + " olhou as cameras");
    }

    public abstract void Reportar();

    public abstract void Reparar();
}
