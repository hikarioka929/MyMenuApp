package com.example.mma.domain.Menu;

public class MenuEntity {
    private long menuId;
    private String menuName;
    private String description;

    public MenuEntity(long menuId, String menuName, String description) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.description = description;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
