package rensyu;

public class Student3 {
private int no; 
private String name;
private static int baseno = 0;


Student3(String name){
	baseno ++;
	this.name = name;
	this.no = baseno;

}

public void print() {
	System.out.println(no + " " +name);
}
public static  void initbaseno() {
	baseno = 0;
}

}
