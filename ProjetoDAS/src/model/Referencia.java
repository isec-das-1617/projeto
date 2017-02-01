package model;

/**
 *
 * @author LM
 */
public class Referencia {
 
    // Elementos de uma referencia bibliográfica. Devem ter uma coluna correspondente na BD.
    String autores;
    String titulo;
    String subtitulo;
    String livroRevista;
    String editora;
    String cidade;
    int ano;

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getLivroRevista() {
        return livroRevista;
    }

    public void setLivroRevista(String livroRevista) {
        this.livroRevista = livroRevista;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
