/*To find the given year is leap year or not*/
class Leapyear{
public static void main(String as[]){
int year=2023;
if (year%400==0)
System.out.println("Leap year");
else if(year%100==0)
System.out.println("Not Leap year");
else if(year%4==0)
System.out.println("Leap year");
else
System.out.println("Not Leap year");
}
}