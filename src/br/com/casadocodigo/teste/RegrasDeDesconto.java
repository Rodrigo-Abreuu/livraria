package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.Ebook;
import br.com.casadocodigo.produtos.Livro;
import br.com.casadocodigo.produtos.LivroFisico;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livroFisico = new LivroFisico(autor);
		livroFisico.setValor(59.90);
		
		if (!livroFisico.aplicaDescontoDe(0.3)){
			System.out.println("Desconto do livro não pode ser"
					+ " maior que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " 
						+ livroFisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)){
			System.out.println("Desconto do ebook não pode ser"
					+ " maior que 15%");
		}else {
			System.out.println("Valor do ebook com desconto: "
					+ ebook.getValor());
		}
	}
}
