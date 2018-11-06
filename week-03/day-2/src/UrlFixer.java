public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        //Method 1
        String url1 = url.replace("https//", "https://");
        url1 = url1.replace("bots","odds");
        System.out.println(url1);

        //Method2
        String[] url2 = url.split("/");
        url2[0] += ":";
        url2[url2.length-1] = "nevertellmetheodds";
        String url2final = "";
        for (int i = 0; i < url2.length; i++) {
            if (i < url2.length-1) {
                url2final += url2[i] + "/";
            } else  {
                url2final += url2[i];
            }
        }
        System.out.println(url2final);
    }
}
