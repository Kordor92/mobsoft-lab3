package com.example.mobsoft.mobsoftlab3.network;

/**
 * Created by Jozso on 2017. 05. 04..
 */

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.example.mobsoft.mobsoftlab3.utils.GsonHelper;
import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import com.example.mobsoft.mobsoftlab3.io.swagger.client.*;
import com.example.mobsoft.mobsoftlab3.io.swagger.client.api.DefaultApi;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    public OkHttpClient.Builder provideOkHttpClientBuilder() {
        return new OkHttpClient().newBuilder();
    }


    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
        return builder.build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().baseUrl(NetworkConfig.SERVICE_ENDPOINT).client(client)
                .addConverterFactory(GsonConverterFactory.create(GsonHelper.getGson())).build();
    }

    @Provides
    @Singleton
    public DefaultApi provideATodoApi(Retrofit retrofit) {
        return retrofit.create(DefaultApi.class);
    }
}

