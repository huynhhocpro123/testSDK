package com.example.soundcastlibrary.view;

import vn.mobiapps.soundcast.model.modeldata.DataVastModel;

/**
 * Created by NguyenTanHuynh on 7/30/2018.
 */

public interface ISourdCastViewListener {
    void showProgress();
    void hideProgress();

    void onSuccessSendGetURL(String object);
    void onErrorSendGetURL(String object);

    void onSuccessGetVastXML(DataVastModel object);
    void onErrorGetVastXML(String object);
}
