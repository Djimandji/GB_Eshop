package ru.geekbrains.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.controller.dto.BrandDto;
import ru.geekbrains.persist.BrandRepository;
import ru.geekbrains.persist.model.Brand;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BrandServiceTest {

    private BrandService brandService;
    private BrandRepository brandRepository;


    @BeforeEach
    public void init() {
        brandRepository = mock(BrandRepository.class);
        brandService = new BrandServiceImpl(brandRepository);

    }

    @Test
    public void testFindById() {
        Brand expectedBrand = new Brand();
        expectedBrand.setId(1L);
        expectedBrand.setName("Brand");

        when(brandRepository.findById(eq(expectedBrand.getId())))
                .thenReturn(Optional.of(expectedBrand));
        Optional<BrandDto> opt = brandService.findById(expectedBrand.getId());

        assertTrue(opt.isPresent());
        assertEquals(expectedBrand.getId(), opt.get().getId());
        assertEquals(expectedBrand.getName(), opt.get().getName());
    }

}
