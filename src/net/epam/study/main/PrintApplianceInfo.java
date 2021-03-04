package net.epam.study.main;

import net.epam.study.entity.Appliance;

public class PrintApplianceInfo {
	public static void printName(String string){
		System.out.println("This are " + string + "'s:");
	}
	public static void print(Appliance appliance) {
		System.out.println(appliance);
	}
}
