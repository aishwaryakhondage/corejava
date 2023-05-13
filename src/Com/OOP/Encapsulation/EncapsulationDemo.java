package Com.OOP.Encapsulation;

class Emp
{
    //Encapsulation=data+function---->Data security (hide)----->private
	
	
	private int id=101;
    private String name="sarang";
    //public layer-getter and setter
    public void setId(int id)
    {
         this.id =id;
    }	
    
    public int getId()
    {	
    	return id;
    }
    //Business logic 		
    public void show()
    {
	   System.out.println(id);
       System.out.println(name);
    }	
    
    
    
    


 
 public class EncapsulationDemo
 {
 public static void main(String[] args) 
 {
 	Emp e1=new Emp();
	 e1.show();
//	 e1.id=201;
//   e1.name="Priti"
	 e1.show();
	 
 }
	 
 }	 
	 
	 
	 
 

	}


