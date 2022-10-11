package dataAccess;

public interface InstructorDao {
    void add(entities.Instructor instructor);

    void fetch(entities.Instructor instructor);

    void update(entities.Instructor instructor);

    void delete(entities.Instructor instructor);
}
