package com.example.demo;

public class GFS {
	
	String name="sampledata";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class cls=Class.forName("GFS");		
			GFS obj= (GFS)cls.newInstance();
			System.out.println(obj.name);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
