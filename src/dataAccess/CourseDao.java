package dataAccess;

public interface CourseDao {
    void add(entities.Course course);

    void fetch(entities.Course course);

    void update(entities.Course course);

    void delete(entities.Course course);
}
