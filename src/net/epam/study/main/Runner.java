package net.epam.study.main;

import net.epam.study.entity.Appliance;
import net.epam.study.entity.criteria.Criteria;
import net.epam.study.service.ApplianceService;
import net.epam.study.service.ServiceFactory;
import net.epam.study.entity.criteria.SearchCriteria;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);
		criteriaOven.add(SearchCriteria.Oven.WEIGHT.toString(), 10);
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 50);
		criteriaOven.add(SearchCriteria.Oven.WIDTH.toString(), 60);

		appliance = service.find(criteriaOven);
		PrintApplianceInfo.printName(SearchCriteria.Oven.class.getSimpleName());
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)
		PrintApplianceInfo.printName(SearchCriteria.TabletPC.class.getSimpleName());
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaRefrigerator = new Criteria(SearchCriteria.Refrigerator.class.getSimpleName());
		criteriaRefrigerator.add(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), 100);
		criteriaRefrigerator.add(SearchCriteria.Refrigerator.WEIGHT.toString(), 20);
		criteriaRefrigerator.add(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), 10);

		appliance = service.find(criteriaRefrigerator);// find(Object...obj)
		PrintApplianceInfo.printName(SearchCriteria.Refrigerator.class.getSimpleName());
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaVacuumCleaner = new Criteria(SearchCriteria.VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), 90);
		criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), "C");
		criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), "XX00");
		criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), "all-in-one");

		appliance = service.find(criteriaVacuumCleaner);// find(Object...obj)
		PrintApplianceInfo.printName(SearchCriteria.VacuumCleaner.class.getSimpleName());
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria(SearchCriteria.Laptop.class.getSimpleName());
		criteriaLaptop.add(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), 1);
		criteriaLaptop.add(SearchCriteria.Laptop.CPU.toString(), 1.2);
		criteriaLaptop.add(SearchCriteria.Laptop.OS.toString(), "Windows");

		appliance = service.find(criteriaLaptop);// find(Object...obj)
		PrintApplianceInfo.printName(SearchCriteria.Laptop.class.getSimpleName());
		PrintApplianceInfo.print(appliance);


		Criteria criteriaSpeakers = new Criteria(SearchCriteria.Speakers.class.getSimpleName());
		criteriaSpeakers.add(SearchCriteria.Speakers.CORD_LENGTH.toString(), 2);
		criteriaSpeakers.add(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), "2-4");
		criteriaSpeakers.add(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), 2);
		criteriaSpeakers.add(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), 15);

		appliance = service.find(criteriaSpeakers);// find(Object...obj)
		PrintApplianceInfo.printName(SearchCriteria.Speakers.class.getSimpleName());
		PrintApplianceInfo.print(appliance);
	}






}
