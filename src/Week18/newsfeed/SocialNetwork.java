package Week18.newsfeed;

public class SocialNetwork {

    public static void main(String[] args) {
        NewsFeed nf = new NewsFeed();

        MessagePost m1 = new MessagePost("Steve", "Hello, world. I love Java");
        ImagePost i1 = new ImagePost("Paula", "image.jpg");
        EventPost e1 = new EventPost("Steve", "25/04/2021", "uni",
                "Steve's party", 0);
        VideoPost v1 = new VideoPost("Steve", "https://www.youtube.com/watch?v=7LxWQIDOzyE");
        AudioPost a1 = new AudioPost("Steve", "postcast.mp3");
        nf.addPost(m1);
        nf.addPost(i1);
        nf.addPost(e1);
        nf.addPost(v1);
        nf.addPost(a1);
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

        e1.like();
        e1.like();
        e1.like();
        e1.like();
        e1.like();
        e1.addComment("Can't wait for the party");

        v1.like();
        v1.like();
        v1.like();
        v1.like();
        v1.like();
        v1.addComment("Nice video");

        a1.like();
        a1.like();
        a1.like();
        a1.like();
        a1.like();
        a1.like();
        a1.like();
        a1.like();
        a1.addComment("Great podcast");

        System.out.println(nf.printNewsFeed());
    }
}
