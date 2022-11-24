package terceiroRefactoring;

import java.util.Date;

public class Docente extends Pessoa{

	private String[] disciplinasMinistradas;
	private Date dataAdmissao;
	private double remuneracao;
	private String siape;
	
	public Docente(String[] disciplinasMinistradas, Date dataAdmissao, double remuneracao, String siape, Pessoa pessoa) {
		super(pessoa.getNomeCompleto(),
				pessoa.getCpf(),
				pessoa.getRegistroGeral(),
				pessoa.getDataNascimento(),
				pessoa.getNomePai(),
				pessoa.getNomeMae(),
				pessoa.getEmail());
		this.disciplinasMinistradas = disciplinasMinistradas;
		this.dataAdmissao = dataAdmissao;
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
