package optional;

import java.security.PublicKey;
import java.util.Optional;

public class Main {


	public static void of() {

		// create a Optional
		Optional<Integer> op
		= Optional.of(7777);

		// print value
		System.out.println("Optional: "
				+ op);
	}

	public static void ofNullable() {

		//The ofNullable() method of java.util.Optional class
		//in Java is used to get an instance of this Optional 
		//class with the specified value of the specified type
		//. If the specified value is null, then this method
		//returns an empty instance of the Optional class.		

		// create a Optional
		Optional<Integer> op1
		= Optional.ofNullable(9455);

		// print value
		System.out.println("Optional 1: "
				+ op1);

		// create a Optional
		Optional<String> op2
		= Optional.ofNullable(null);

		// print value
		System.out.println("Optional 2: "
				+ op2);
	}

	public static void filter() {

		//		The filter() method of java.util.Optional class in Java is used to filter the 
		//		value of this Optional instance by matching it with the given Predicate, and 
		//		then return the filtered Optional instance. If there is no value present in 
		//		this Optional instance, then this method returns an empty Optional instance.


		// create a Optional
		Optional<Integer> op
		= Optional.of(9111);

		// print value
		System.out.println("Optional: "
				+ op);

		// filter the value
		System.out.println("Filtered value "
				+ "for odd or even: "
				+ op
				.filter(num
						-> num % 2 == 0));

	}

	public static void orElse() {

		//		The orElse() method of java.util.Optional class in Java is used to get 
		//		the value of this Optional instance, if present. If there is no value
		//		 present in this Optional instance, then this method returns the specified value.

		// create a Optional
		Optional<Integer> op
		= Optional.empty();

		// print value
		System.out.println("Optional: "
				+ op);

		try {

			// orElse value
			System.out.println("Value by orElse"
					+ "(100) method: "
					+ op.orElse(100));
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void orElseGet() {
		//		The orElseGet() method of java.util.Optional class in Java is
		//		 used to get the value of this Optional instance if present. 
		//		If there is no value present in this Optional instance, then 
		//		this method returns the value generated from the specified supplier.
		// create a Optional

		Optional<Integer> op
		= Optional.empty();

		// print supplier
		System.out.println("Optional: "
				+ op);

		// orElseGet supplier
		System.out.println("Value by orElseGet"
				+ "(Supplier) method: "
				+ op.orElseGet(
						() -> (int)(Math.random() * 10)));

	}

	public static void orElseThrow() {

		//		The orElseThrow() method of java.util.Optional class
		//		 in Java is used to get the value of this Optional 
		//		instance if present. If there is no value present in this 
		//		Optional instance, then this method throws the exception 
		//		generated from the specified supplier.

		// create a Optional
		Optional<Integer> op
		= Optional.of(33);

		// print supplier
		System.out.println("Optional: "
				+ op);

		try {

			// orElseThrow supplier
			System.out.println(
					"Value by orElseThrow("
							+ "ArithmeticException::new) method: "
							+ op.orElseThrow(
									ArithmeticException::new));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}


	public static void main(String[] args) {

		ofNullable();
		of();
		filter();
		orElse();
		orElseGet();
		orElseThrow();




	}

}
