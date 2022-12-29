package com.huizhong.pro_net.callback;

public interface ResponseCallback<T> {

    void onSuccess(T t);
    void onFailure(Throwable t);
}
