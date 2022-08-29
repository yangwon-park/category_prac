package org.cate.service;

import lombok.RequiredArgsConstructor;
import org.cate.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
}
