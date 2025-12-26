// src/main/java/com/example/demo/dto/ResourceRequestInputDto.java
package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class ResourceRequestInputDto {

    @NotNull
    private Long userId;

    @NotNull
    private Long resourceId;

    @NotNull
    @Min(1)
    private Integer quantity;

    public ResourceRequestInputDto() {
    }

    public ResourceRequestInputDto(Long userId, Long resourceId, Integer quantity) {
        this.userId = userId;
        this.resourceId = resourceId;
        this.quantity = quantity;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
