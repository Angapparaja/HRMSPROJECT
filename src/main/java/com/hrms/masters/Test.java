package com.hrms.masters;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Automation Test automation";
		//String test;
		
		String[] duplicate=name.split(" ");
		
		for(String test:duplicate)
		{
			String names=test;
			if(names==test)
			{
				System.out.println("duplicate:"+names);	
			}
			//System.out.println(test);
			
			
		}
	}

}
