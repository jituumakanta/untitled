import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Wrap me 09 on 10-08-2017.
 */
public class OkHttpGetTest {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://quliver.com/wrapme/get_homepage_products.php")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
