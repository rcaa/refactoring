package terceiroRefactoring;

import java.util.Date;

public class Pessoa {

	private String nomeCompleto;
	private String cpf;
	private String registroGeral;
	private Date dataNascimento;
	private String nomePai;
	private String nomeMae;
	private String email;
	
	public Pessoa(String nomeCompleto, String cpf, String registroGeral, Date dataNascimento, String nomePai, String nomeMae, String email) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.registroGeral = registroGeral;
		this.dataNascimento = dataNascimento;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.email = email;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
