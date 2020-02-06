package dev.kama.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.kama.entities.Child;
import dev.kama.entities.Parent;
import dev.kama.entities.Report;
import dev.kama.entities.Teacher;
import dev.kama.utils.HibernateUtil;

public class App {

	static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public static void main(String [] args) {
		Session sess = sf.openSession();
		
		Teacher t = sess.get(Teacher.class, 1);
		Child c = sess.get(Child.class, 1);
		Parent p = sess.get(Parent.class, 1);
		Report r = sess.get(Report.class, 1);
		
//		System.out.println(t);
//		System.out.println(c);
//		System.out.println(p);
//		System.out.println(r);
		
		System.out.println(c.getParent());
		System.out.println(p.getChildren());
		System.out.println(r.getChild());
		System.out.println(r.getTeacher());
		
		
		
		sf.close();
	}
}
