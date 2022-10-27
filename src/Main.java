import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Aluno aluno1 = new Aluno("2219004", "Yago R.", "yagowb@bol.com", "99690325", "ADS", "noite");
    Aluno aluno2 = new Aluno("2245777", "Amanda M.", "amandamrts@bol.com","32431143", "Letras", "manhã");


    List<Livro> livros = new ArrayList<>();

    Livro livro1 = new Livro("0148", "Arte da Guerra", "Sun Tzu", 2016, 2);


    Professor prof1 = new Professor("114569", "Leonardo Taddeo", "leotaddeo@unifor.br", "40041122", "Doutor");

    Emprestimo emprestimo = new Emprestimo();

    emprestimo.setPessoa(aluno1);
    emprestimo.emprestaLivro(livro1);

    }
}