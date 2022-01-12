package sectionpark.model;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimingstationJSON {

    private String timingstationID;

    private String timestamp;

    private double distance;
    private String unitDistance;

    private double altitude;
    private String unitAltitude;



    // weather
    private WeatherData weather;

    private CompetitionData competition;


    // add attributes

    /**
     * Constructor
     */
    public TimingstationJSON() {

        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        this.unitDistance = "m";
        this.unitAltitude = "hm";
        this.weather = new WeatherData();

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getUnitDistance() {
        return unitDistance;
    }

    public void setUnitDistance(String unitDistance) {
        this.unitDistance = unitDistance;
    }

    public String getUnitAltitude() {
        return unitAltitude;
    }

    public void setUnitAltitude(String unitAltitude) {
        this.unitAltitude = unitAltitude;
    }

    public WeatherData getWeather() { return this.weather; }

    public void setWeather(WeatherData weather){ this.weather = weather; }

    public CompetitionData getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionData competition) {
        this.competition = competition;
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

        public double getTemperature() { return this.temperature; }

        public void setTemperature(double temperature) { this.temperature = temperature; }

        public double getPrecipitation() { return this.precipitation; }

        public void setPrecipitation(double precipitation) { this.precipitation = precipitation; }

        public double getAtmosphericPressure() { return this.atmosphericPressure; }

        public void setAtmosphericPressure(double atmosphericPressure){ this.atmosphericPressure = atmosphericPressure; }

        public String getUnitWindspeed() {
            return unitWindspeed;
        }

        public void setUnitWindspeed(String unitWindspeed) {
            this.unitWindspeed = unitWindspeed;
        }

        public String getUnitTemperature() {
            return unitTemperature;
        }

        public void setUnitTemperature(String unitTemperature) {
            this.unitTemperature = unitTemperature;
        }

        public String getUnitPrecipitation() {
            return unitPrecipitation;
        }

        public void setUnitPrecipitation(String unitPrecipitation) {
            this.unitPrecipitation = unitPrecipitation;
        }

        public String getUnitAtmosphericPressure() {
            return unitAtmosphericPressure;
        }

        public void setUnitAtmosphericPressure(String unitAtmosphericPressure) {
            this.unitAtmosphericPressure = unitAtmosphericPressure;
        }
    }

    public static class CompetitionData {

        private String unitTiming;
        private Party[] party;

        public CompetitionData(int rnd) {
            this.unitTiming = "hh::mm::ss";

            this.party = new Party[rnd];

            for (int i = 0; i < rnd; i++) {
                this.party[i] = new Party(i);
            }
        }

        public String getUnitTiming(){ return this.unitTiming; }

        public Party[] getParty(){ return this.party; }

        public static class Party {

            private int partyID;
            private String timing;

            public Party(int id) {
                this.partyID = id;
                this.timing = "";
            }

            public int getPartyID(){ return this.partyID; }

            public void setPartyID(int partyID){ this.partyID = partyID; }

            public String getTiming(){ return this.timing; }

            public void setTiming(String timing){ this.timing += timing; }

        }
    }
}
