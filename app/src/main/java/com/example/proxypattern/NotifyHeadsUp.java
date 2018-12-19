package com.example.proxypattern;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

/**
 * Created by W on 2018/12/20.
 */

public class NotifyHeadsUp extends Notify {
    public NotifyHeadsUp(Context context){
        super(context);
    }
    @Override
    public void send(){
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(),R.layout.remote_notify_proxy_normal);
        n.bigContentView = new RemoteViews(context.getPackageName(),R.layout.remote_notify_proxy_big);
        n.headsUpContentView = new RemoteViews(context.getPackageName(),R.layout.remote_notify_proxy_normal);
        nm.notify(0,builder.build());
    }
    @Override
    public void cancel(){
        nm.cancel(0);
    }
}
