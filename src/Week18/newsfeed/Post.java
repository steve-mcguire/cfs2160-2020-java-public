package Week18.newsfeed;

import java.util.ArrayList;

abstract class Post {
    private String author;
    private ArrayList<String> comments = new ArrayList<>();
    private Integer likes;

    public Post(String author) {
        this.author = author;
        this.likes = 0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String display(){
        return this.author + " " + this.likes;
    }
}
