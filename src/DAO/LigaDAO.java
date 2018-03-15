package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import action.HibernateUtil;
import action.LigaAction;

public class LigaDAO {
	
	private List<LigaAction> ligas = new ArrayList<>();
	
	public String execute() {
		rellenarLigas();
		return "SUCCESS";
	}
	
	
	public List<LigaAction> getLigas() {
		return ligas;
	}


	public void setLigas(List<LigaAction> ligas) {
		this.ligas = ligas;
	}


	void rellenarLigas(){
		System.out.println("::::: DAO Listando ligas");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		ligas.addAll(session.createQuery("from ligas").list());
		session.close();
	}

}
