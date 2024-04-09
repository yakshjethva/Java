public class Arrays {
	public static void main(String[] args) {

		// 1-D Simple Array
		String[] car = new String[3];
		
		car[0] = "Camaro";
		car[1] = "Corvette";
		car[2] = "Tesla";
			
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}

		// 2-D Aray
		String[][] cars = {
				{ "Camaro", "Corvette", "Silverado" },
				{ "Mustang", "Ranger", "F-150" },
				{ "Ferrari", "Lambo", "Tesla" }
		};
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
		}
	}
}
