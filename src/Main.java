import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateDal;
import dataAccess.JdbcDal;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());


        Category category = new Category(1, "guvenlik");
        Course course = new Course(1, "c#", 100);
        Instructor instructor = new Instructor(1, "Ercan", "Havare");


        CategoryManager categoryManager = new CategoryManager(new HibernateDal(), loggers);
        categoryManager.add(category);

        CourseManager courseManager = new CourseManager(new JdbcDal());
        courseManager.add(course);

        InstructorManager instructorManager = new InstructorManager(new HibernateDal());
        instructorManager.add(instructor);
    }
}