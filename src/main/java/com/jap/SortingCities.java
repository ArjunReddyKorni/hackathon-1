package com.jap;
import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class SortingCities
{
    public static void main( String[] args )
    {
        SortingCities object = new SortingCities();
		String [] cities = {"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
		int [] distance = {138,52,118,136,85,276,103,87,214,101};

		String [] upperCase = object.toUpperCase(cities);
		for(int i =0;i< cities.length;i++){
				System.out.println(upperCase[i]+ ", ");
		}
		object.nearZurich(distance,cities);
		object.greaterCites(distance,cities);

    }
	public String[] toUpperCase(String []cites){

			String [] upperCase = new String[cites.length];

			for(int i =0;i < cites.length;i++){
				upperCase[i] = cities[i].toUpperCase;

			}

		return upperCase;	
	}
	public void greaterCites(int []distance,String []cities){

		for(int i =0;i < distance.length;i++){
			if(distance[i] >= 270)
			System.out.print(cities[i] + ", ");
		}
	}
	public void nearZurich(int [] distance, String []cities){

			for(int i=0;i < cities.lenth;i++){

				if(distance[i] == 52 )
				System.out.println(cities[i]);
			}

	}
}
