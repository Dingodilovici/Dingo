package kitchen;
public class Cup {
	 
	private String liquidName;
	
	public String getLiquidName() {
		return liquidName;
	}
	public void setLiquidName(String liquidName) {
		if(liquidName.equals("WATER") || liquidName.equals("MILK") || liquidName.equals("TEA")) {
		this.liquidName=liquidName;
		}else {
			System.out.println("Noname!");
		}
	}
	
    protected Integer liquidVolume;
    
    public Integer getLiquidVolume(){
    	return liquidVolume;
    }
    
    
    public void setLiquidVolume(Integer liquidVolume) {
    	int min=0;
    	int max=600;
    	if(liquidVolume>max) {
    		this.liquidVolume=max;
    	}else if(liquidVolume<min) {
    		this.liquidVolume=min;
    	}else {
    		this.liquidVolume=liquidVolume;
    	}
    }
    

    Cup(){}
    public Cup( String liquidName, Integer liquidVolume ){
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
        
    }
    public void printInfo() {
    	System.out.println("CUP:"+liquidName + " :"+liquidVolume);
    }

    // ??? +set/+get
}