package com.ecos.mvvm.generic;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.util.Log;

public class CurrentNotificationHandler<T> implements NotificationHandler<T> {

	private static final String TAG = CurrentNotificationHandler.class.getSimpleName();
	private Map<String, BindingAction<T>> mActions = new HashMap<String, BindingAction<T>>();
	private Map<String, Activity> mActivities = new HashMap<String, Activity>();

	public void manageOnChangeFor(String propertyName, BindingAction<T> bindingAction, Activity activity) {
		Log.d(TAG, "Contador antes: " + mActivities.size());
		mActions.put(propertyName, bindingAction);
		mActivities.put(propertyName, activity);
		Log.d(TAG, "Contador después: " + mActivities.size());
	}

	public void notify(String propertyName, final T sourceElementValue) {
		if (mActions.containsKey(propertyName) && mActions.containsKey(propertyName)) {
			final BindingAction<T> action = mActions.get(propertyName);
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
