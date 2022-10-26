package javacollections;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void toList() {
		
        // creating a Stream of strings
        Stream<String> s = Stream.of("Geeks",
                                     "for",
                                     "GeeksforGeeks",
                                     "Geeks Classes");
  
        // using Collectors toList() function
        List<String> myList = s.collect(Collectors.toList());
  
        // printing the elements
        System.out.println(myList);

	}
	
	public static void toMap()
	{
	    // Create a String with no repeated keys
	    Stream<String[]>
	        str = Stream
	                  .of(new String[][] { { "GFG", "GeeksForGeeks" },
	                                       { "g", "geeks" },
	                                       { "G", "Geeks" } });

	    // Convert the String to Map
	    // using toMap() method
	    Map<String, String>
	        map = str.collect(
	            Collectors.toMap(p -> p[0], p -> p[1]));

	    // Print the returned Map
	    System.out.println("Map:" + map);
	}
	
	public static void toSet()
	{
        // creating a Stream of strings
        Stream<String> s = Stream.of("Geeks",
                                     "for",
                                     "GeeksforGeeks",
                                     "Geeks Classes");
  
        // using Collectors toSet() function
        Set<String> mySet = s.collect(Collectors.toSet());
  
        // printing the elements
        System.out.println(mySet);
	}
	
	public static void collectAndThen() {
        // Create an Immutable List
        List<String> lt
            = Stream
                  .of("GEEKS", "For", "GEEKS")
                  .collect(Collectors
                               .collectingAndThen(
                                   Collectors.toList(),
                                   Collections::<String> unmodifiableList));
        System.out.println(lt);
	}
	
	
	public static void counting() {
        // creating a stream of strings
        Stream<String> s = Stream.of("1", "2", "3", "4");
  
        // using Collectors counting() method to
        // count the number of input elements
        long ans = s.collect(Collectors.counting());
  
        // displaying the required count
        System.out.println(ans);
	}
	

	
	public static void main(String[] args) {
		
		toList();
		toMap();
		toSet();
		collectAndThen();
		counting();


	}

}
