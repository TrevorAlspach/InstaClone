package com.example.instaclone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATEDAT = "createdAt";
    public static final String KEY_PROFILEIMAGE = "profileImage";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

    public ParseFile getProfileImage(){
        return getParseFile(KEY_PROFILEIMAGE);
    }

    public void setProfileImage(ParseFile parseFile){
        put(KEY_PROFILEIMAGE, parseFile);
    }

    public ParseFile getCreated(){
        return getParseFile(KEY_CREATEDAT);
    }

    public void setCreated(ParseFile parseFile){
        put(KEY_CREATEDAT, parseFile);
    }
}
