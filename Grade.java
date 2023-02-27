/*Program to write the grade by using switch case*/
class Grade{
public static void main(String as[]){
int marks=77;
String grade="";
switch(marks/10){
case 5:
System.out.println("grade is E");
break;
case 6:
System.out.println("grade is D");
break;
case 7:
System.out.println("grade is C");
break;
case 8:
System.out.println("grade is B");
break;
case 9:
case 10:
System.out.println("grade is A ");
break;
default:
System.out.println("grade is F");
}
}
}