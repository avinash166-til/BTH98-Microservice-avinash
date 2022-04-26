package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxStudMarks {
public static void main(String[] args) {

	
	Department1 d1 = new Department1("cse",123);
	Department1 d2 = new Department1("eee",124);
	Department1 d3 = new Department1("ece",125);
	Department1 d4 = new Department1("Mec",126);
	
	Student1 s1 = new Student1("ravi",56,d1,51,62,53);
	Student1 s2 = new Student1("mavi",57,d2,61,66,68);
	Student1 s3 = new Student1("kavi",58,d3,61,76,77);
	Student1 s4 = new Student1("savi",59,d4,71,78,79);
	Student1 s5 = new Student1("ravi",46,d2,78,89,90);
	Student1 s6 = new Student1("lavi",49,d1,78,97,69);
	Student1 s7 = new Student1("bavi",46,d3,88,67,59);

	List<Student1> stlist = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
 
	for(Student1 st:stlist)

		
	st.setTotal(st.getCmarks()+st.getPmarks()+st.getMmarks());

	Map<Department1, List<Student1>> result = stlist.stream().collect(Collectors.groupingBy(Student1::getDep_id));

	for(List<Student1> st:result.values())
	{

		Optional<Student1> maxmarks = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student1::getTotal)));
     
		 System.out.println(maxmarks);
    }
 
    
}
    
}



