package DAO;

import java.util.List;

import org.hibernate.Session;

import action.HibernateUtil;
import action.LigaAction;

public class LigaDAO {
	
	private List<LigaAction> ligas;
	
	public String execute() {
		return "SUCCESS";
	}
	
	public List<LigaAction> getLigas() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<LigaAction> ligas = session.createQuery("from ligas").list();
		session.close();
		return ligas;
	}

}
