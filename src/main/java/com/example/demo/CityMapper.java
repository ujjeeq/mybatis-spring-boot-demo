package com.example.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM city where state = #{state}")
    City findByState(String state);

    @Insert("INSERT INTO city (name,state,country) values(#{name},#{state},#{country})")
    @SelectKey(statement="call identity()", keyProperty="id",
            before=false, resultType=Long.class)
    void createCity(City city);


}
