package ru.geekbrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import ru.geekbrains.controller.dto.BrandDto;
import ru.geekbrains.persist.BrandRepository;
import ru.geekbrains.persist.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandDto> findAll() {
        return null;
    }

    @Override
    public Page<BrandDto> findAll(Integer page, Integer size, String sortField) {
        return null;
    }

    @Override
    public Optional<BrandDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(BrandDto brandDto) {

    }

    @Override
    public void deleteById(Long id) {

    }
}


