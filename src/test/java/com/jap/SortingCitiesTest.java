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
		String[] expected = {"BERN", "LUCERNE","INTERLAKEN","GRINDELWALD", "ENGELBERG", "GENEVA","MURREN","BASEL","ZERMATT", "JUNGFRAUJOCH"};
		assertArrayEquals(expected,actual);
	}
    //write all the test cases here
	@Test
	public void greaterCitessFailure(){
			
			String actual = object.greaterCites(distance,cities);
		assertEquals("Geneva",actual);
	}
	@Test
	public void nearZurichh(){

		String actual = object.nearZurich(distance,cities);
		assertEquals("Lucerne",actual);
	}

}
