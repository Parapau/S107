package N2E1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.ElementType;

public class Main {

	public static void main (String args[]) throws IllegalArgumentException, IllegalAccessException, IOException {

		Coso trasto = new Coso("Pere", "patena", 3000);
		Map<String, String> jsonMap = new HashMap<>();
		System.out.println(trasto.getNom() + trasto.getCognom());

		trasto.mite();

		System.out.println(trasto.getNom() + trasto.getCognom());

		if (trasto.getClass().isAnnotationPresent(JSONSerialitzable.class)) {
			for (Method metode : trasto.getClass().getDeclaredMethods()) {
				if (metode.isAnnotationPresent(init.class)) {
					for (Field field : trasto.getClass().getDeclaredFields()) {
						field.setAccessible(true);
						if (field.isAnnotationPresent(JSONElement.class)) {
							jsonMap.put(getKey(field), field.get(trasto.getClass()));
						}
					}
				}
			}
		}
		
		FileWriter escriptor = new FileWriter("C:\\Users\\formacio\\Desktop\\jason.txt");
		
		System.out.println(jsonMap);
	}
	
	
	public static String toJsonString(Map<String, String> map) {
		
		String element = map.entrySet().stream().map(entry -> "\""  + entry.getKey() + "\":\"" + entry.getValue() + "\"").collect(Collectors.joining(","));
		
		return "{" + element + "}";
	}
	
	
	public static String getKey(Field field) {
		String anotacio = field.getAnnotation(JSONElement.class).key();
		
		if (anotacio.isEmpty()) {
			anotacio = field.getName();
		}
		
		return anotacio;
	}
}
