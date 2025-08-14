package streamslambdas;

import java.util.List;
import java.util.stream.Collectors;


public class CustomerFilter {
	public static List<Customer> filterByCity(List<Customer> customers, String city) {
        return customers.stream()
                        .filter(customer -> city.equalsIgnoreCase(customer.getCity()))
                        .collect(Collectors.toList());
	}
	
}