package terceiroRefactoring;

import java.util.Date;

public class Docente {

	private String[] disciplinasMinistradas;
	private Date dataAdmissao;
	private String emailInstitucional;
	private double remuneracao;
	
	public Docente(String[] disciplinasMinistradas, Date dataAdmissao, String emailInstitucional, double remuneracao) {
		super();
		this.disciplinasMinistradas = disciplinasMinistradas;
		this.dataAdmissao = dataAdmissao;
		this.emailInstitucional = emailInstitucional;
		this.remuneracao = remuneracao;
	}

	public String[] getDisciplinasMinistradas() {
		return disciplinasMinistradas;
	}

	public void setDisciplinasMinistradas(String[] disciplinasMinistradas) {
		this.disciplinasMinistradas = disciplinasMinistradas;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getEmailInstitucional() {
		return emailInstitucional;
	}

	public void setEmailInstitucional(String emailInstitucional) {
		this.emailInstitucional = emailInstitucional;
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
}
