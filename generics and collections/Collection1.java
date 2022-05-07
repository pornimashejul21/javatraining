// create an array list which will be able to store only strings. create a printall method which will print all the elements using an iterator

import java.util.*;
public class Collection1{
public static void main(String args[]){

ArrayList<String> ar;
ar = new ArrayList<>();

ar.add("A"); 
ar.add("B"); 
ar.add("C"); 
ar.add("D"); 
ar.add("E"); 

public void printAll(){

System.out.println("By using Iterator");
Iterator<String>it;
it= ar.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}

return it;
}
}