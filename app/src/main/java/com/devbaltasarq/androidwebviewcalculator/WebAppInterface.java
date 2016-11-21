package com.devbaltasarq.androidwebviewcalculator;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Maneja la interfaz desde la web.
 */
public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText( mContext, toast, Toast.LENGTH_LONG ).show();
    }
}
