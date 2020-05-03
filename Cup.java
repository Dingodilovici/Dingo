package kitchen;
public class Cup {
	 static int min =0;
	 static int max = 600;
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
	
    private Integer liquidVolume;
    
    public Integer getLiquidVolume(){
    	return liquidVolume;
    }
    
    
    public void setLiquidVolume(Integer liquidVolume) {
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
        this.liquidName = liquidName;
        setLiquidVolume(liquidVolume);
        
    }
    public void printInfo() {
    	System.out.println("CUP:"+liquidName + " :"+liquidVolume);
    }

    // ??? +set/+get
}