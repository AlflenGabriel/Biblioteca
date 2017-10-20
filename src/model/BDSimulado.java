package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> Bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> Emprestimos = new ArrayList<Emprestimo>();

	
	public BDSimulado() {
		
		Livro l1 = new Livro("Livro 1", "Autor 1", "Editora 1", "2012", "123");
		Livro l2 = new Livro("Livro 2", "Autor 2", "Editora 2", "2016", "456");
		Livro l3 = new Livro("Livro 3", "Autor 3", "Editora 3", "2017", "789");
		
		
		this.livros.add(l1);
		this.livros.add(l2);
		this.livros.add(l3);
		
		Usuario u1 = new Usuario("Mario Miojo", "001", "CIC");
		Usuario u2 = new Usuario("Alberto Santos", "002", "ADM");
		Usuario u3 = new Usuario("Pedro Henrique", "003", "MED");
		
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		
		Bibliotecario b1 = new Bibliotecario("Correria Rogerio", "0011");
		Bibliotecario b2 = new Bibliotecario("Adianto da Silva", "0011");
		Bibliotecario b3 = new Bibliotecario("Salvador Pereira", "0011");
		
		this.Bibliotecarios.add(b1);
		this.Bibliotecarios.add(b2);
		this.Bibliotecarios.add(b3);
		
		Emprestimo e1 = new Emprestimo(l2, u2, b1, LocalDate.of(2017, 10, 10), LocalDate.of(2017, 10, 15));
		Emprestimo e2 = new Emprestimo(l1, u1, b1, LocalDate.of(2017, 10, 11), LocalDate.of(2017, 10, 16));
		Emprestimo e3 = new Emprestimo(l3, u1, b2, LocalDate.of(2017, 10, 18), LocalDate.of(2017, 10, 23));
		
		this.Emprestimos.add(e1);
		this.Emprestimos.add(e2);
		this.Emprestimos.add(e3); 

	}
	public ArrayList<Emprestimo> getEmprestimo(){
		return this.Emprestimos;
		
	}
	
	
	
	
	

}
