package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
	Autor autor = new Autor();
	autor.setNome("Rodrigo Abreu");
	autor.setEmail("rodrigo@gmail.com");
	autor.setCpf("040.028.922");
	
	Livro livro = new Livro(autor);
	livro.setNome("Java 8 Prático");
	livro.setDescricao("Novos recursos da linguagem");
	livro.setValor(59.90);
	livro.setIsbn("978-85-66250-46-6");
	
	livro.mostrarDetalhes();
	
	System.out.println();
	
	Livro outroLivro = new Livro(autor);
	outroLivro.setNome("Lógica de programação");
	outroLivro.setDescricao("Crie seus primeiros programas");
	outroLivro.setValor(59.90);
	outroLivro.setIsbn("978-85-66250-22-0");
	
	outroLivro.mostrarDetalhes();
	}
}
