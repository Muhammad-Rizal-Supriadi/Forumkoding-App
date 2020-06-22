package com.forumkoding.myforumapp.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAMvFJN6M:APA91bG-2W_RCl7bWwYQ8FuHwZ0cmGQxMcFIhhm5UiEwxPII2B647k28ksiYMJTlIrucal1XH_6_4VDdkn0Qsm_KcBXo_0GVkJy-8ut02e_ThZ3KGWvryMHUEBNGc0zPLFH9E2LuMK1P"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
