package com.feyzian.mohammad.realmrxtest.retrofit;

/**
 * Created by Mohammad on 12/18/2016.
 */

public class UserViewModel {

    private final String username;
    private final int publicRepos;
    private final int publicGists;

    public UserViewModel(String username, int publicRepos, int publicGists) {
        this.username = username;
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
    }

    public String getUsername() {
        return username;
    }

    public int getPublicRepos() {
        return publicRepos;
    }

    public int getPublicGists() {
        return publicGists;
    }
}
