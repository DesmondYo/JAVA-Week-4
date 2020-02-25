import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4HomeWork {

	public static void main(String[] args) {
		
		//1 & 4. 
			List <String> employeeNames = new ArrayList<String>();
		
			employeeNames.add("Dez");
			employeeNames.add("Jay");
			employeeNames.add("Jr");
			employeeNames.add("Jen");
			employeeNames.add("KOB") ;
		
		//2 & 4.
			Set <Integer> ids = new HashSet<Integer>();
		
			ids.add(1);
			ids.add(2);
			ids.add(3);
			ids.add(4);
			ids.add(5);
			
		
		//3 & 4. 
			Map <Integer, String> employeeMap = new HashMap <Integer, String>();
			
			employeeMap.put(1,"Dez");
			employeeMap.put(2,"Jay");
			employeeMap.put(3,"Jr");
			employeeMap.put(4,"Jen");
			employeeMap.put(5,"KOB");
			
		//5.
			int i = 0;
			for (int id : ids) {
				employeeMap.put(id, employeeNames.get(i));
				i++;
			}
		//6.
			for (Integer key : ids) {
				System.out.println(key + " " + employeeMap.get(key));
				
		//7. 
			StringBuilder idsBuilder = new StringBuilder();
			
			for (int id : ids) {
				idsBuilder.append(id + "-");
			}
		//9.
			System.out.println(idsBuilder.toString());
			
		//10. 
			StringBuilder namesBuilder = new StringBuilder();
			
			for (String Name : employeeNames) {
				namesBuilder.append(Name + " ");
			}
			
			System.out.println(namesBuilder.toString());
	
			}

		}
	
	}
