package com.ishanupamanyu.model.user;

public class Category {
  private String name;
  private CategoryType categoryType;

  Category(String name, CategoryType categoryType) {
    this.name = name;
    this.categoryType = categoryType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryType getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(CategoryType categoryType) {
    this.categoryType = categoryType;
  }
}
