package com.ecos.mvvm;

import android.app.Activity;

public interface NotificationHandler {
	void notify(String string, Object value);

	void manageOnChangeFor(String propertyName, BindingAction bindingAction, Activity activity);
}
