package net.epam.study.service.validation;

import net.epam.study.entity.criteria.Criteria;
import net.epam.study.entity.criteria.SearchCriteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		return criteria != null;
	}
}
