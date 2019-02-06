package hong.dev.shares.Network;

/**
 * Created by Seogki on 2019-02-03.
 */
public class ApiClient {


}
//open class ApiCilentRx {
//
//        //회사용
//        companion object {
//
//        fun create(): ApiInterface {
//
//        val interceptor = HttpLoggingInterceptor()
//
//        if (BuildConfig.DEBUG) {
//        //debug
//        interceptor.level = HttpLoggingInterceptor.Level.BODY
//
//        } else {
//        //release
//        interceptor.level = HttpLoggingInterceptor.Level.NONE
//
//        }
//        val client = OkHttpClient
//        .Builder()
//        .addInterceptor(interceptor)
//        .connectTimeout(10, TimeUnit.SECONDS)
//        .readTimeout(10, TimeUnit.SECONDS)
//        .writeTimeout(10, TimeUnit.SECONDS)
//        .build()
//
//        val retrofit = Retrofit
//        .Builder()
//        .baseUrl(Const.server_url)
//        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
//        .build()
//
//
//        return retrofit.create(ApiInterface::class.java)
//        }
//        }
//
//        }