package com.example.soundcastlibrary.presenter;

import vn.mobiapps.soundcast.interactor.ISoundCastInteractor;
import vn.mobiapps.soundcast.interactor.ISoundCastInteractorListener;
import vn.mobiapps.soundcast.interactor.SoundCastInteractorImpl;
import vn.mobiapps.soundcast.model.modeldata.DataVastModel;
import vn.mobiapps.soundcast.view.ISourdCastViewListener;

/**
 * Created by NguyenTanHuynh on 7/30/2018.
 */

public class SoundCastPresenterImpl implements ISoundCastPresenter, ISoundCastInteractorListener {

    ISourdCastViewListener viewListener;
    ISoundCastInteractor interactor;

    public SoundCastPresenterImpl(ISourdCastViewListener viewListener) {
        try {
            if (viewListener != null) {
                this.viewListener = viewListener;
                interactor = new SoundCastInteractorImpl(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void sendGetURL(String URL) {
        viewListener.showProgress();
        interactor.sendGetURL(URL);
    }

    @Override
    public void sendGetVastXML(String url) {
        viewListener.showProgress();
        interactor.sendGetVastXML(url);
    }

    @Override
    public void onDestroy() {
        interactor = null;
        viewListener = null;
    }

    @Override
    public void onSuccessSendGetURL(String object) {
        viewListener.hideProgress();
        viewListener.onSuccessSendGetURL(object);
    }

    @Override
    public void onErrorSendGetURL(String object) {
        viewListener.hideProgress();
        viewListener.onErrorSendGetURL(object);
    }

    @Override
    public void onSuccessGetVastXML(DataVastModel object) {
        viewListener.hideProgress();
        viewListener.onSuccessGetVastXML(object);
    }

    @Override
    public void onErrorGetVastXML(String object) {
        viewListener.hideProgress();
        viewListener.onErrorGetVastXML(object);
    }
}
