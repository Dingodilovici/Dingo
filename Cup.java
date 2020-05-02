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
	
    private Integer liquidVolume;
    
    public Integer getLiquidVolume(){
    	return liquidVolume;
    }
    public void setLiquidVolume(Integer liquidVolume) {
    	if(liquidVolume>=0 && liquidVolume<=600) {
    	this.liquidVolume=liquidVolume;
    	}else {
    		System.out.println("Null !!!");
    	}
    }

    Cup(){}
    public Cup( String liquidName, Integer liquidVolume ){
        this.liquidName = liquidName;
        this.liquidVolume = liquidVolume;
    }
    public void printInfo() {
    	System.out.println("CUP:"+liquidName + " :"+liquidVolume);
    }

    // ??? +set/+get
}