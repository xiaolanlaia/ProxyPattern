package com.example.proxypattern;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by W on 2018/12/19.
 */

public abstract class Notify {
    protected Context context;
    protected NotificationManager nm;
    protected NotificationCompat.Builder builder;

    public Notify(Context context){
        this.context = context;

        nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        builder = new NotificationCompat.Builder(context);
        builder.setContentIntent(PendingIntent.getActivity(context,0,new Intent(context,MainActivity.class),
                PendingIntent.FLAG_CANCEL_CURRENT));
    }
    /**
     * 发送一条通知
     */
    public abstract void send();
    /**
     * 取消一条通知
     */
    public abstract void cancel();
}
