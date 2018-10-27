package com.yutian.controller;


import com.yutian.entity.Hotel;
import com.yutian.mapper.HotelMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class HotelController {

    public static final Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

    //简单实用
    public static void testSqlSessionFactory(int id) throws IOException{
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        LOGGER.info("sqlSessionFactory :{}",sqlSessionFactory);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            HotelMapper hotelMapper = session.getMapper(HotelMapper.class);
            Hotel hotel = hotelMapper.getHotelMessageById(id);
            LOGGER.info("hotelMsg\n:"+hotel);
        } finally {
            session.close();
        }

    }


    public static void main(String[] args){
        try{
            testSqlSessionFactory(20);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
