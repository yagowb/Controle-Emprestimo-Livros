
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    private int prazo;
    private boolean devolvidos;
    private boolean encerra;
    private Pessoa pessoa;
    private List<Livro> livros;


    public Emprestimo() {
        this.livros = new ArrayList<Livro>();
        this.prazo = 0;
        this.devolvidos = false;
        this.encerra = false;
    }

    ///////////////////////////////////////
    public void mostrarLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println((i+1) + ": " + livros.get(i).titulo);
        }
    }
    public void adicionarLivro(Livro livro) throws Exception {
        if(!encerra) {
            if(this.pessoa instanceof Aluno && livros.size() < 3) {
                livros.add(livro);
            }else if(this.pessoa instanceof Professor && livros.size() < 5) {
                livros.add(livro);
            }else {
                throw new Exception("O usuário atingiu o número máximo de livros.");
            }
        }else {
            System.out.println("O empréstimo já foi finalizado.");
        }

    }
    public void devolverLivro(Livro livro) {
        if(encerra) {
            if(this.livros.size()  == 0) {
                System.out.println("Todos os livros já foram devolvidos ao estoque.");
            }else if(this.livros.size() > 0) {
                boolean remocao = this.removerLivro(livro.codigo);
                if(remocao) {
                    System.out.println(livro.codigo + " removido com sucesso");
                }else {
                    System.out.println("Livro não encontrado na lista.");
                }
                if(this.livros.size()  == 0) {
                    this.setDevolvidos(true);
                    System.out.println("Todos os livros foram devolvidos.");
                }
            }

        }
    }
    private boolean removerLivro(int codigo) {
        for(int i = 0; i < livros.size(); i++) {
            if(livros.get(i).codigo == codigo) {
                this.livros.remove(livros.get(i));
                return true;
            }
        }
        return false;
    }


    public void calcularPrazo() {
        if(this.pessoa instanceof Aluno) {
            this.setPrazo(10);
        }else if(this.pessoa instanceof Professor) {
            this.setPrazo(30);
        }
    }

    public void encerraEmprestimo() {
        this.calcularPrazo();
        this.setEncerra(true);
        this.statusEmprestimo();
    }

    public void statusEmprestimo() {
        System.out.println("----------------");
        System.out.println("\nEmpréstimo de: " + this.getPessoa().nome);
        System.out.println("Livros alugados: ");
        if(this.livros.size() > 0)
            this.mostrarLivros();
        else
            System.out.println("Nenhum");
        System.out.println("Prazo de devolução: " + this.getPrazo() + " dias.");
        System.out.println("Todos os livros devolvidos: " + (this.devolvidos ? "Sim" : "Não"));
        System.out.println("----------------");

    }

    public void setLivros(List<Livro> livros) {
        if (!encerra) {
            for (Livro livro : livros) {
                try {
                    adicionarLivro(livro);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }

    }

///////////////////GETTERS AND SETTERS/////////////////////////

    public boolean isDevolvidos() {
        return devolvidos;
    }

    public void setDevolvidos(boolean devolvidos) {
        this.devolvidos = devolvidos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        if (pessoa instanceof Aluno) {
            this.pessoa = pessoa;
        } else if (pessoa instanceof Professor) {
            this.pessoa = pessoa;
        } else {
            System.out.println("Para realizar empréstimos é necessário ser um Aluno ou um Professor.");
        }
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }


    public boolean isEncerra() {
        return encerra;
    }

    public void setEncerra(boolean finalizado) {
        this.encerra = finalizado;
    }
}

