package util;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    
    public static String getDate(){
        String web = "http://time.windows.com";
        URL url;
        try {
            url = new URL(web);
            URLConnection conn = url.openConnection();
            conn.connect();
            long dateL = conn.getDate();
            Date date = new Date(dateL);
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

            return dateFormat.format(date);
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
            return null;
        }
    }
}
