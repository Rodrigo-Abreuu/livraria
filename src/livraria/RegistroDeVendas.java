package livraria;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Livro OO");
		livroFisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Livro OO");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
	}

}
