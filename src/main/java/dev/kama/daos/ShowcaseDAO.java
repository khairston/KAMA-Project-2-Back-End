package dev.kama.daos;

import java.sql.Date;

import dev.kama.entities.Showcase;

public interface ShowcaseDAO {
	
	// create
	Showcase createShowcase(Showcase showcase);
	
	// read
	Showcase getShowcaseById(int id);
	Showcase getShowcaseByDate(Date date);
	
	//update
	Showcase updateShowcase(Showcase showcase);
	
	//delete
	boolean deleteShowcase(Showcase showcase);

}
