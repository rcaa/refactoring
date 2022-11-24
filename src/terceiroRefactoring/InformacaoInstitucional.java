package terceiroRefactoring;

import java.util.Date;

public class InformacaoInstitucional {
	private String siape;
	private String matricula;
	private double coeficienteRendimento;
  private String[] disciplinas;
  private Date dataVinculo;
  private String email;
	
	public InformacaoInstitucional(String siape, String matricula, double coeficienteRendimento, String[] disciplinas,
    Date dataVinculo, String email) {
		this.siape = siape;
		this.matricula = matricula;
		this.coeficienteRendimento = coeficienteRendimento;
    this.disciplinas = disciplinas;
    this.dataVinculo = dataVinculo;
    this.email = email;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
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

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
  
	public Date getDataVinculo() {
		return dataVinculo;
	}

	public void setDataVinculo(Date dataVinculo) {
		this.dataVinculo = dataVinculo;
	}

	public String getEmailInstitucional() {
		return email;
	}

	public void setEmailInstitucional(String email) {
		this.email = email;
	}
}
