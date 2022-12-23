package com.napa.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.napa.app.entity.Transportentity;


@Mapper
public interface TMmapper {
	
//	メイン画面の社員情報を出力
	public List<Transportentity> selectAll();
	
	
//	各個人の結果を出力する
//	public List<Transportentity> selectResult();
	Transportentity selectfeeinfo(Transportentity transportentity);



	

}
