package com.yutian.mapper;

import com.yutian.entity.Hotel;

import java.util.List;
import java.util.Map;


public interface HotelMapper {

	//@Select("SELECT * FROM HOTEL WHERE ID = #{id}") 
	//使用select JAVA注解来代替XML文件
	Hotel getHotelMessageById(int id);

	/**
	 *
	 * @param paramMap
	 * @return
	 */
	List<Hotel> getLkRzData(Map paramMap);


	/**
	 *
	 * @param paramMap
	 * @return
	 */
	List<Hotel> getPartnerList(Map paramMap);
	
}
