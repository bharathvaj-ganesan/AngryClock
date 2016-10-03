package in.wakeupearly.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import trikita.jedux.Action;
import in.wakeupearly.Actions;
import in.wakeupearly.App;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        App.dispatch(new Action<>(Actions.Alarm.WAKEUP));
    }
}
