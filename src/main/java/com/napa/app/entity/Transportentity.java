package com.napa.app.entity;

import lombok.Data;
@Data
public class Transportentity {
	
//	table = worker 従業員情報
	private Integer id;
	private String first_name;
	private String last_name;
//	table = fee 交通費
	private Integer fee;
	private boolean round_trip;
	private Integer total_fee;
	private String root;
	private String use_date;
	
	

}
