package terceiroRefactoring;

import java.util.Date;

public class Discente extends Pessoa{

	private String[] disciplinasCursadas;
	private Date dataIngresso;
	private int numeroPeriodosCursados;
	private String emailPessoal;
    private String matricula;
	private double coeficienteRendimento;
    private Pessoa pessoa;
	
	public Discente(String[] disciplinasCursadas, Date dataIngresso, int numeroPeriodosCursados, String emailPessoal, String matricula,
        double coeficienteRendimento, Pessoa pessoa) {
		super();
		this.disciplinasCursadas = disciplinasCursadas;
		this.dataIngresso = dataIngresso;
		this.numeroPeriodosCursados = numeroPeriodosCursados;
		this.emailPessoal = emailPessoal;
        this.matricula = matricula;
		this.coeficienteRendimento = coeficienteRendimento;
        this.pessoa = pessoa;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

    	public double getCoeficienteRendimento() {
		return pessoa;
	}

	public void setCoeficienteRendimento(double coeficienteRendimento) {
		this.coeficienteRendimento = coeficienteRendimento;
	}
}