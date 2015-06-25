package com.alangeorge.android.scalaapp;

import com.alangeorge.android.scalaapp.model.PremiumUser;
import com.alangeorge.android.scalaapp.model.User;

public class UserUser {
    User user = new PremiumUser("Alan", 54);


    public static class MyUser implements User {

        @Override
        public String name() {
            return null;
        }

        @Override
        public int score() {
            return 0;
        }
    }
}
