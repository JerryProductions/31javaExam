package thirdyr.firstse.collection.java.ch8.trafficLight;

/*
	Practice 8.1
	
	Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter--
	the duration of the light.
	Write a program to test the TrafficLight enum so that it displays the enum constants and their durations.
*/

public enum TrafficLight {
	RED(90),
	GREEN(70),
	YELLOW(60);
	
	// Instance field
	private final int duration;
	
	// Enum constructor
	TrafficLight(int duration) {
		this.duration = duration;
	}
	
	// Getter
	public int getDuration() {
		return duration;
	}
}
