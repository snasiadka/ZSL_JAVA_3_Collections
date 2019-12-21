import java.util.HashSet;
import java.util.Set;

public class PersonManager {
	private Set<Person> persons;
	
	public PersonManager () {
		persons = new HashSet<Person>();
	}
	
	public void addPerson (Person p) {
		persons.add(p);
	}
	
	public Boolean removePerson (String name) {
		Person tempPerson = null;
		for (Person p : persons)
			if (p.getName().equals(name)) {
				tempPerson = p;
				break;
			}
		if (tempPerson != null) {
			persons.remove(tempPerson);
			return true;
		}
		else
			return false;
	}
	
	public void removePerson (Person p) {
		persons.remove(p);
	}
	
	public Set<Person> getPersons() {
		return this.persons;
	}
	
	public Person getPerson (String name) {
		for (Person p : persons)
			if (p.getName().equals(name)) {
				return p;
			}
		return null;
	}
}
