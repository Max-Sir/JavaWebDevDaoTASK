package net.epam.study.service;

import net.epam.study.entity.Appliance;
import net.epam.study.entity.criteria.Criteria;

import java.io.IOException;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria) throws IOException;

	
}
