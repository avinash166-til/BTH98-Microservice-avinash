package THBS.JAVAPRG;



class Student1{
private int rollNo;
private String name;
private int marks;
Student1(int rollNo , String name , int marks){
this.rollNo = rollNo;
this.name = name;
this.marks = marks;
}
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getMarks() {
return marks;
}
public void setMarks(int marks) {
this.marks = marks;
}

}

public class Sort {

static Student1[] sort(Student1[] st)
{
for(int i = 0; i < st.length; i++)
{
for(int j = i + 1; j < st.length; j++)
{
if(st[i].getRollNo()>st[j].getRollNo())
{
Student1 temp = st[i];
st[i] = st[j];
st[j] = temp;
}
}
}
return st;
}



public static void main(String[] args)
{
Student1 st1 = new Student1(103, "Raju" , 98);
Student1 st2 = new Student1(102, "Shesha" , 99);
Student1 st3 = new Student1(101, "Ganesh" , 99);



Student1[] st = {st1, st2, st3};



System.out.println("----------Input---------");

for(int i = 0; i < st.length; i++)
{
System.out.println(st[i].getRollNo()+" , "+st[i].getName()+" , "+st[i].getMarks());
}


sort(st);





System.out.println("-------Output-------");
for(int i = 0; i < st.length; i++)
{
System.out.println(st[i].getRollNo()+" , "+st[i].getName()+" , "+st[i].getMarks());
}





}



}