package kitchen;

public class BigCup extends Cup {
	
	BigCup(){}
	public BigCup(String liquidName,Integer liquidVolume){
	setLiquidVolume(liquidVolume);
	setLiquidName(liquidName);
	}
	 public void setLiquidVolume(Integer liquidVolume) {
	    	int min=0;
	    	int max=1000;
	    	if(liquidVolume>max) {
	    		this.liquidVolume=max;
	    	}else if(liquidVolume<min) {
	    		this.liquidVolume=min;
	    	}else {
	    		this.liquidVolume=liquidVolume;
	    	}
	    }

}
