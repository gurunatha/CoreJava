import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class ClientApp {

	static <K, V extends Comparable<? super V>> List<Entry<K, V>> entriesSortedByValues(Map<K, V> map) {

		List<Entry<K, V>> sortedEntries = new ArrayList<Entry<K, V>>(map.entrySet());

		Collections.sort(sortedEntries, new Comparator<Entry<K, V>>() {
			@Override
			public int compare(Entry<K, V> e1, Entry<K, V> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		});

		return sortedEntries;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * MyInterfaceImpl mimpl = new MyInterfaceImpl();
		 * 
		 * List<Student> st = new ArrayList<>(); st.add(new Student("guru",
		 * 25)); st.add(new Student("chelli", 26)); st.add(new Student("ashok",
		 * 24)); List<Student> sortList = mimpl.getSortedList(st);
		 * 
		 * for(Student stu : sortList) { System.out.println(stu.getName()+" :: "
		 * +stu.getAge()); } System.out.println("----------------");
		 * MyInterface.greet();
		 * 
		 * List<Integer> int1 = new ArrayList<>(); int1.add(10); int1.add(1000);
		 * int1.add(1);
		 * 
		 * System.out.println(mimpl.getMinElement(int1));
		 */

		String l1 = "1024586";
		String l2 = "1024587";
		String l3 = "1024585";
		String l4 = "1024588";

		Map<String, String> mapList = new LinkedHashMap<>();

		mapList.put(l1, "12guru");
		mapList.put(l2, "guru25");
		mapList.put(l3, "256");
		mapList.put(l4, "gu125");
		System.out.println("------------------------");
		System.out.println("sorting based on values "+entriesSortedByValues(mapList));
		System.out.println("------------------------");
		
		
		List<Long> list1 = new ArrayList<>();

		for (String str : mapList.keySet()) {
			list1.add(Long.parseLong(str));
		}
		System.out.println("list1 " + list1);

		/*
		 * Map<Integer,String> intList = new LinkedHashMap<>(); intList.put(8,
		 * ""); intList.put(5, ""); intList.put(10, ""); intList.put(15, "");
		 */

		/*
		 * List<Integer> list1 = new ArrayList<>(intList.keySet());
		 * System.out.println(list);
		 */

		// Collections.reverse(list);

		/*
		 * Collections.sort(list,Collections.reverseOrder());
		 * System.out.println("list"+list);
		 */
		System.out.println("Test");
		System.out.println(mapList);
	}

}

