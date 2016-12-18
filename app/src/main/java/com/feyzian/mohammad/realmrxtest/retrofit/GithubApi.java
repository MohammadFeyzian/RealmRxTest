package com.feyzian.mohammad.realmrxtest.retrofit;

/**
 * Created by Mohammad on 12/18/2016.
 */

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * GitHub API definition
 */
interface GithubApi {
    /**
     * See https://developer.github.com/v3/users/
     */
    @GET("/users/{user}")
    Observable<GitHubUser> user(@Path("user") String user);
}
