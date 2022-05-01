package com.example.mma.domain.Menu;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MenuEntity {
    private long menuId;
    private String menuName;
    private String description;
}
