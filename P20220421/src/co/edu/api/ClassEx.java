package co.edu.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {

		try {
			Class cls = Class.forName("java.ang.String");
			Method[] methods = cls.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class obj = ObjectEx.class;
		Constructor[] cons = obj.getDeclaredConstructors();
		for(Constructor construct : cons) {
			System.out.println(construct.getName());
		}
	}

}
