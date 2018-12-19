package com.example.proxypattern;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

/**
 * Created by W on 2018/12/20.
 */

public class NotifyBig extends Notify {
    public NotifyBig(Context context){
        super(context);
    }
    @Override
    public void send(){
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(),R.layout.remote_notify_proxy_normal);
        n.bigContentView = new RemoteViews(context.getPackageName(),R.layout.remote_notify_proxy_big);
        nm.notify(0,n);
    }
    @Override
    public void cancel(){
        nm.cancel(0);
    }
}
