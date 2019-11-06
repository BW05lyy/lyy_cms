package com.liyuyao.service;

import java.util.List;

import com.liyuyao.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
