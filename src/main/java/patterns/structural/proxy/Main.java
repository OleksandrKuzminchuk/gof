package patterns.structural.proxy;

import patterns.structural.proxy.internet.Internet;
import patterns.structural.proxy.internet.ProxyInternet;
import patterns.structural.proxy.video.ProxyVideoDownloader;
import patterns.structural.proxy.video.VideoDownloader;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("====================================================");

        VideoDownloader downloader = new ProxyVideoDownloader();
        System.out.println(downloader.getVideo("pattern proxy"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern proxy"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern proxy"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern proxy"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern proxy"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern flyweight"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern flyweight"));
        System.out.println("============================================");
        System.out.println(downloader.getVideo("pattern proxy"));
    }
}
