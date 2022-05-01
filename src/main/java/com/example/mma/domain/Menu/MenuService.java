package com.example.mma.domain.Menu;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuEntity> findAll(){
        return menuRepository.findAll();
    }
}
