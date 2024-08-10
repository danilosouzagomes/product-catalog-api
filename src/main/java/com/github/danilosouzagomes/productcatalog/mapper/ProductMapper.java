package com.github.danilosouzagomes.productcatalog.mapper;

import com.github.danilosouzagomes.productcatalog.dtos.ProductDTO;
import com.github.danilosouzagomes.productcatalog.entities.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {


    ProductDTO toProductDTO(Product product);

    Product toProduct(ProductDTO productDTO);
}
