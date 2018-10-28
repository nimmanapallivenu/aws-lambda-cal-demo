package demo;

import java.util.LinkedHashMap;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Calculator implements RequestHandler<List, String> {

	

	public String handleRequest(List input, Context context) {
		System.out.println("Request input:" + input);
		//[{key1=10, key2=20, key3=30}] 
		LinkedHashMap<String,String> data=  (LinkedHashMap<String, String>) input.get(0);
		
		int a=0,b=0,c=0;
		
		 a = Integer.parseInt(data.get("key1"));
		 b= Integer.parseInt(data.get("key2"));
		 c= Integer.parseInt(data.get("key3"));
		calculator(a,b,c);
		
		return "done";
	}

	public void calculator(int x, int y,int z) {
		System.out.println("Sum of numbers :\t" +( x + y+z));
	}

}
