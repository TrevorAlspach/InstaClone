package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("m8UsSD4PJz7THoppe5VPlKmyFmIQOJU3n9CNs7e5")
                .clientKey("LMAuc4gf3WP5jLWTxAqYQtnxZHtja2dHkn3VKIZn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
