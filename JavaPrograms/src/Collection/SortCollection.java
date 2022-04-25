package Collection;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class User implements Comparable{
	private String name;
	private int id;


	public User(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(((User) o).getName());
		 //this.getName().compareTo(((User) o).getName());
	}
	
	
}
public class SortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User us1=new User("avita",10);
		User us2= new User("Ravi",11);
		User us3= new User("reva",12);
		
		Map<User,Integer> mp=new TreeMap<User,Integer>();
		
		mp.put(us1, 1);
		mp.put(us2, 2);
		mp.put(us3, 3);
		
		System.out.println(mp);
		
		
		
		

	}

}
