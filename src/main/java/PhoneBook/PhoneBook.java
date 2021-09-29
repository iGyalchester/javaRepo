package PhoneBook;
import java.util.List;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneBook {
	//encapsulation
	private final Map<String, String> phonebook;

	public PhoneBook(Map<String, String> map) {

		this.phonebook = map;
	}

	public PhoneBook() {

		this(null);
	}

	public void add(String name, String phoneNumber) {

	}

	public void addAll(String name, String... phoneNumbers) {

	}

	public void remove(String name) {

	}

	public Boolean hasEntry(String name) {

		return null;
	}

	public List<String> lookup(String name) {

		return null;
	}

	public String reverseLookup(String phoneNumber)  {

		return null;
	}

	public List<String> getAllContactNames() {

		return null;
	}

	public Map<String, List<String>> getMap() {

		return null;
	}
}
