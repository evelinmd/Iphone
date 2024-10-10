public class Musica {
private String[] listadeMusica;
private String musicaAtual;
private int volume;

    public Musica() {
        this.listadeMusica = new String[] {"Musica1", "Musica2", "Musica3"};
        this.musicaAtual = listadeMusica[0];
        this.volume = 50;
    }

    public void tocar(){
        System.out.println("Tocando: " + musicaAtual);
    }

    public void pausar(){
        System.out.println("Música pausada: ");
    }

    public void avancar(){
        System.out.println("Próxima música: ");
    }

    public void retroceder(){
        System.out.println("Retrocedendo para a música anterior: ");
    }

    public String getmusicaAtual() {
        return musicaAtual;
    }

    public void setmusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public int getvolume() {
        return volume;
    }

    public void setvolume(int volume) {
        this.volume = volume;
    }
}
