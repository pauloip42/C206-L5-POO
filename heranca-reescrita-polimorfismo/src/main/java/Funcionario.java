public abstract class Funcionario {
    //classe abstrata: public abstract class Funcionario
    private String nome;
    public int idade;
    public double salario;
    private static int cont;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void fazAlgo(); //metodo abstrato

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        cont++;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Idade: " + this.idade);
    }

    public double salarioBonus(){
        return this.salario;
    }

//    public void fazAlgo(){
//        System.out.println(this.nome + " esta fazendo algo");
//    }


}
