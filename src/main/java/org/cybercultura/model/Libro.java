package org.cybercultura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_libros")

public class Libro {
	
	@Id
	@Column (name = "codigo")
	private int codigo;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "id_estado")
	private int id_estado;
	
	@Column (name = "fecha_publicacion")
	private String fecha_publicacion;
	
	@Column (name = "id_autor")
	private int id_autor;
	
	@Column (name = "id_genero")
	private int id_genero;

	
	
	
	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", id_estado=" + id_estado + ", fecha_publicacion="
				+ fecha_publicacion + ", id_autor=" + id_autor + ", id_genero=" + id_genero + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public int getId_genero() {
		return id_genero;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	
	
}
