package com.niit.jacobwatchco.dao;

import java.util.List;

import com.niit.jacobwatchco.model.Category;

public interface CategoryDao {
	
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int CategoryId);
	public List<Category> getAllCategory();
	public Category getCategoryById(int categoryId);
	

}
