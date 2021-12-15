package sectionpark.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimingstationData {

	private String timingstationID;
	private String timestamp;

	private double distance;
	private String unitDistance;

	private double altitude;
	private String unitAltitude;

	private WeatherData weather;

	private CompetitionData competition;


	/**
	 * Constructor
	 */
	public TimingstationData() {
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.unitDistance = "km";
		this.unitAltitude = "m";
		this.weather = new WeatherData();
		this.competition = new CompetitionData();
	}

	/**
	 * Setter and Getter Methods
	 */
	public String getTimingstationID() {
		return timingstationID;
	}

	public void setTimingstationID(String timingstationID) {
		this.timingstationID = timingstationID;
	}

	public String getTimestamp() { return this.timestamp; }

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getDistance() { return distance; }

	public double getAltitude() { return altitude; }

	public void setAltitude(double altitude) { this.altitude = altitude;}

	public WeatherData getWeather() { return this.weather; }

	public void setWeather(WeatherData wd){ this.weather = wd; }

	public CompetitionData getCompetition() { return this.competition; }

	public void setCompetition(CompetitionData cd){ this.competition = cd; }

	public String getUnitDistance() { return unitDistance; }

	public String getUnitAltitude() { return unitAltitude; }

	/**
	 * class for the WeatherData in TimingStation
	 */
	public static class WeatherData {

		private double windspeed;
		private String unitWindspeed;

		private double temperature;
		private String unitTemperature;

		private double precipitation;
		private String unitPrecipitation;

		private double atmosphericPressure;
		private String unitAtmosphericPressure;

		public WeatherData() {
			this.unitWindspeed = "kmH";
			this.unitTemperature = "°C";
			this.unitPrecipitation = "ml";
			this.unitAtmosphericPressure = "hPa";
		}

		public double getWindspeed() { return windspeed; }

		public void setWindspeed(double windspeed) { this.windspeed = windspeed; }

		public String getUnitWindspeed() { return unitWindspeed; }

		public double getTemperature() { return this.temperature; }

		public void setTemperature(double temperature) { this.temperature = temperature; }

		public String getUnitTemperature() { return unitTemperature; }

		public double getPrecipitation() { return this.precipitation; }

		public void setPrecipitation(double precipitation) { this.precipitation = precipitation; }

		public String getUnitPrecipitation() { return unitPrecipitation; }

		public double getAtmosphericPressure() { return this.atmosphericPressure; }

		public void setAtmosphericPressure(double atmosphericPressure){ this.atmosphericPressure = atmosphericPressure; }

		public String getUnitAtmosphericPressure() { return unitAtmosphericPressure; }
	}

	/**
	 * class for the CompetitionData in TimingStation
	 */
	public static class CompetitionData {

		private String unitTiming;
		private Party[] party;

		public CompetitionData() {
			this.unitTiming = "hh::mm::ss";
			this.party = new Party();
		}

		public String getUnitTiming(){ return this.unitTiming; }

		public Party[] getParty(){ return this.party; }

		public void setParty(Party[] party){ this.party = party; }

		public static class Party {

			private int partyID;
			private String timing;

			public Party() {
				this.partyID = 0;
				this.timing = "";
			}

			public int getPartyID(){ return this.partyID; }

			public void setPartyID(int partyID){ this.partyID = partyID; }

			public String getTiming(){ return this.timing; }

			public void setTiming(String timing){ this.timing += timing; }

		}
	}
	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Timing Station Info: ID = %s, timestamp = %s, distance = %d", 
			timingstationID, timestamp, distance );
		return info;
	}
}
