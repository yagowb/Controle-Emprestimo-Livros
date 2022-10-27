import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    Pessoa pessoa;
    List<Livro> livros;

    //instanceOf

    public void emprestaLivro(Livro livro){
        if(pessoa instanceof Aluno && livros.size() < 3){
            livros.add(livro);
        }else if(pessoa instanceof Professor && livros.size() < 5){
            livros.add(livro);
        }
    }

    public void devolveLivro(){

    }


    public void mostrarEmprestimos(){

    }

}
