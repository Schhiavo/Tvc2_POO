package br.ufjf.dcc.poo.Model;

import java.util.ArrayList;

public class Disciplina {
	private String nomeDisciplina; 
	private int período;
	private String livroTexto;
	
	private ArrayList<Academico> academicos;
	private Professor professor;

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getPeríodo() {
		return período;
	}
	public void setPeríodo(int período) {
		this.período = período;
	}
	public String getLivroTexto() {
		return livroTexto;
	}
	public void setLivroTexto(String livroTexto) {
		this.livroTexto = livroTexto;
	}
	public ArrayList<Academico> getAcademicos() {
		return academicos;
	}
	public void setAcademicos(ArrayList<Academico> academicos) {
		this.academicos = academicos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void quantidadeAcademicos(){} 
	public void imprimirDiario(){}
}
