package dataAccess;

public class JdbcDal implements InstructorDao, CategoryDao, CourseDao {
    @Override
    public void add(entities.Category category) {
        System.out.println("jdbc, category added : " + category.getName());
    }

    @Override
    public void fetch(entities.Category category) {
        System.out.println("jdbc, category fetched");
    }

    @Override
    public void update(entities.Category category) {
        System.out.println("jdbc, category updated : " + category.getName());
    }

    @Override
    public void delete(entities.Category category) {
        System.out.println("jdbc, category deleted : " + category.getName());
    }

    @Override
    public void add(entities.Course course) {
        System.out.println("jdbc, course added : " + course.getName());
    }

    @Override
    public void fetch(entities.Course course) {
        System.out.println("jdbc, course fetched");
    }

    @Override
    public void update(entities.Course course) {
        System.out.println("jdbc, course updated : " + course.getName());
    }

    @Override
    public void delete(entities.Course course) {
        System.out.println("jdbc, course deleted : " + course.getName());
    }

    @Override
    public void add(entities.Instructor instructor) {
        System.out.println("jdbc, instructor added : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void fetch(entities.Instructor instructor) {
        System.out.println("jdbc, instructor fetched");
    }

    @Override
    public void update(entities.Instructor instructor) {
        System.out.println("jdbc, instructor updated : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(entities.Instructor instructor) {
        System.out.println("jdbc, instructor deleted : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
