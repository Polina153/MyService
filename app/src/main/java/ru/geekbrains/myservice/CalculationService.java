package ru.geekbrains.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class CalculationService extends Service {
    private final IBinder binder = new ServiceCalcBinder();
    private long seconds = 0;
    public static void startCalculationService(MainActivity mainActivity, int seconds) {
        getNextSecond(mainActivity, (long)seconds);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
        }
    private static long getNextSecond(MainActivity mainActivity, long seconds) {
        long result = seconds - 1;
        return result;
    }
    class ServiceCalcBinder extends Binder {
       CalculationService getService() {
            return CalculationService.this;
        }
        long getNextSecond(){
            return getService().getNextSecond(mainActivity, (long) seconds);
        }
    }


}

