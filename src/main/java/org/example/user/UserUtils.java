package org.example.user;

import com.google.gson.Gson;

public class UserUtils {
    public static User getDefaultUser() {
        return new User("Daniil", "Deinekin");
    }

    public static String getJsonUser() {
        Gson gson = new Gson();
        return gson.toJson(UserUtils.getDefaultUser());
    }
}
