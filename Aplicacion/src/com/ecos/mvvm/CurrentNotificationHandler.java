package com.ecos.mvvm;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.util.Log;

public class CurrentNotificationHandler implements NotificationHandler {

	private static final String TAG = CurrentNotificationHandler.class.getSimpleName();
	private Map<String, BindingAction> mActions = new HashMap<String, BindingAction>();
	private Map<String, Activity> mActivities = new HashMap<String, Activity>();

	public void manageOnChangeFor(String propertyName, BindingAction bindingAction, Activity activity) {
		Log.d(TAG, "Contador antes: " + mActivities.size());
		mActions.put(propertyName, bindingAction);
		mActivities.put(propertyName, activity);
		Log.d(TAG, "Contador después: " + mActivities.size());
	}

	public void notify(String propertyName, final Object sourceElementValue) {
		if (mActions.containsKey(propertyName) && mActions.containsKey(propertyName)) {
			final BindingAction action = mActions.get(propertyName);
			Activity activity = mActivities.get(propertyName);
			Runnable runnable = new Runnable() {
				public void run() {
					action.fireAction(sourceElementValue);
				}
			};
			activity.runOnUiThread(runnable);

		}

	}

}
