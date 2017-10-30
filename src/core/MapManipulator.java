package core;

import java.util.HashMap;

public class MapManipulator {

	public HashMap<String, String> myMap=new HashMap<String, String>();
	
	public void addInMap(String key, String value)
	{
		myMap.put(key, value);
	}
	
	public String getFromMap(String key)
	{
	return	myMap.get(key);
	}
}
