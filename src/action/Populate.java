package action;

import java.util.ArrayList;

import org.hibernate.Session;

import action.HibernateUtil;

public class Populate {

	// Populates database
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		JugadorAction j1 = new JugadorAction();
		j1.setNombre("Sex Fabregas");
		j1.setGoles(69);
		
		JugadorAction j2 = new JugadorAction();
		j2.setNombre("Cristiano Chulazo");
		j2.setGoles(11);
		
		JugadorAction j3 = new JugadorAction();
		j3.setNombre("Messi Camxot");
		j3.setGoles(9999);
		
		JugadorAction j4 = new JugadorAction();
		j4.setNombre("Andrés Inieste Gusiluz");
		j4.setGoles(57);
		
		JugadorAction j5 = new JugadorAction();
		j5.setNombre("Piqué President");
		j5.setGoles(58);
		
		JugadorAction j6 = new JugadorAction();
		j6.setNombre("Benzemá Finsdemà");
		j6.setGoles(24);
		
		JugadorAction j7 = new JugadorAction();
		j7.setNombre("Oliver Atom");
		j7.setGoles(987);
		
		JugadorAction j8 = new JugadorAction();
		j8.setNombre("Oliver no, el otro");
		j8.setGoles(986);
		
		ArrayList<JugadorAction> jugadoresE1 = new ArrayList<>();
//		jugadoresE1.add(j1);
		jugadoresE1.add(j3);
		jugadoresE1.add(j4);
		jugadoresE1.add(j5);
		
		ArrayList<JugadorAction> jugadoresE2 = new ArrayList<>();
//		jugadoresE2.add(j2);
		jugadoresE2.add(j6);
		
		ArrayList<JugadorAction> jugadoresE3 = new ArrayList<>();
		jugadoresE3.add(j1);
		jugadoresE3.add(j2);
		
		ArrayList<JugadorAction> jugadoresE4 = new ArrayList<>();
		jugadoresE4.add(j7);
		jugadoresE4.add(j8);
		
		EquipoAction e1 = new EquipoAction();
		e1.setNombre("Barsa");
		e1.setJugadores(jugadoresE1);
		
		EquipoAction e2 = new EquipoAction();
		e2.setNombre("Hala Madrí");
		e2.setJugadores(jugadoresE2);
		
		EquipoAction e3 = new EquipoAction();
		e3.setNombre("Poble Sec");
		e3.setJugadores(jugadoresE3);
		
		EquipoAction e4 = new EquipoAction();
		e4.setNombre("Gavilanes");
		e4.setJugadores(jugadoresE4);
		
		ArrayList<EquipoAction> equiposL1 = new ArrayList<EquipoAction>();
//		equiposL1.add(e1);
		equiposL1.add(e3);
		
		ArrayList<EquipoAction> equiposL2 = new ArrayList<EquipoAction>();
		equiposL2.add(e1);
		equiposL2.add(e2);
		
		ArrayList<EquipoAction> equiposL3 = new ArrayList<EquipoAction>();
		equiposL3.add(e4);
//		equiposL3.add(e3);
		
		LigaAction l1 = new LigaAction();
		l1.setNombre("Eurocopa");
		l1.setEquipos(equiposL1);
		
		LigaAction l2 = new LigaAction();
		l2.setNombre("Copa del Rey");
		l2.setEquipos(equiposL2);
		
		LigaAction l3 = new LigaAction();
		l3.setNombre("Mundial");
		l3.setEquipos(equiposL3);
		
		session.save(l1);
		session.save(l2);
		session.save(l3);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		session.save(j1);
		session.save(j2);
		session.save(j3);
		session.save(j4);
		session.save(j5);
		session.save(j6);
		session.save(j7);
		session.save(j8);
		
		
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("DATABASE SHOULD BE POPULATED CORRECTLY.");

	}

}
