package snippets

import io.codearte.jfairy.Fairy
import io.codearte.jfairy.producer.person.Person

/**
 * @author Mariusz Smykuła
 */
class Foo {

	public static void main(String[] args) {
		Person person = Fairy.create(Locale.UK).person();
		Person usPerson = Fairy.create().person();



		println person.getAddress().toString();
		println person.getAddress().postalCode;
		println person.address.street;
		println person.address.city;
		println person.address.apartmentNumber;
		println "\n\n";

		println usPerson.getAddress().toString();
		println usPerson.getAddress().postalCode;
		println usPerson.address.street;
		println usPerson.address.city;
		println usPerson.address.apartmentNumber;
		println "\n\n";

		person.getAddress().setCity("Law, Carluke");
		person.getAddress().setStreetNumber("43");
		person.getAddress().setStreet("Bourtree Crescent");
		person.getAddress().setPostalCode("ML8 5GH");

		println person.getAddress().toString();
		println person.getAddress().postalCode;
		println person.address.street;
		println person.address.city;
		println person.address.apartmentNumber;
	}

}
