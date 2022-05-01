package com.example.mma.domain.Menu;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuRepository {

    @Select("select * from menus")
    List<MenuEntity> findAll();
}
