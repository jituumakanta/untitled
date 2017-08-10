import okhttp3.*;

import java.io.IOException;

/**
 * Created by Wrap me 09 on 10-08-2017.
 */
public class OkHttpPostTest {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = new FormBody.Builder()
                .add("parameter1", "gg")
                .add("parameter2", "gg")
                .build();
        Request request = new Request.Builder()
                .url("http://quliver.com/test/set_post_data.php")
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);
    }
}
