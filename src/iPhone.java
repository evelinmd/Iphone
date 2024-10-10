public class iPhone {
    private String modelo;
    private String sistemaOperacional;
    private int capacidadeMemoria;

    private Musica musica;
    private Telefone telefone;
    private Internet internet;

    public iPhone(String modeloIphone, String sistemaOperacional, int capacidadeMemoria) {
        this.modelo = modeloIphone;
        this.sistemaOperacional = sistemaOperacional;
        this.capacidadeMemoria = capacidadeMemoria;
        this.musica = new Musica();
        this.telefone = new Telefone();
        this.internet = new Internet();
    }

    public iPhone(String modeloIphone, String sistemaOperacional, int capacidadeMemoria, int i) {
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }

    public void abrirAplicativo(String app){
        System.out.println("Abrindo aplicativo..." + app);
    }

    public Musica getMusica() {
        return musica;
    }
    public Telefone getTelefone() {
        return telefone;
    }

    public Internet getInternet() {
        return internet;
    }
}