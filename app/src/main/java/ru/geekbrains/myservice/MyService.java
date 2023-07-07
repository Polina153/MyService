package ru.geekbrains.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    IBinder mBinder;      // Интерфейс связи с клиентом

    @Override
    public void onCreate() {
        // Создание службы
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Служба стартовала
        return START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // Привязка клиента
        return mBinder;
    }
    @Override
    public boolean onUnbind(Intent intent) {
        // Удаление привязки
        return true;
    }
    @Override
    public void onRebind(Intent intent) {
        // Перепривязка клиента
    }
    @Override
    public void onDestroy() {
        // Уничтожение службы
    }
}