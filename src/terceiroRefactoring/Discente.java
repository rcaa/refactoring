package terceiroRefactoring;

import java.util.Date;

public class Discente {

	private String[] disciplinasCursadas;
	private Date dataIngresso;
	private int numeroPeriodosCursados;
	private String emailPessoal;
	
	public Discente(String[] disciplinasCursadas, Date dataIngresso, int numeroPeriodosCursados, String emailPessoal) {
		super();
		this.disciplinasCursadas = disciplinasCursadas;
		this.dataIngresso = dataIngresso;
		this.numeroPeriodosCursados = numeroPeriodosCursados;
		this.emailPessoal = emailPessoal;
	}

	public String[] getDisciplinasCursadas() {
		return disciplinasCursadas;
	}

	public void setDisciplinasCursadas(String[] disciplinasCursadas) {
		this.disciplinasCursadas = disciplinasCursadas;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public int getNumeroPeriodosCursados() {
		return numeroPeriodosCursados;
	}

	public void setNumeroPeriodosCursados(int numeroPeriodosCursados) {
		this.numeroPeriodosCursados = numeroPeriodosCursados;
	}

	public String getEmailPessoal() {
		return emailPessoal;
	}

	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}
}
