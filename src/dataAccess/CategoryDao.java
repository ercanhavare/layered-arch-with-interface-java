package dataAccess;

public interface CategoryDao {
    void add(entities.Category category);

    void fetch(entities.Category category);

    void update(entities.Category category);

    void delete(entities.Category category);
}
