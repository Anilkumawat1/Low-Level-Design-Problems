package Behavioral.Observer;

public class ObserverPatternDemo {
    public static void main(String[]args){
        YouTubeChannel youTubeChannel = new YouTubeChannel("aniltech");
        Subscriber subscriber1 = new Subscriber("anil");
        Subscriber subscriber2 = new Subscriber("kishan");
        youTubeChannel.addObserver(subscriber1);
        youTubeChannel.addObserver(subscriber2);
        youTubeChannel.uploadVideo("java full stack");
        youTubeChannel.removeObserver(subscriber2);
        youTubeChannel.uploadVideo("python full stack course");
    }
}
