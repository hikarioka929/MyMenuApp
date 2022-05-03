package com.example.mma.web.menu;

import com.example.mma.domain.Menu.MenuEntity;
import com.example.mma.domain.Menu.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("menuList", menuService.findAll());
        return "menus/list";
    }

    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute MenuForm form) {
        return "menus/creationForm";
    }

    @PostMapping
    public String create(@Validated MenuForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return showCreationForm(form);
        }
        menuService.create(form.getMenuName(), form.getDescription());
        return "redirect:/menus";
    }
}
