package com.huizhong.pro_net.callback;

public interface DownLoadListener {
    void onStart();
    void onProgress(int progress, float currentSize, float totalSize);
    void onFinish(String path);
    void onFailure(String msg);
    void onCancel(String tag);
}
