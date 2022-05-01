package com.example.mma.web.menu;

import com.example.mma.domain.Menu.MenuEntity;
import com.example.mma.domain.Menu.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menus")
    public String showList(Model model) {
        model.addAttribute("menuList", menuService.findAll());
        return "menus/list";
    }
}
