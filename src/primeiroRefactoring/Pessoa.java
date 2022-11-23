package primeiroRefactoring;

import java.util.Date;
import primeiroRefactoring.Endereco;

public class Pessoa {

	private String nome;
	private String cpf;
	private String registroGeral;
	private Date dataNascimento;
	private String nomePai;
	private String nomeMae;
	private Endereco endereco;
	
	public Pessoa(String nome, String cpf, String registroGeral, Date dataNascimento, String nomePai, String nomeMae, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.registroGeral = registroGeral;
		this.dataNascimento = dataNascimento;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

	public getEndereco() {
		return this.endereco;
	}

	public setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
