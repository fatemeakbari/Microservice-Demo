package ir.threegam.entrypointservice.model;

public class Book {

    private int id;
    private int userId;
    private User creator;
    private String title;
    private String isbn10;

    public Book() {
    }

    public Book(int id, int userId, String title, String isbn10) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.isbn10 = isbn10;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }
}
