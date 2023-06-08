package newTeacher.lesson3;

public class Documents {
    int id;
    String title;

    public Documents(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
