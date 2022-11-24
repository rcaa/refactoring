package terceiroRefactoring;

import java.util.Date;

public class Pessoa {

	private String nomeCompleto;
	private String cpf;
	private String registroGeral;
	private Date dataNascimento;
	private String nomePai;
	private String nomeMae;
	private String siape;
	private String matricula;
	private double coeficienteRendimento;
	private Contato contato;
	
	public Pessoa(String nomeCompleto, String cpf, String registroGeral, Date dataNascimento, String nomePai,
			String nomeMae, String siape, String matricula, double coeficienteRendimento, Contato contato) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.registroGeral = registroGeral;
		this.dataNascimento = dataNascimento;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.siape = siape;
		this.matricula = matricula;
		this.coeficienteRendimento = coeficienteRendimento;
		this.contato = contato;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
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
}
