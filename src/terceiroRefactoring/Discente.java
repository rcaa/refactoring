package terceiroRefactoring;

import java.util.Date;

public class Discente extends Pessoa {

	private String[] disciplinasCursadas;
	private Date dataIngresso;
	private int numeroPeriodosCursados;
	private String matricula;
	private double coeficienteRendimento;
	
	public Discente(String[] disciplinasCursadas, Date dataIngresso, int numeroPeriodosCursados, String matricula, double coeficienteRendimento, String nomeCompleto, String cpf, String registroGeral, Date dataNascimento, String nomePai, String nomeMae, String email) {
		super(nomeCompleto, cpf, registroGeral, dataNascimento, nomePai, nomeMae, email);
		this.disciplinasCursadas = disciplinasCursadas;
		this.dataIngresso = dataIngresso;
		this.numeroPeriodosCursados = numeroPeriodosCursados;
		this.matricula = matricula;
		this.coeficienteRendimento = coeficienteRendimento;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCoeficienteRendimento() {
		return coeficienteRendimento;
	}

	public void setCoeficienteRendimento(double coeficienteRendimento) {
		this.coeficienteRendimento = coeficienteRendimento;
	}
}
