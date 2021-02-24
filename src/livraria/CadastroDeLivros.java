package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
	Autor autor = new Autor();
	autor.nome = "Rodrigo Abreu";
	autor.email = "rodrigão@gmiau.com";
	autor.cpf = "040.028.922";
	
	Livro livro = new Livro();
	livro.nome = "Java 8 Prático";
	livro.descricao  = "Novos recursos da linguagem";
	livro.valor = 59.90;
	livro.isbn = "978-85-66250-46-6";
	livro.autor = autor;
	
	livro.mostrarDetalhes();
	
	System.out.println();
	
	Livro outroLivro = new Livro();
	outroLivro.nome = "Lógica de programação";
	outroLivro.descricao = "Crie seus primeiros programas";
	outroLivro.valor = 59.90;
	outroLivro.isbn = "978-85-66250-22-0";
	outroLivro.autor = autor;
	
	outroLivro.mostrarDetalhes();
	}
}
