package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		List<Map<String,Object>> register_list = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> register = new HashMap<String,Object>();
		register.put("gameCode","smzx");
		register.put("month", "2014-04");
		register.put("register", 1);
		register.put("pay", 0);
		
		Map<String,Object> register2 = new HashMap<String,Object>();
		register2.put("gameCode","stgl");
		register2.put("month", "2014-04");
		register2.put("register", 5);
		register2.put("pay", 0);
		
		Map<String,Object> register3 = new HashMap<String,Object>();
		register3.put("gameCode","salz");
		register3.put("month", "2014-05");
		register3.put("register", 6);
		register3.put("pay", 0);
		
		register_list.add(register);
		register_list.add(register2);
		register_list.add(register3);
		
		
		List<Map<String,Object>> pay_list = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> pay = new HashMap<String,Object>();
		pay.put("gameCode", "smzx");
		pay.put("month", "2014-04");
		pay.put("pay", 12);
		
		Map<String,Object> pay2 = new HashMap<String,Object>();
		pay2.put("gameCode", "smzx");
		pay2.put("month", "2014-04");
		pay2.put("pay", 14);
		
		
		pay_list.add(pay);
		pay_list.add(pay2);
		
		
		for(Map<String,Object>  reg : register_list) {
			
			for(Map<String,Object> pays:pay_list) {
				
				if(pays.get("gameCode").equals(reg.get("gameCode"))
						&&pay.get("month").equals(reg.get("month"))
				   ){
						reg.put("pay", pays.get("pay"));
					}
				
			}
		}
		
		
		System.out.println(register_list);
		
		
		
		
		
		
		
	}

}
