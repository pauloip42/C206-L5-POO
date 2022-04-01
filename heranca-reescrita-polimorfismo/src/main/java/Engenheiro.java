public class Engenheiro extends Funcionario implements GerenciaProjeto, Atividade{

    public String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " esta fazendo um projeto");
    }

    @Override
    public void gerenciar() {
        System.out.println(this.getNome() + " está gerenciando um projeto de software");
    }

    @Override
    public void fazAtividade() {

    }
}
