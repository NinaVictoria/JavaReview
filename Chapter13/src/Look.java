import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author : Nina
 * @time : 2020/7/7 15:29
 * @description :
 */
public class Look implements Runnable{
    URL url;

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            InputStream in=url.openStream();
            byte [] b=new byte[1024];
            int n=-1;
            while ((n=in.read(b))!=-1){
                String str=new String(b,0,n);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
