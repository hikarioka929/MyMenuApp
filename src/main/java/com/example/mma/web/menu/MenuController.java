package com.example.mma.web.menu;

import com.example.mma.domain.Menu.MenuEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {

    // GET / menus
    @GetMapping("/menus")
    public String showList(Model model) {
        var menuList = List.of(
               new MenuEntity(1, "メニュー1", "説明1"),
               new MenuEntity(2, "メニュー2", "説明2"),
               new MenuEntity(3, "メニュー3", "説明3")
        );
        model.addAttribute("menuList", menuList);
        return "menus/list";
    }
}
