public class Conta implements Comparable<Conta>{
    int saldo;
    String dono;

    public Conta(int saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    @Override
    public int compareTo(Conta conta) {
        return Integer.compare(this.saldo, conta.saldo);

        // return dono.compareTo(c.dono) //comparar string
    }
}
