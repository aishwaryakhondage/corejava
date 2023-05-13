package Com.OOP.inheritanceDemo;


 class A
 {
     public void m1()
     {
        System.out.println("M1 is calling......");
     }
 }
class B extends A//Single level Inheritance
{
	public void m2()
	{	
	System.out.println("M2 is calling......");
	}
	

public class InheritanceDemo {	
	
   public static void main (String[] args)
   {	
	  //Scenario1: Child class ref and child class object
      B b1=new B();
      b1.m1();
      b1.m2();
   }  
}  
}     
      
      
      
      
      
      
      
      
      
      
