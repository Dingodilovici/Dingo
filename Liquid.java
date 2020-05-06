package world;

public class Liquid {
private String name;
private Integer volume;
private Double temperature;

/////////NAME///////////
public String getName() {
	return name;
}
public void setName(String name) {
	if( name.equals(name)) {
		this.name=name;
	}else if(name=="") {
		System.out.println("WRONG!");
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
	final int min=0;
	int max=100;
	if(temperature>=min && temperature<=max) {
	this.temperature=temperature;
	}
	else {
		System.out.println("WRONG!!!");
	}
}


Liquid(){}
public Liquid(String name,Integer volume,Double temperature) {
	setName(name);
	setVolume(volume);
	setTemperature(temperature);
  }
public void Advance() {
	System.out.println("Name :"+getName()+"  Temperature :"+getTemperature()+"  Volume :"+getVolume());
}

public void isCold() {
	Advance();
	if(temperature<=18) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}
public void isWarm() {
	Advance();
	if(temperature>=18 && temperature<=36) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}
public void isHot() {
	Advance();
	if(temperature>=36) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
}
}
