package terceiroRefactoring;

import java.util.Date;

public class Docente extends Pessoa {

	private String[] disciplinasMinistradas;
	private Date dataAdmissao;
	private String emailInstitucional;
	private double remuneracao;
	private String siape;
	
	public Docente(String[] disciplinasMinistradas, Date dataAdmissao, String emailInstitucional, double remuneracao, String siape) {
		super();
		this.disciplinasMinistradas = disciplinasMinistradas;
		this.dataAdmissao = dataAdmissao;
		this.emailInstitucional = emailInstitucional;
		this.remuneracao = remuneracao;
		this.siape = siape;
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

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
}
