package com.example.mma.domain.Menu;

import java.util.List;

public class MenuService {

    public List<MenuEntity> findAll(){
        return List.of(
                new MenuEntity(1, "メニュー1", "説明1"),
                new MenuEntity(2, "メニュー2", "説明2"),
                new MenuEntity(3, "メニュー3", "説明3")
        );
    }
}
