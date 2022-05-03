package com.example.mma.domain.Menu;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuEntity> findAll(){
        return menuRepository.findAll();
    }

    @Transactional
    public void create(String menuName, String description) {
        menuRepository.insert(menuName, description);
    }
}
