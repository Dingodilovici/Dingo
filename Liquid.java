package world;

public class Liquid {
private String name;
private Integer volume;
private Double temperature;
boolean m = true;
/////////NAME///////////
public String getName() {
	return name;
}
public void setName(String name) {
	if(name.equals("    ")) {
		System.out.println("WRONG!");
	}else {
	this.name=name;
	}
}
/////////volume///////////
public Integer getVolume() {
	return volume;
}
public void setVolume(Integer volume) {
	int min=0;
	if(volume<=min) {
		System.out.println("WRONG!!!");
	}else {
	this.volume=volume;
	}
}
/////////temperature///////////
public Double getTemperature() {
	return temperature;
}
public void setTemperature(Double temperature) {
	int min=0;
	int max=100;
	if(temperature>=min && temperature<=max) {
	this.temperature=temperature;
	}else {
		System.out.println("WRONG!!!");
	}
}


Liquid(){}
public Liquid(String name,Integer volume,Double temperature) {
	setName(name);
	setVolume(volume);
	setTemperature(temperature);
  }

public boolean isCold(Double temperature,String name,Integer volume) {
	
	if(temperature<=18) {
		System.out.println("Name :"+name+"  Temperature :"+temperature+"  Volume :"+volume);
		return true;
	}else {
		System.out.println("Name :"+name+"  temperature :"+temperature+"  Volume :"+volume);
		return false;
	}
}
public boolean isWarm(Double temperature,String name,Integer volume) {
	if(temperature>=18 && temperature<=36) {
		System.out.println("Name :"+name+"  Temperature :"+temperature+"  Volume :"+volume);
		return true;
	}else {
		System.out.println("Name :"+name+"  Temperature :"+temperature+"  Volume :"+volume);
		return false;
	}
}
public boolean isHot(Double temperature,String name,Integer volume) {
	if(temperature>=36) {
		System.out.println("Name :"+name+"  Temperature :"+temperature+"  Volume :"+volume);
		return true;
	}else {
		System.out.println("Name :"+name+"  Temperature :"+temperature+"  Volume :"+volume);
		return false;
	}
}
}
