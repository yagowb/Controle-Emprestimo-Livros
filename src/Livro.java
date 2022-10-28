public class Livro {

    int codigo;
    String titulo;
    private String autor;
    private int anoDePublic;
    private int edicao;


    ///////construtores//////////

    public Livro(int codigo, String titulo, String autor, int anoDePublic, int edicao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublic = anoDePublic;
        this.edicao = edicao;
    }
}


