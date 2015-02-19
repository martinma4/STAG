package test.justtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class Test {
	public static void main(String args[]) {
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher("There are more than -2 and less than 9080812 numbers here");
	while (m.find()) {
		System.out.println(m.group());
	}
		
//		String str = "$23/mo";
//		str = StringUtils.substringBetween(str, "$", "/mo");	
//		System.out.print(str);
	}
}