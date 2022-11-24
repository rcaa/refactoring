package terceiroRefactoring;

public class Docente {
	private InformacaoInstitucional informacaoInstitucional;
	private Pessoa docente;
	private double remuneracao;
	
	public Docente(InformacaoInstitucional informacaoInstitucional, Pessoa docente, double remuneracao) {
		this.informacaoInstitucional = informacaoInstitucional;
		this.docente = docente;
		this.remuneracao = remuneracao;
	}

	public InformacaoInstitucional getInformacaoInstitucional() {
		return informacaoInstitucional;
	}

	public void setInformacaoInstitucional(InformacaoInstitucional informacaoInstitucional) {
		this.informacaoInstitucional = informacaoInstitucional;
	}

	public Pessoa getDocente() {
		return docente;
	}

	public void setDocente(Pessoa docente) {
		this.docente = docente;
	}

	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
}
