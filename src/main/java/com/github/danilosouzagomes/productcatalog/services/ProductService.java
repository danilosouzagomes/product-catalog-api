package com.github.danilosouzagomes.productcatalog.services;

import com.github.danilosouzagomes.productcatalog.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAll();

    ProductDTO getOne(Long id);

    ProductDTO save(ProductDTO productDTO);

    ProductDTO update(Long id, ProductDTO productDTO);

    void delete(Long id);
}
