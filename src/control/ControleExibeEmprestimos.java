package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimos {
	
	public ControleExibeEmprestimos(){
		
		BDSimulado bds = new BDSimulado();
		
		ArrayList<Emprestimo> emprestimos = bds.getEmprestimo();
		
		
		
	}

}
