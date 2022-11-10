package es.salesianos.model;

public class Titulacion extends BaseEntity{
	
	private String titulo;
	private Integer codTitulacion;
	
	public Integer getCodTitulacion() {
		return codTitulacion;
	}
	public void setCodTitulacion(Integer codTitulacion) {
		this.codTitulacion = codTitulacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
