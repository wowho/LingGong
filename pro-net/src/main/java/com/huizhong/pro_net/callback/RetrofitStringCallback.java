package com.huizhong.pro_net.callback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitStringCallback implements Callback<String> {

    private ResponseCallback<String> callback;

    public RetrofitStringCallback(ResponseCallback<String> callback) {
        this.callback = callback;
    }

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        if(response.isSuccessful()) {
            callback.onSuccess(response.body());
        } else {
            Throwable throwable = new Throwable(response.errorBody().toString());
            callback.onFailure(throwable);
        }
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        if(callback != null) {
            callback.onFailure(t);
        }
    }
}
