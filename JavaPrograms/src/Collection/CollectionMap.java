package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop lp1=new Laptop(123,"dell",1000);
Laptop lp2=new Laptop(123,"hp",1000);
Laptop lp3= new Laptop(123,"accer",1000);

Map<Integer,Laptop> mp= new TreeMap<Integer,Laptop>();

mp.put(11, lp1);
mp.put(2,lp2);
mp.put(0, lp3);
System.out.println(mp);

for(Integer x: mp.keySet())
{
	System.out.println(x);
}

}
}