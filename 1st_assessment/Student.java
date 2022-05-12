// create a class that captures students. each student has a first name, last name, class year and major.
// create two examples of student 

class Student1{

String fname;
String lname;
int year;


public void set(String fname){
 
 this.fname=fname;

}

public void set(String lname){
 
 this.lname=lname;

}
public void set(int year){
 
 this.year=year;

}

public void get(String fname){
 
 return fname;

}
public void get(String lname){
 
 return lname;

}
public void get(int year){
 
 return year;

}



}


class Student{
public static void main(String args[]){

Student1 s1 = new Student1();
s1.fname="pornima";
s1.lname="shejul";
s1.year=2001;











}













}