public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Marcel", "Badeco");
        Publicacao livro = new Livro("Titulo", "31/01/2021", autor, 10.0, "1", "Minha impressora", "123456789");
        System.out.println("Edicao: " + ((Livro) livro).getnEdicaoLivro());
    }
}