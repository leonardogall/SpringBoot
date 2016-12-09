package WSSpringBoot.WSSpringBoot.model;

public class Nfa {

	private Integer id;
	private String chaveDeAcesso;
	private String cnpj;
	
	
	public Nfa(Integer id, String chaveDeAcesso, String cnpj) {
		this.id = id;
		this.chaveDeAcesso = chaveDeAcesso;
		this.cnpj = cnpj;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChaveDeAcesso() {
		return chaveDeAcesso;
	}
	public void setChaveDeAcesso(String chaveDeAcesso) {
		this.chaveDeAcesso = chaveDeAcesso;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
