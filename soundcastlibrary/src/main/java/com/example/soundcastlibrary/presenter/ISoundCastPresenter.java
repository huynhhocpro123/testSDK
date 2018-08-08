package com.example.soundcastlibrary.presenter;

/**
 * Created by NguyenTanHuynh on 7/30/2018.
 */

public interface ISoundCastPresenter {
    void sendGetURL(String url);
    void sendGetVastXML(String url);
    void onDestroy();
}
