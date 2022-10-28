public abstract class Pessoa {

    private String matricula;
    String nome;
    private String email;
    private String telefone;


    ///////construtores//////////
    public Pessoa(String matricula, String nome, String email, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}