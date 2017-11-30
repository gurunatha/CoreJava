import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class SortByValue implements Comparator<Map.Entry<Integer, Integer>>
{

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o2.getValue().compareTo(o1.getValue());
	}
	
}

public class MapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map =new HashMap<>();
		map.put(1, 8);
		map.put(2, 2);
		map.put(3, 9);
		map.put(4, 2);
		
		
		Set<Entry<Integer, Integer>> ss = new HashSet<>(map.entrySet());
		List<Entry<Integer, Integer>> ll = new ArrayList<>(map.entrySet());
		
		for(Map.Entry<Integer, Integer> map1: ll)
		{
			System.out.println(map1.getKey()+" :: "+map1.getValue());
		}
		
		Collections.sort(ll,new SortByValue());
		System.out.println("-------------------------------");
		
		for(Map.Entry<Integer, Integer> map1: ll)
		{
			System.out.println(map1.getKey()+" :: "+map1.getValue());
		}

	}
	
	

}
