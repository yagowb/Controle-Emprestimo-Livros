public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private int anoDePublic;
    private int edicao;


    ///////construtores//////////

    public Livro(String codigo, String titulo, String autor, int anoDePublic, int edicao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublic = anoDePublic;
        this.edicao = edicao;
    }


    ////////////getters & setters//////////////

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublic() {
        return anoDePublic;
    }

    public void setAnoDePublic(int anoDePublic) {
        this.anoDePublic = anoDePublic;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }


}
