package cc.atu123.learn.jvm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/4/7
 * Time: 11:28
 */
public class GCTest {
    public static void main(String[] args) {
        {byte [] placeholder = new byte[16*1024*1024];}
        int a = 0;
        System.gc();

        // "with xforward" or "without xforward"
        String PRELOG_REGEX = "^(?<cookieSuv>.*?)\\s\\[(?<timeLocal>.*?)\\]\\s(?:\\[(?<xForwardedFor>.*?)\\]\\s)?(?<remoteAddr>.*?)\\s\"(?<pvgifRequest>.*?)\"\\s\"(?<request>.*?)\"\\s(?<host>.*?)\\s(?<cookieIploc>.*?)\\s(?<httpXppinfUserid>.*?)\\s(?<cookieYyid>.*?)\\s\"(?<httpUserAgent>.*?)\"\\s(?<httpXUserid>.*?)\\s(?<httpXSuv>.*?)\\s(?<cookieFyid>.*?)$";
        Pattern prelogRegex = Pattern.compile(PRELOG_REGEX);
        Matcher matcher =  prelogRegex.matcher("1708091010067991 [10/Aug/2017:10:38:15 +0800] 220.180.29.39 \"GET /pv.gif?t?=1502332702162844_1920_1080?r?=http://www.sohu.com/ HTTP/1.1\" \"http://pic.news.sohu.com/group-797839.shtml\" pv.sohu.com CN3415 - - \"Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36\" - - -\n");
        if (matcher.find()) {
            System.out.println(matcher.group("cookieSuv"));
            System.out.println(matcher.group("xForwardedFor"));
            System.out.println(matcher.group("remoteAddr"));
        }
    }
}
