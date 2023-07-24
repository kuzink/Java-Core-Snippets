package algorithms;

import java.util.*;

public class UndergroundSystem {

	//Нужно подсчитать среднее время поездки между станциями(например A и B) для всех пассажиров

	private Map<Integer, Pair<String, Integer>> checkins = new HashMap<>();
	private Map<Pair<String, String>, int[]> routes = new HashMap<>();

	//Пассажир (id это id-пассажира или его карточки) садится на поезд на станции startStationName, время посадки - int t
	public void checkIn(int id, String startStationName, int t) {
		checkins.put(id, new Pair(startStationName, t));
	}

	//Пассажир выходит с поезда на станции endStationName, время выхода из поезда - int t
	public void checkOut(int id, String endStationName, int t) {
		Pair<String, Integer> cIn = checkins.get(id);
		checkins.remove(id);

		Pair<String, String> route = new Pair(cIn.getKey(), endStationName);

		int[] trip = routes.getOrDefault(route, new int[2]);
		trip[0]++; // количество поезок
		trip[1] += t - cIn.getValue(); //общее время поездок

		routes.put(route, trip);
	}

	public double getAverageTime(String startStation, String endStation) {
		int[] trip = routes.get(new Pair(startStation, endStation));
		if (trip == null) {
			return 0;
		}
		return (double) trip[1] / trip[0];
	}







	class Pair<K, V> {

		private final K key;
		private final V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

	}
}
