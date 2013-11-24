package com.ecos.mvvm.generic;

public interface BindingAction<T> {
	void fireAction(T sourceElementValue);
}
