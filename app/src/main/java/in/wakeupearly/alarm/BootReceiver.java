package in.wakeupearly.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import trikita.jedux.Action;
import in.wakeupearly.Actions;
import in.wakeupearly.App;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (App.getState().alarm().on()) {
            App.dispatch(new Action<>(Actions.Alarm.RESTART_ALARM));
        }
    }
}
