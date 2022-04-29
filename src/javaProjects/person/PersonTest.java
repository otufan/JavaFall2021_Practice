package javaProjects.person;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {

		PersonMethoden test = new PersonMethoden();
		ArrayList<Person> personArray = new ArrayList<>();
		
		Person person = new Person();
		person.setName("White");
		person.setVorname("John");
		person.setGeburtsdatum("2001");
		
		Person person2 = new Person("Bill", "Mary", "1977");
		Person person3 = new Person("Müller", "Fabienna", "1995");
		Person person4 = new Person("Dicken", "Julia", "1999");

		personArray.add(person);
		personArray.add(person2);
		personArray.add(person3);
		personArray.add(person4);
		test.aus(personArray);
		
		test.menue(personArray);

	}

}
