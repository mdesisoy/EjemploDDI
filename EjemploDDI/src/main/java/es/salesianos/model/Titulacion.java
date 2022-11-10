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
	public Integer getTitulo() {
		return titulo;
	}
	public void setTitulo(Integer titulo) {
		this.titulo = titulo;
	}

}
