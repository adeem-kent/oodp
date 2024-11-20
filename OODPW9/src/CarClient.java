
public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr [] = new int [3];

		Car cars[] = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();

		cars[0].make = "BMW";
		cars[0].year = 2024;

		cars[1].make = "Honda";
		cars[1].year = 2023;

		cars[2].make = "Skoda";
		cars[2].year = 2022;

		// using the loop
		Car vehicles[] = new Car[3];
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i] = new Car();
		}
		for (int i = 0; i < vehicles.length; i++) {
			cars[i].make = "make " + 1;
			cars[i].year = 2022 + i;
		}
	}

}
