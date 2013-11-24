package com.ecos.mvvm.generic;

import android.app.Activity;

public interface NotificationHandler<T> {
	void notify(String string,T value);

	void manageOnChangeFor(String propertyName, BindingAction<T> bindingAction, Activity activity);
}
