package Week18.newsfeed;

import java.util.ArrayList;

public class NewsFeed {
    private ArrayList<Post> posts = new ArrayList<>();

    public NewsFeed() {
    }

    public void addPost(Post post){
        this.posts.add(post);
    }

    public String printNewsFeed(){
        StringBuilder sb = new StringBuilder();
        for(Post p : posts){
            sb.append(p.display());
            sb.append("\n");
        }
        return sb.toString();
    }
}
