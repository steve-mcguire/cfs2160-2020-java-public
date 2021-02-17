package Week18.newsfeed;

public class SocialNetwork {

    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();

        MessagePost m1 = new MessagePost("Steve", "Hello, world. I love Java");
        ImagePost i1 = new ImagePost("Paula", "image.jpg");
        VideoPost v1 = new VideoPost("Ilias", "hud.ac.uk/video.mp4");
        nf.addPost(m1);
        nf.addPost(i1);
        nf.addPost(v1);
        v1.like();
        v1.like();
        v1.like();
        v1.like();
        v1.addComment("Nice post!");
        v1.addComment("Could be better");
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.like();
        i1.addComment("Great picture");
        i1.addComment("I love it there");

        System.out.println(nf.printNewsFeed());
    }
}
