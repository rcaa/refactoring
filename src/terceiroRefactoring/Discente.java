package terceiroRefactoring;

import java.util.Date;

public class Discente {

	private String[] disciplinasCursadas;
	private Date dataIngresso;
	private int numeroPeriodosCursados;
	
	public Discente(String[] disciplinasCursadas, Date dataIngresso, int numeroPeriodosCursados) {
		super();
		this.disciplinasCursadas = disciplinasCursadas;
		this.dataIngresso = dataIngresso;
		this.numeroPeriodosCursados = numeroPeriodosCursados;
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

}
