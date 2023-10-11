package Produto;

public abstract class Produto {

	private Long codBarras;
	private String Fabricante;
	public Long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(Long codBarras) {
		this.codBarras = codBarras;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	
	public void venda () {
		
	}
	
	
}
