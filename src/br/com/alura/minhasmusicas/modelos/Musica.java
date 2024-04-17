package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
private String album;
private String canton;
private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenerno(String genero) {
        this.genero = genero;
    }
}
