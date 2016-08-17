/**
 * This class is used to define a Person object, with the following details:
 * Name, Phone, Email.
 */
package seedu.addressbook;

/**
 * @author Zhijie
 *
 */
class Person {

	private String name, phone, email;
	
	/**
	 * @param name
	 * @param phone
	 * @param email
	 */
	Person(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}

	/**
	 * @return the phone
	 */
	String getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	String getEmail() {
		return email;
	}
	
	
	
}
