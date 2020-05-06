package kitchen;

public class SmallCup extends Cup {
	
	SmallCup(){}
	public SmallCup(String liquidName,Integer liquidVolume){
		setLiquidVolume(liquidVolume);
		setLiquidName(liquidName);
	}
	 public void setLiquidVolume(Integer liquidVolume) {
	    	int min=0;
	    	int max=200;
	    	if(liquidVolume>max) {
	    		this.liquidVolume=max;
	    	}else if(liquidVolume<min) {
	    		this.liquidVolume=min;
	    	}else {
	    		this.liquidVolume=liquidVolume;
	    	}
	    }
	//public void setLiquidVolume(Integer liquidVolume) {
		//max=200;
		//if(liquidVolume>max) {
	    //super.setLiquidVolume(max);
	    //}else if(liquidVolume<min) {
	    //super.setLiquidVolume(min);
	    //}else {
	    //super.setLiquidVolume(liquidVolume);
	    //}
	//}

}
