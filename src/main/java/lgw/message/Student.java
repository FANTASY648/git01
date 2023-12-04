package lgw.message;

public class Student {
    private Integer id;
    private String title;
    private String completed;

    public String getTitle() {
        return title;
    }

    public String getCompleted() {
        return completed;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }

}
