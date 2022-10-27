public class Aluno extends Pessoa{

    private String curso;
    private String turno;


    ///////////construtores////////////

    public Aluno(String matricula, String nome, String email, String telefone, String curso, String turno) {
        super(matricula, nome, email, telefone);
        this.curso = curso;
        this.turno = turno;
    }



    //////////////getters & setters//////////

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
