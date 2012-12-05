package br.com.dp.bulder;

public class Empresa {
	private String razaoSocial;
	private String cnpj;
	private String IE;
	private String obsEmpresa;

	public Empresa(String razaoSocial, String cnpj, String iE, String obsNota) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		IE = iE;
		this.obsEmpresa = obsNota;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getObsNota() {
		return obsEmpresa;
	}

	public void setObsNota(String obsNota) {
		this.obsEmpresa = obsNota;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", IE=" + IE + ", obsNota=" + obsEmpresa + "]";
	}

}
