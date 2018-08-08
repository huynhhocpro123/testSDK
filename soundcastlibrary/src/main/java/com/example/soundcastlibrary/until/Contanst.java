package com.example.soundcastlibrary.until;

import android.content.Context;

/**
 * Created by NguyenTanHuynh on 7/22/2018.
 */

public class Contanst {

    public static String TOKEN;
    public static final String URLRQUEST = "https://e-stg.api.soundcast.fm/e?token=";
    public static final int MILISECONDS =1000;
    public static final int MINUTE = 60 ;
    public static final String URL = "https://delivery-stg.api.soundcast.fm/network/" ;
    public static final String ADVERTISEMENT = "?pageTitle=NRJ&pageDescription=null&keywords=null&pageUrl=https%3A%2F%2Fdemo-stg.soundcast.fm%2F&tags=null&test=true" ;
    public static final String START = "&name=start";
    public static final String FIRSTQUARTILE = "&name=firstquartile";
    public static final String MIDPOINT = "&name=midpoint";
    public static final String THIRDQUARTILE = "&name=thirdquartile";
    public static final String COMPLETE = "&name=complete";
    public static Context conntext = null;
    public static  boolean CONNECTED = false;

}
