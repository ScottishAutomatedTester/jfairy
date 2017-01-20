package io.codearte.jfairy.producer.person;

public interface Address {

	String getStreet();
	void setStreet(String street);

	String getStreetNumber();
	void setStreetNumber(String streetNumber);

	String getApartmentNumber();
	void setApartmentNumber(String apartmentNumber);

	String getPostalCode();
	void setPostalCode(String postalCode);

	String getCity();
	void setCity(String city);

	String getAddressLine1();

	String getAddressLine2();
}
