package net.epam.study.dao;

import net.epam.study.entity.Appliance;
import net.epam.study.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
	Appliance find(Criteria criteria) throws IOException;
}
