# Java Programming Self Review Exercises

## Problems

### Self Review 6.6:

Write a complete Java application to prompt the user for the `double` radius of a sphere, and call method `sphereVolume` to calculate and display the volume of the sphere. Use the following statement to calculate the volume: `double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 )`.

---

## Answers to Problems

### 6.6 Program

```java
import java.util.Scanner;

public class Sphere {
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter radius of sphere: " );
		double radius = input.nextDouble();
		
		System.out.printf( "Volume is %f\n", sphereVolume( radius ) );
	}
	
	public static double sphereVolume( double radius )
	{
		double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
		return volume;
	}
}
```