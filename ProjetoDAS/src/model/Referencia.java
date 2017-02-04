package model;

/**
 *
 * @author LM
 */
public class Referencia extends Entidade{
 
    // Elementos de uma referencia bibliográfica. Devem ter uma coluna correspondente na BD.
    private String autores;
    private String titulo;
    private String editora;
    private int ano;

    public Referencia(String autores, String titulo, String editora, int ano) {
        this.autores = autores;
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }

    public String getAutores() {
        return autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

}
