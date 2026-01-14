package chapter12.hashcode;

import java.util.Objects;

public class Key{
	public int number,addr;
	String name;
	

	public Key (int num){
	this.number=num;
    }
	public Key (String name){
		this.name=name;
	}


	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comareKey = (Key)obj;
			if(this.number == comareKey.number) return true;
			else return false;
		}
		return super.equals(obj);
	}
	
	
	
}