package Week18.newsfeed;

import Week18.newsfeed.exception.NewsFeedException;

import java.util.ArrayList;
import java.util.Date;

abstract class Post {
    private String author;
    private ArrayList<String> comments = new ArrayList<>();
    private Integer likes;
    private Date datePosted;

    public Post(String author) {
        this.author = author;
        this.likes = 0;
        this.datePosted = new Date();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getCommentsList() {
        return comments;
    }

    public String getCommentsString(){
        StringBuilder sb = new StringBuilder();
        if(this.comments.size() == 0){
            sb.append("No comments yet\n");
        }else{
            sb.append("Comments:\n");
            for(String comment : comments){
                sb.append(comment).append("\n");
            }
        }
        return sb.toString();
    }

    public String getPostMeta(){
        return  "Author: " + this.author + "\n" +
                "Posted: " + this.datePosted + "\n" +
                "Likes: " + this.likes + "\n";
    }

    public void addComment(String comment){
        this.comments.add(comment);
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void like(){
        this.likes += 1;
    }

    public abstract String display();
}
