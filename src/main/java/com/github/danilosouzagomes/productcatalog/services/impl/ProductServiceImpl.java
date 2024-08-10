package com.github.danilosouzagomes.productcatalog.services.impl;

import com.github.danilosouzagomes.productcatalog.dtos.ProductDTO;
import com.github.danilosouzagomes.productcatalog.entities.Product;
import com.github.danilosouzagomes.productcatalog.mapper.ProductMapper;
import com.github.danilosouzagomes.productcatalog.repositories.ProductRepository;
import com.github.danilosouzagomes.productcatalog.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public List<ProductDTO> getAll() {
        List<Product> allProducts = productRepository.findAll();

        return allProducts.stream().map(mapper::toProductDTO).toList();
    }

    @Override
    public ProductDTO getOne(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);

        return productOptional.map(mapper::toProductDTO).orElseThrow(RuntimeException::new);
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = mapper.toProduct(productDTO);

        return mapper.toProductDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO update(Long id, ProductDTO productDTO) {
        Product existingProduct = productRepository.findById(id).orElseThrow(RuntimeException::new);

        return mapper.toProductDTO(productRepository.save(existingProduct));
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
