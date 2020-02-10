package dev.kama.daos;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.kama.entities.Showcase;
import dev.kama.utils.HibernateUtil;

public class ShowcaseLocalDAO implements ShowcaseDAO{
	
	SessionFactory sf = HibernateUtil.getSessionFactory();

	public Showcase createShowcase(Showcase showcase) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.getTransaction().commit();
		sess.close();
		return showcase;
	}

	public Showcase getShowcaseById(int id) {
		Session sess = sf.openSession();
		 Showcase showcase = sess.get(Showcase.class, id);
		return showcase;
	}

	public Showcase getShowcaseByDate(Date date) {
		Session sess = sf.openSession();
		Showcase showcase = sess.get(Showcase.class, date);
		return showcase;
	}

	public Showcase updateShowcase(Showcase showcase) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.update(showcase);
		sess.getTransaction().commit();
		sess.close();
		return showcase;
	}

	public boolean deleteShowcase(Showcase showcase) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.delete(showcase);
		sess.getTransaction().commit();
		sess.close();
		return true;
	}

}
