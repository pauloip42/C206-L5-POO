import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Jogo jogo){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{
            os = new FileOutputStream("Arquivo.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Jogo");
            bw.newLine();
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getGenero() + "\n");
            bw.write(jogo.getPreco() + "\n");

        }catch(Exception e){
            System.out.println(e);
        }finally {

            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }

    }

    public ArrayList<Jogo> ler(){

        ArrayList<Jogo> jogos = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("Jogo")){
                    Jogo f = new Jogo();
                    f.setNome(br.readLine());
                    f.setGenero(br.readLine());
                    f.setPreco(Double.parseDouble(br.readLine()));
                    jogos.add(f);
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("ERRO1");
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return jogos;
    }

}
