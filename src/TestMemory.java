

import java.util.ArrayList;

import org.github.jamm.MemoryMeter;


public class TestMemory {
	
	public static void main(String[] args) {
		
		String str = "Namal Fernando";
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add(str);
		strList.add(str+"1");
		strList.add(str+"2");
		strList.add(str+"3");
		strList.add(str+"4");
		
		
		MemoryMeter memoryMeter = new MemoryMeter().enableDebug();
		System.out.println("main().General Measure : " + memoryMeter.measure(strList));
		System.out.println("main().Deep Measure : " + memoryMeter.measureDeep(strList));
		System.out.println("main().Count Child : " + memoryMeter.countChildren(strList));
		
	}
	
}
