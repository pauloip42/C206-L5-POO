public class Professor extends Funcionario implements Atividade {
    public String materia;

    public Professor(String nome, int idade, double salario, String materia){
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigeProvas(){
        System.out.println(this.getNome() + " esta corrigindo provas");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia: " + this.materia);
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Reescrita de método");
    }

    @Override
    public void fazAlgo(){
        System.out.println(this.getNome() + " esta dando aula de " + this.materia);
    }

    @Override
    public void fazAtividade() {
        System.out.println(this.getNome() + " faz atividade física 3x por semana");
    }
}
