package com.jap;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class SortingCitiesTest {
	SortingCities object;
	String [] cities;
	String [] distance;
    @Before
    public void setUp()  {

		object = new SortingCities();
     cities = {"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
   distance = {138,52,118,136,85,276,103,87,214,101};

    }
	
    @After
    public void tearDown()  {
		toUpperCase = null;
		greaterCites = null;
		nearZurich = null;

    }

	@Test
	public void toUpperCase(){
		assertEquals(,object.ToUpperCase(cities));
	}
    //write all the test cases here
	@Test
	public void greaterCites(){

		assertEquals(,object.greaterCites(cities));
	}
	@Test
	public void nearZurich(){
		assertEquals(,object.nearZurich(cities));
	}
}
