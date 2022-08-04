package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingCitiesTest {
	SortingCities object;
	String [] cities;
	int [] distance;
    @Before
    public void setUp()  {

		object = new SortingCities();
     cities = new String[]{"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
   distance = new int[]{138,52,118,136,85,276,103,87,214,101};

    }
	
    @After
    public void tearDown()  {
		//toUpperCasee = null;
		//greaterCitess = null;
		//nearZurichh = null;

    }

	@Test
	public void toUpperCasee(){
		String[] actual = object.toUpperCase(cities);
		assertNotEquals("BERN, LUCERNE, INTERLAKEN, GRINDELWALD, ENGELBERG, GENEVA, MURREN, BASEL, ZERMATT, JUNGFRAUJOCH,",actual);
	}
    //write all the test cases here
	@Test
	public void greaterCitess(){
			
			String actual = object.greaterCites(distance,cities);
		assertNotEquals("The city which is 52 kms from Zurich is  LUCERNE",actual);
	}
	@Test
	public void nearZurichh(){

		String actual = object.nearZurich(distance,cities);
		assertNotEquals("The cities which is greater than or equal to 270 kms from Zurich are  GENEVA",actual);
	}
	
}
