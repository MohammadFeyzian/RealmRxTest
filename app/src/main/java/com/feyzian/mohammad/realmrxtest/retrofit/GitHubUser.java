package com.feyzian.mohammad.realmrxtest.retrofit;

/**
 * Created by Mohammad on 12/18/2016.
 */

/**
 * Model class for GitHub users: https://developer.github.com/v3/users/#get-a-single-user
 */
@SuppressWarnings("unused")
class GitHubUser {
    public String name;
    public int public_repos;
    public int public_gists;
}
