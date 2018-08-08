package com.example.soundcastlibrary.interactor;

import vn.mobiapps.soundcast.model.modeldata.DataVastModel;

/**
 * Created by NguyenTanHuynh on 7/30/2018.
 */

public interface ISoundCastInteractorListener {
    void onSuccessSendGetURL(String object);
    void onErrorSendGetURL(String object);

    void onSuccessGetVastXML(DataVastModel object);
    void onErrorGetVastXML(String object);
}
