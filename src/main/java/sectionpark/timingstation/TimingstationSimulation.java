package sectionpark.timingstation;

import sectionpark.model.*;

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

		// Generator

		TimingstationData data = new TimingstationData();
		data.setTimingstationID( inTimingstationID );
		data.setDistance( getRandomDouble(1, 40) );
		data.setAltitude( getRandomDouble(100, 200) );


		return data;

	}

	public TimingstationJSON getJSON( String inTimingstationID ) {

		// Generator

		TimingstationJSON data = new TimingstationJSON();
		data.setTimingstationID( inTimingstationID );
		data.setDistance( getRandomDouble(1, 40) );
		data.setAltitude( getRandomDouble(100, 200) );

		data.getWeather().setWindspeed( getRandomDouble(0, 30) );
		data.getWeather().setTemperature( getRandomDouble(20, 30));
		data.getWeather().setPrecipitation( getRandomDouble(0, 5) );
		data.getWeather().setAtmosphericPressure( getRandomDouble(700, 1000) );

		TimingstationJSON.CompetitionData comp = new TimingstationJSON.CompetitionData( getRandomInt(1,6) );
		TimingstationJSON.CompetitionData.Party[] partys = comp.getParty();
		for (int i = 0; i < partys.length; i++) {
			partys[i].setTiming("00:" + getRandomInt(15,30) + ":" + getRandomInt(0,59));
		}

		data.setCompetition(comp);

		return data;

	}

	public TimingstationXML getXML( String inTimingstationID ) {

		TimingstationXML data = new TimingstationXML();
		data.setTimingstationID( inTimingstationID );
		data.setDistance( getRandomDouble(1, 40) );
		data.setAltitude( getRandomDouble(100, 200) );
		data.getWeather().setWindspeed( getRandomDouble(0, 30) );
		data.getWeather().setTemperature( getRandomDouble(20, 30));
		data.getWeather().setPrecipitation( getRandomDouble(0, 5) );
		data.getWeather().setAtmosphericPressure( getRandomDouble(700, 1000) );

		TimingstationXML.CompetitionData comp = new TimingstationXML.CompetitionData( getRandomInt(1,6) );
		TimingstationXML.CompetitionData.Party[] partys = comp.getParty();
		for (int i = 0; i < partys.length; i++) {
			partys[i].setTiming("00:" + getRandomInt(15,30) + ":" + getRandomInt(0,59));
		}

		data.setCompetition(comp);

		return data;

	}

	/**
	 * <timingstationData>
	 *    <timingstationID>001</timingstationID>
	 *    <timestamp>2021-09-12 08:52:39.077</timestamp>
	 *    <distance>1</distance>
	 *    <unitDistance>km</unitDistance>
	 *    <altitude>177</altitude>
	 *    <unitAltitude>m</unitAltitude>
	 *    <weatherData>
	 *     <windspeed>5.46</windspeed>
	 *     <unitWindspeed>kmH</unitWindspeed>
	 *     <temperature>25.78</temperature>
	 *     <unitTemperature>C</unitTemperature>
	 *     <precipitation>0</precipitation>
	 *     <unitPrecipitation>ml</unitPrecipitation>
	 *     <atmosphericPressure>999.0</atmosphericPressure>
	 *     <unitAtmosphericPressure>hPa</unitAtmosphericPressure>
	 *    </weatherData>
	 *    <competitionData>
	 *      <unitTiming>hh:mm:ss</unitTiming>
	 *      <party>
	 *        <partyID>1587</partyID>
	 *        <timing>00:25:33</timing>
	 *      </party>
	 *      <party>
	 *        <partyID>1437</partyID>
	 *        <timing>00:27:01</timing>
	 *      </party>
	 *      <party>
	 *        <partyID>1222</partyID>
	 *        <timing>00:28:59</timing>
	 *      </party>
	 *    </competitionData>
	 *  </timingstationData>
	 */

}
