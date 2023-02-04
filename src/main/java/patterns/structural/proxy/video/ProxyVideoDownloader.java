package patterns.structural.proxy.video;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {
    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        Video result = videoCache.computeIfAbsent(videoName, downloader::getVideo);
        System.out.println("Retrieving video from cache...");
        System.out.println("--------------------------------");
        return result;
    }
}
