import java.util.HashMap;

class UndergroundSystem {

    // Stores check-in information: id -> (stationName, time)
    private HashMap<Integer, CheckIn> checkIns;

    // Stores travel data: "start->end" -> (totalTime, tripCount)
    private HashMap<String, Trip> trips;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        trips = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkIn = checkIns.get(id);

        String route = checkIn.station + "->" + stationName;
        int travelTime = t - checkIn.time;

        Trip trip = trips.getOrDefault(route, new Trip());
        trip.totalTime += travelTime;
        trip.count++;

        trips.put(route, trip);

        // Remove passenger after checkout
        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;

        Trip trip = trips.get(route);

        return (double) trip.totalTime / trip.count;
    }

    // Class to store check-in details
    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    // Class to store trip statistics
    class Trip {
        int totalTime;
        int count;

        Trip() {
            totalTime = 0;
            count = 0;
        }
    }
}
