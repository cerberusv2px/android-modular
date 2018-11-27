package com.sujin.common.di.module

import com.apollographql.apollo.ApolloClient
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.sujin.common.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ApiModule {

    @Provides
    @PerApplication
    fun provideGson(): Gson = GsonBuilder().setLenient().create()

    @Provides
    @PerApplication
    fun provideHttpLogginInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return logging
    }

    @Provides
    @PerApplication
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .apply {
                addInterceptor(httpLoggingInterceptor)
            }
            .build()
    }

    @Provides
    @PerApplication
    fun provideApiService(
        okHttpClient: OkHttpClient,
        gson: Gson,
        rxJava2CallAdapterFactory: RxJava2CallAdapterFactory
    ): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .client(okHttpClient)
            .addCallAdapterFactory(rxJava2CallAdapterFactory)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        //return retrofit.create(ApiService::class.java)
    }

    @Provides
    @PerApplication
    fun providesRxJavaCallAdapterFactory(): RxJava2CallAdapterFactory {
        return RxJava2CallAdapterFactory.create()
    }

    @Provides
    @PerApplication
    fun provideApolloClient(okHttpClient: OkHttpClient): ApolloClient {
        return ApolloClient.builder()
            .serverUrl("http://10.168.2.104:4000/graphql")
            .okHttpClient(okHttpClient)
            .build()
    }
}