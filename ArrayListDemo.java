import java.util.ArrayList;

public class ArrayListDemo{

	public static void main(String[] args) {
			
		// ArrayList = 	a resizable array. Elements can be added and removed after compilation phase store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(0, "sushi");
		//food.remove(2);
		//food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);

	}
}