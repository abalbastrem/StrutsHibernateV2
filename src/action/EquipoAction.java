package action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class EquipoAction {
	
	private long id;
	
	private String nombre;
	
	private List<JugadorAction> jugadores = new ArrayList<JugadorAction>();
	
	private LigaAction liga;
	public LigaAction getLiga() {
		return liga;
	}

	public void setLiga(LigaAction liga) {
		this.liga = liga;
	}

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

	public List<JugadorAction> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<JugadorAction> jugadores) {
		this.jugadores = jugadores;
	}

}
