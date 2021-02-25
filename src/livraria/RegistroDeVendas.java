package livraria;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Livro OO");
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Livro OO");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
	}

}
