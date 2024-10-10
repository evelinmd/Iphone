import java.util.Arrays;

public class Telefone {
    private String contatos;
    private String numero;
    private String historicoChamadas;

    public Telefone() {
        this.contatos = "Contato1, Contato2";
        this.numero = "91234-5678";
        this.historicoChamadas = Arrays.toString(new String[10]);
    }

    public void receberLigacao(String numero){
        System.out.println("Recebendo ligação " + numero);
    }

    public void encerrarLigacao(){
        System.out.println("Ligação encerrada");
    }

    public void fazerLigacao(String numero){
        System.out.println("Ligando... " + numero);
    }

    public String[] getcontatos(){
        return new String[]{contatos};
    }

    public void setcontatos(String[] contatos){
        this.contatos = Arrays.toString(contatos);
    }

    public String[] gethistoricoChamadas(){
        return new String[]{historicoChamadas};
    }

    public void sethistoricoChamadas(String[] historicoChamadas){
        this.historicoChamadas = Arrays.toString(historicoChamadas);
    }
}
