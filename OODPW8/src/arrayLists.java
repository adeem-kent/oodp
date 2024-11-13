import java.util.ArrayList;
import java.util.Iterator;

public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Boolean> list2 = new ArrayList<Boolean>();
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList<Double> list4 = new ArrayList<Double>();
		ArrayList<Character> list5 = new ArrayList<Character>();

		// adding
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// getting
		System.out.println(list.get(0)); // 10

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list3.add("Cat");
		list3.add("Dog");
		list3.add("Rabbit");
		list3.add("Lion");
		list3.add("Rabbit");
		
		//replaces
		list3.set(0, "Ant");
		System.out.println(list3);
		
		System.out.println(list3.indexOf("Rabbit")); 
		System.out.println(list3.lastIndexOf("Rabbit")); 
		System.out.println(list3.isEmpty());
		System.out.println(list5.isEmpty());
		System.out.println(list3.get(2).equals("Rabbit"));
		System.out.println(list3.contains("Lion"));
		
		list3.remove(2);
		
		System.out.println(list3);
		
		///////////////////////List Iterator
		
		Iterator <String> i = list3.iterator();
		while (i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
		
		///////////////////////

	}

}
