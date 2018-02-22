package action;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="liga")
public class LigaAction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="nombre")
	private String nombre;

	@Column(name="equipos")
	private ArrayList<EquipoAction> equipos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<EquipoAction> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<EquipoAction> equipos) {
		this.equipos = equipos;
	}

}