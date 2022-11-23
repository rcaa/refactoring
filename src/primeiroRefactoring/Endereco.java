package primeiroRefactoring;

public class Endereco {
	private String logradouro;
	private String complemento;
	private String cep;

    public Pessoa(String logradouro, String complemento, String cep) {
		super();
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
}