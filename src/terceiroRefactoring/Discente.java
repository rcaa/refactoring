package terceiroRefactoring;

public class Discente {
	private InformacaoInstitucional informacaoInstitucional;
	private Pessoa discente;
	private int numeroPeriodosCursados;
	
	public Discente(InformacaoInstitucional informacaoInstitucional, Pessoa discente, int numeroPeriodosCursados) {
		this.informacaoInstitucional = informacaoInstitucional;
		this.discente = discente;
		this.numeroPeriodosCursados = numeroPeriodosCursados;
	}

	public int getNumeroPeriodosCursados() {
		return numeroPeriodosCursados;
	}

	public void setNumeroPeriodosCursados(int numeroPeriodosCursados) {
		this.numeroPeriodosCursados = numeroPeriodosCursados;
	}

	public InformacaoInstitucional getInformacaoInstitucional() {
		return informacaoInstitucional;
	}

	public void setInformacaoInstitucional(InformacaoInstitucional informacaoInstitucional) {
		this.informacaoInstitucional = informacaoInstitucional;
	}

	public Pessoa getDiscente() {
		return discente;
	}

	public void setDiscente(Pessoa discente) {
		this.discente = discente;
	}
}
