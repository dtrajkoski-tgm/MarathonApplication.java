package sectionpark.timingstation;

import sectionpark.model.TimingstationData;

public class TimingstationSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public TimingstationData getData( String inTimingstationID ) {
		TimingstationData data = new TimingstationData();
		data.setTimingstationID( inTimingstationID );
		data.setDistance(getRandomInt(1,45));
		data.setAltitude( getRandomInt(100,250) );
		TimingstationData.WeatherData weather = new TimingstationData.WeatherData();
		weather.setPrecipitation(0);
		weather.setTemperature(getRandomInt(15,30));
		weather.setAtmosphericPressure(getRandomInt(100,101));
		weather.setWindspeed(getRandomInt(10,40));
		data.setWeather(weather);
		int i = getRandomInt(1,4)
		TimingstationData.CompetitionData competition = new TimingstationData.CompetitionData[];
		TimingstationData.CompetitionData.Party[] party = new TimingstationData.CompetitionData.Party[temp];
		for(int i = 0; i < temp; i++) {
			party[i] = new TimingstationData.CompetitionData.Party();
			party[i].setPartyID(getRandomInt(0, 2000));
			party[i].setTiming("00:" + getRandomInt(25, 50) + ":" + getRandomInt(25, 50));
			competition.setParty(party);
		}
		data.setCompetition(competition);
		cd.setParty();


		return data;
		
	}

}
