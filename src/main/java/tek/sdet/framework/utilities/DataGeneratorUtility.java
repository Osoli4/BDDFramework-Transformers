package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	public static void main(String[] args) {
		System.out.println(data("firstName"));
		System.out.println(data("lastName"));
		System.out.println(data("fullName"));
//		System.out.println(data("phoneNumber"));
//		System.out.println(data("fullName"));
//		System.out.println(data("address"));
//		System.out.println(data("city"));
//		System.out.println(data("state"));
//		System.out.println(data("zipCode"));

	}

	public static String firstName = "";
	public static String lastName = "";

	public static String data(String input) {
		Faker faker = new Faker();
		String outPut = "";
		if (input.equals("firstName")) {
			firstName = faker.name().firstName();
			outPut = firstName;
			// outPut = faker.name().firstName(); // this was original
		} else if (input.equals("lastName")) {
			lastName = faker.name().lastName();
			outPut = lastName;
			// outPut = faker.name().lastName(); // this was original
		} else if (input.equals("email")) {
			outPut = faker.expression("#{letterify '????????@tekschool.us'}"); // this generates 30 char email if it was less
			// outPut = faker.name().firstName() + "." + faker.name().lastName() +
			// "@tekschool.us";
		} else if (input.equals("phoneNumber")) {
			outPut = faker.phoneNumber().cellPhone();
		} else if (input.equals("fullName")) { // Original
			outPut = firstName + " " +lastName;    
			//outPut = faker.name().fullName();
		} else if (input.equals("streetAddress")) {
			outPut = faker.address().streetAddress();
		} else if (input.equals("city")) {
			outPut = faker.address().city();
		} else if (input.equals("state")) {
			outPut = faker.address().state();
		} else if (input.equals("zipCode")) {
			outPut = faker.address().zipCode();
		} else if (input.equals("country")) {
		outPut ="United States";
		} else if (input.equals("apt")) {
			outPut = faker.address().secondaryAddress();
		}
		return outPut;
	}
}