package com.example.parstagram;

import android.app.Application;

import com.example.parstagram.models.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("D89ExsBEbZs9FUSd0DkmmGWsrqXTeUIbpilABTn4")
                .clientKey("wSweqzm6mvqEYNdmw25VE1eHioMKR57WLuK94Fk1")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

