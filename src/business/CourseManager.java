package business;

import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void add(Course course) throws Exception {

        /*
         * course name can not be same
         * */
        if (course.getName().equals("java")) {
            throw new Exception("Bu kurs daha onceden eklendi!");
        }

        if (course.getPrice() <= 0) {
            throw new Exception("Kurs fiyati 0 (sifir)'dan kucuk olamaz!");
        }

        /*
         * course added
         * */
        courseDao.add(course);
    }
}
