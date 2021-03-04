package net.epam.study.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Map<String, Object> getCriteria() {
		return criteria;
	}

//	public void setCriteria(Map<String, Object> criteria) {
//		this.criteria = criteria;
//	}

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	// you may add your own code here

}
