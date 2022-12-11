package com.napa.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.napa.app.entity.Transportentity;


@Mapper
public interface TMmapper {
	public List<Transportentity> selectAll();

}
