package com.jap;

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
				System.out.print(upperCase[i]+ ", ");
		}
		System.out.println();
		String [] temp = object.nearZurich(distance,upperCase);
		System.out.println(temp[0]);
		String []temp2 = object.greaterCites(distance,upperCase);
		System.out.println(temp2[0]);

    }
	public String[] toUpperCase(String []cities){

			String [] upperCase = new String[cities.length];

			for(int i =0;i < cities.length;i++){
				upperCase[i] = cities[i].toUpperCase();

			}

		return upperCase;	
	}
	public String[] greaterCites(int []distance, String []cities){
			String [] temp2 = new String[cities.length];
		for(int i =0;i < distance.length;i++){
			if(distance[i] >= 270)
				temp2[0] = cities[i];
			//System.out.print("The cities which is greater than or equal to 270 kms from Zurich are  "+ cities[i]);
		}
        return temp2;
    }
	public String[] nearZurich(int [] distance, String []cities){
			String [] temp = new String[cities.length];
			for(int i=0;i < cities.length;i++){

				if(distance[i] == 52 )
					temp[0]=cities[i];
				//temp = System.out.println( "The city which is 52 kms from Zurich is  "+ cities[i] );
			}

		return temp;
	}
}
