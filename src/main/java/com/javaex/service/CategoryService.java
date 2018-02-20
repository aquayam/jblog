package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.CategoryDao;
import com.javaex.vo.CategoryVo;

@Service
public class CategoryService {
	@Autowired
	CategoryDao categoryDao;

	public List<CategoryVo> getList(int userNo) {
		return categoryDao.getList(userNo);
	}

	public  CategoryVo insertApi(CategoryVo cateVo) {
		return categoryDao.insertApi(cateVo);
	}

	public boolean delete(int cateNo) {
		
		int count = categoryDao.deleteApi(cateNo);
		boolean result = false;
		if(count == 1) {
			result = true;
		}
		return result;
	}
	
	
}
