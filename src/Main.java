import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        //Criação de Alunos//
        Aluno aluno1 = new Aluno("2219004", "Yago R.", "yagowb@bol.com", "99690325", "ADS", "noite");
        Aluno aluno2 = new Aluno("2245777", "Amanda M.", "amandamrts@bol.com", "32431143", "Letras", "manhã");

        //Criação de Livros//
        List<Livro> livros = new ArrayList<>();
        Livro livro1 = new Livro(145, "Arte da Guerra", "Sun Tzu", 2016, 2);
        Livro livro2 = new Livro(199, "Fogo e Sangue", "George R. R. Martin", 2018, 1);
        Livro livro3 = new Livro(045, "Engenharia de Software", "Roger Pressman", 2016, 9);
        Livro livro4 = new Livro(137, "Mitologia Nórdica", "Neil Gaiman", 2017, 1);
        Livro livro5 = new Livro(010, "Maus", "Art Spiegelman", 1991, 2);

        //Criação de Professor//
        Professor prof1 = new Professor("114569", "Leonardo Taddeo", "leotaddeo@unifor.br", "40041122", "Doutor");


        //--------------Empréstimo de livros----------------//
        //Aluno//
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setPessoa(aluno1);

        try {
            emprestimo.adicionarLivro(livro1);

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        emprestimo.encerraEmprestimo();

        Emprestimo emprestimo2 = new Emprestimo();
        emprestimo2.setPessoa(aluno2);

        try {
            emprestimo2.adicionarLivro(livro2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        emprestimo2.encerraEmprestimo();

        //Professor//
        Emprestimo emprestimoProf1 = new Emprestimo();
        emprestimoProf1.setPessoa(prof1);

        try {
            emprestimoProf1.adicionarLivro(livro3);
            emprestimoProf1.adicionarLivro(livro4);
            emprestimoProf1.adicionarLivro(livro5);
            emprestimoProf1.adicionarLivro(livro5);
            emprestimoProf1.adicionarLivro(livro5);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        emprestimoProf1.encerraEmprestimo();
        emprestimoProf1.devolverLivro(livro4);


        //Mostrar Empréstimos Ativos//
        //emprestimo.statusEmprestimo();
        //emprestimo2.statusEmprestimo();
        //emprestimoProf1.statusEmprestimo();

    }
}