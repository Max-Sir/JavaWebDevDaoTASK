package net.epam.study.dao.impl;

import net.epam.study.dao.ApplianceDAO;
import net.epam.study.entity.Appliance;
import net.epam.study.entity.criteria.Criteria;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {
	private static List<String> textFromFile = new ArrayList<>();
	private static Object[] keysArray;
	private static Object[] valuesArray;
	public static void fileReader() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("./resources/appliances_db.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		String stringLine;
		while ((stringLine = bufferedReader.readLine()) != null){
			textFromFile.add(stringLine);
		}
	}
	//todo parse by param
	public static List<String> fileParser(String stringLine) {
		List<String> parsedList = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\w+=\\d+");
		Matcher matcher = pattern.matcher(stringLine);
		while (matcher.find()) {
			parsedList.add(matcher.group());
		}
		return parsedList;
	}
	public static void getKeysFromMap(Criteria criteria){
		Set<String> keys = criteria.getCriteria().keySet();
		keysArray = keys.toArray();
	}
	public static void getValuesFromMap(Criteria criteria){
		Collection<Object> values = criteria.getCriteria().values();
		valuesArray = values.toArray();
	}
	@Override
	public Appliance find(Criteria criteria) {
		List<String> parsedList = new ArrayList<>();
		for (int listElement = 0; listElement<textFromFile.size(); listElement++) {
			int counter = 0;
			for (int mapCriteria = 0; mapCriteria < keysArray.length; mapCriteria++) {
				Pattern pattern = Pattern.compile(criteria.getGroupSearchName() + ".*"
						+ keysArray[mapCriteria] + "=" + valuesArray[mapCriteria] + "[,;]");
				Matcher matcher = pattern.matcher(textFromFile.get(listElement));
				if (matcher.find()) {
					counter++;
					if (counter == keysArray.length) {
						parsedList.add(textFromFile.get(listElement));
					}
				}
			}
		}
		textFromFile.clear();
		return new Appliance(parsedList);
	}
}
