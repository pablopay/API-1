package com.services.ms.product.product_service.mapper;

import com.services.ms.product.product_service.model.dto.CategoryResponse;
import com.services.ms.product.product_service.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "name", source = "name")
    CategoryResponse toCategoryResponse(Category category);

}

