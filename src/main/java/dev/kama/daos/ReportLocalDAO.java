package dev.kama.daos;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.kama.entities.Report;
import dev.kama.utils.HibernateUtil;

public class ReportLocalDAO implements ReportDAO{
	
	SessionFactory sf = HibernateUtil.getSessionFactory();	

	public Report createReport(Report report) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.getTransaction().commit();
		sess.close();
		return report;
	}

	public Report getReportById(int id) {
		Session sess = sf.openSession();
		Report report = sess.get(Report.class, id);
		return report;
	}

	public Report getReportByDate(Date date) {
		Session sess = sf.openSession();
		Report report = sess.get(Report.class, date);
		return report;
	}

	public Report updateReport(Report report) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.update(report);
		sess.getTransaction().commit();
		sess.close();
		return report;
	}

	public boolean deleteReport(Report report) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.delete(report);
		sess.getTransaction().commit();
		sess.close();
		return true;
	}

}
