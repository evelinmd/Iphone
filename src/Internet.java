public class Internet {
    private String navegador;
    private String paginaAtual;
    private String dadosdaRede;

    public Internet() {
        this.navegador = "Safari";
        this.paginaAtual = "www.dio.com.br";
        this.dadosdaRede = "Wi-fi";
    }

    public void abrirNavegador() {
    System.out.println("Abrindo navegador... ");
    }

    public void navegar(String site){
        this.navegador = site;
        System.out.println("Navegando na página... " + site);
    }
    public void fecharNavegador() {
        System.out.println("Fechando navegador... ");
    }

    public String getpaginaAtual() {
        return paginaAtual;
    }

    public void setpaginaAtual(String paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getdadosdaRede() {
        return dadosdaRede;
    }

    public void setdadosdaRede(String dadosdaRede) {
        this.dadosdaRede = dadosdaRede;
    }
}
