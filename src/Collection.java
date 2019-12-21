import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collection {

	//Example: operations on list
	public void presentIterable1 () {
		List<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		list.add("three");
		
		list.remove ("two");

		for(Object o : list){
		    System.out.println(o);
		}

	}
	
	//Example: operations on set
	public void presentIterable2 () {
		Set<String> set = new HashSet<String>();

		set.add("object 1");
		set.add("object 2");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element);
		}

	}
	
	//Example: operations on list with custom objects
	public void newPerson () {
		List<Person> personList = new ArrayList<Person>();
		Person p = new Person();
		Scanner scan = new Scanner (System.in);
		String name = scan.nextLine();
		p.setName(name);
		personList.add(p);
		
		for (Person pTemp : personList) {
			System.out.println(pTemp);
		}
		
		scan.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonManager oc = new PersonManager();
		
		Scanner scan = new Scanner (System.in);
		Boolean cont = true;
		do {
			System.out.println("Podaj operacjê:");
			System.out.println("[1]. Dodanie osoby");
			System.out.println("[2]. Usuniêcie osoby");
			System.out.println("[3]. Wyœwietlenie osób");
			System.out.println("[4]. Koniec dzia³ania aplikacji");
			String operation = scan.nextLine();
			if ("1".equals(operation)) {
				System.out.println("Podaj nazwê");
				String name = scan.nextLine();
				Person p1 = new Person();
				p1.setName(name);
				oc.addPerson(p1);
			} else if ("2".equals(operation)) {
				System.out.println("Podaj nazwê");
				String name = scan.nextLine();
				if (!oc.removePerson(name))
					System.out.println("Osoby nie ma na liœcie");
				else
					System.out.println("Usuniêto osobê z listy");
			} else if ("3".equals(operation)) {
				System.out.println("Lista osób:");
				for (Person p : oc.getPersons()) {
					System.out.println(p);
				}
			} else if ("4".equals(operation)) {
				System.out.println("Bye.");
				cont = false;
			} else {
				System.out.println("Nieprawid³owa operacja");
			}
		} while (cont);
		scan.close();
	}

}
