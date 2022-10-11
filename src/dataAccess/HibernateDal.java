package dataAccess;

public class HibernateDal implements InstructorDao, CategoryDao, CourseDao {
    @Override
    public void add(entities.Category category) {
        System.out.println("hibernate, category added : " + category.getName());
    }

    @Override
    public void fetch(entities.Category category) {
        System.out.println("hibernate, category fetched");
    }

    @Override
    public void update(entities.Category category) {
        System.out.println("hibernate, category updated : " + category.getName());
    }

    @Override
    public void delete(entities.Category category) {
        System.out.println("hibernate, category deleted : " + category.getName());
    }

    @Override
    public void add(entities.Course course) {
        System.out.println("hibernate, course added : " + course.getName());
    }

    @Override
    public void fetch(entities.Course course) {
        System.out.println("hibernate, course fetched");
    }

    @Override
    public void update(entities.Course course) {
        System.out.println("hibernate, course updated : " + course.getName());
    }

    @Override
    public void delete(entities.Course course) {
        System.out.println("hibernate, course deleted : " + course.getName());
    }

    @Override
    public void add(entities.Instructor instructor) {
        System.out.println("hibernate, instructor added : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void fetch(entities.Instructor instructor) {
        System.out.println("hibernate, instructor fetched");
    }

    @Override
    public void update(entities.Instructor instructor) {
        System.out.println("hibernate, instructor updated : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(entities.Instructor instructor) {
        System.out.println("hibernate, instructor deleted : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
