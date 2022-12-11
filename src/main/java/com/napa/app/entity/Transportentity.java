package com.napa.app.entity;

import lombok.Data;
@Data
public class Transportentity {
	
//	table = worker 従業員情報
	private int id;
	private String first_name;
	private String last_name;
//	table = fee 交通費
	private int fee;
	private boolean round_trip;
	private int total_fee;
	
	

}
