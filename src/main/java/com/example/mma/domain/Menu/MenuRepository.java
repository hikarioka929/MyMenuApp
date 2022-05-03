package com.example.mma.domain.Menu;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuRepository {

    @Select("select * from menus")
    List<MenuEntity> findAll();

    @Insert("insert into menus (menuName, description) values (#{menuName}, #{description})")
    void insert(String menuName, String description);
}
