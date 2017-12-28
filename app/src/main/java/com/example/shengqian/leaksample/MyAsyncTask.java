package com.example.shengqian.leaksample;

import android.os.AsyncTask;
import android.os.SystemClock;

/**
 * Created by shengqian on 2017/12/28.
 */

public class MyAsyncTask extends AsyncTask {
    @Override
    protected Object doInBackground(Object[] params) {
        SystemClock.sleep(20000);
        return null;
    }
}
