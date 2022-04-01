public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "abc", "efg", "hij", 12);
        Produto produto2 = new Produto(2, "klm", "nop", "qrs", 13);

        produto1.mostraInfo();
        produto2.mostraInfo();
    }
}
