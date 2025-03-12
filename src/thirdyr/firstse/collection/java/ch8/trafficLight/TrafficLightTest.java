package thirdyr.firstse.collection.java.ch8.trafficLight;

/*
	Practice 8.1

	This is a Test class for the Practice 8.1 Traffic Light.
*/

public class TrafficLightTest {
	public static void main(String[] args) {
		for(TrafficLight trafficLight : TrafficLight.values())
			System.out.printf("%s - %d\n", trafficLight, trafficLight.getDuration());
	}
}
