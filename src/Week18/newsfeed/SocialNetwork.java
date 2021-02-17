package Week18.newsfeed;

public class SocialNetwork {

    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();

        MessagePost m1 = new MessagePost("Steve", "hello, World");
        ImagePost i1 = new ImagePost("Paula", "image.jpg");
        VideoPost v1 = new VideoPost("Ilias", "hud.ac.uk/video.mp4");
        nf.addPost(m1);
        nf.addPost(i1);
        nf.addPost(v1);

        System.out.println(nf.printNewsFeed());
    }
}
