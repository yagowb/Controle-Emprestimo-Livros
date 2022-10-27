public class Professor extends Pessoa{


    private String titulacao;



    ///////////construtores////////////

    public Professor(String matricula, String nome, String email, String telefone, String titulacao) {
        super(matricula, nome, email, telefone);
        this.titulacao = titulacao;
    }




    //////////////getters & setters//////////

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

}
