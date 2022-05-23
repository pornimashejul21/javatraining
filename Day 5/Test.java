import java.util.*;
class Test1 {
int i,j;
void add(){
System.out.println(i+j);
}
Test1 (int x, int y){
i = x;
j = y;
}
}
public class Test {
public static void main(String[] args){
Test1 t1=new Test1(10,20);
Test1 t2=new Test1 (30,40);
Test1 t3=null;
t1.add();
t2.add();
t3.add();
}
}