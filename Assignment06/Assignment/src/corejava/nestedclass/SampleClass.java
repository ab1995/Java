package corejava.nestedclass;

import java.util.*;
import java.sql.Timestamp;

public class SampleClass {
	
	private Cache cache;
	
	private class Cache{
		private int id;
		private HashMap<Integer, Timestamp> timeMap=new HashMap<Integer, Timestamp>();	
	}
	
	public SampleClass(int id){
		this.cache=new Cache();
		cache.id=id;
		cache.timeMap.put(id, new Timestamp(System.currentTimeMillis()));
	}
	
	public int getId(){
		return cache.id;
	}
		
	public String toString(){
		return "id: "+cache.id+" Timestamp: "+cache.timeMap.get(cache.id);
	}
}
