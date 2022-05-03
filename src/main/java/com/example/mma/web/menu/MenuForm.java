package com.example.mma.web.menu;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class MenuForm {

    @NotBlank
    @Size(max=256)
    private String menuName;

    @NotBlank
    @Size(max=256)
    private String description;

}
