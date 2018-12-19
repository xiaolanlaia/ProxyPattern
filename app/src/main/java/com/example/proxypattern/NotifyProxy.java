package com.example.proxypattern;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/**
 * Created by W on 2018/12/20.
 */

public class NotifyProxy extends Notify {
    private Notify notify;
    public NotifyProxy(Context context){
        super(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            notify = new NotifyBig(context);
        }else{
            notify = new NotifyNormal(context);
        }
    }
    @Override
    public void send(){
        notify.send();
    }
    @Override
    public void cancel(){
        notify.cancel();
    }
}
