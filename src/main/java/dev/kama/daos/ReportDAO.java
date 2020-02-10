package dev.kama.daos;

import java.sql.Date;

import dev.kama.entities.Report;

public interface ReportDAO {
	
	// create
	Report createReport(Report report);
	
	// read
	Report getReportById(int id);
	Report getReportByDate(Date date);
	
	//update
	Report updateReport(Report report);
	
	//delete
	boolean deleteReport(Report report);
}


