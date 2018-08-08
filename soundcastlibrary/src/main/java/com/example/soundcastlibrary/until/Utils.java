package com.example.soundcastlibrary.until;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import static vn.mobiapps.soundcast.until.Contanst.MINUTE;
import static vn.mobiapps.soundcast.until.Contanst.conntext;

/**
 * Created by NguyenTanHuynh on 7/30/2018.
 */

public class Utils {

    public static void hideKeyboard(Activity context) {
        try {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
            View focusedView = context.getCurrentFocus();
            if (focusedView != null) {
                imm.hideSoftInputFromWindow(focusedView.getWindowToken(), 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getTimeFormat(long time) {
        String tm = "";
        int s;
        int m;
        int h;
        s = (int) (time % MINUTE);
        m = (int) ((time - s) / MINUTE);
        if (m >= MINUTE) {
            h = m / MINUTE;
            m = m % MINUTE;
            if (h > MINUTE) {
                if (h < MINUTE)
                    tm += "0" + h + ":";
                else
                    tm += h + ":";
            }
        }
        if (m < MINUTE)
            tm += "0" + m + ":";
        else
            tm += m + ":";
        if (s < MINUTE)
            tm += "0" + s;
        else
            tm += s + "";
        return tm;
    }

    public static void check(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            Contanst.CONNECTED = true;
        } else {
            Contanst.CONNECTED = false;
        }
    }

    public static void checkNetWork(NetWork listener) {
        Utils.check(conntext);
        if (Contanst.CONNECTED == true) {
            listener.Connected();
        } else {
            Toast.makeText(conntext, "Vui lòng bật mạng để sử dụng app", Toast.LENGTH_SHORT).show();
        }
    }

    public interface NetWork {
        void Connected();
    }
}
