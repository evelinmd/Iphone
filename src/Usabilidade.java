public class Usabilidade {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 14", "iOS 16", 256, 100);

        meuIphone.getMusica().tocar();
        meuIphone.getMusica().avancar();

        meuIphone.getTelefone().fazerLigacao("91234-5678");

        meuIphone.getInternet().navegar("www.dio.com.br");
    }
}
