package com.napa.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.napa.app.entity.Transportentity;
import com.napa.app.mapper.TMmapper;

@Service
public class feeservice {
	
	@Autowired
	TMmapper tmmapper;
	
	public Transportentity selectfeeinfo(Integer id) {
		Transportentity transportentity = new Transportentity();
		transportentity.setId(id);
		return this.tmmapper.selectfeeinfo(transportentity);
	}

	

}
