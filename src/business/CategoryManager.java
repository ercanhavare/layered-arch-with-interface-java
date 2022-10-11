package business;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {

        if (category.getName().equals("yazilim")) {
            throw new Exception("Bu kategori daha onceden eklendi!");
        }

        /*
         * category added
         * */
        categoryDao.add(category);

        /*
         * category logged
         * */
        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
