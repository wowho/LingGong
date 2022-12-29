package com.huizhong.pro_net.callback;

public class DownLoadCallback implements DownLoadListener{

    private String folder;
    private String path;
    private String tag;

    public DownLoadCallback(String folder, String path) {
        this.folder = folder;
        this.path = path;
    }

    public DownLoadCallback(String folder, String path, String tag) {
        this.folder = folder;
        this.path = path;
        this.tag = tag;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onProgress(int progress, float currentSize, float totalSize) {

    }

    @Override
    public void onFinish(String path) {

    }

    @Override
    public void onFailure(String msg) {

    }

    @Override
    public void onCancel(String tag) {

    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
