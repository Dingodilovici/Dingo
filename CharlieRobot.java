package robo;

public class CharlieRobot extends BetaRobot{
       protected int a;
       protected int b;
       
       public int getA() {
    	   return a;
       }
       public void setA(int a) {
    	   if(a<=0 || a>=100) {
    		   System.out.println("BRUTALITY!!!");
    	   }else {
    	   this.a=a;
    	   }
       }
       public int getB() {
    	   return b;
       }
       public void setB(int b) {
    	   if(b<=0 || b>=100) {
    		   System.out.println("BRUTALITY!!!");
    	   }else {
    	   this.b=b;
    	   }
       }
     
       
	public CharlieRobot(String name, String model) {
		super(name, model);
		
	}
	public boolean DownRight(){
		if(a==0) {
			a++;
		}
		return true;
	}	
	
	public boolean UpLeft   (){
		if(b>=100) {
			b--;
		}
		return true;
	}
	
}
