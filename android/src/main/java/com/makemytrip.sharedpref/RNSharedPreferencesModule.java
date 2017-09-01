package com.makemytrip.sharedpref;

import android.content.SharedPreferences;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNSharedPreferencesModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSharedPreferencesModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSharedPreferences";
  }

  @ReactMethod
  public void getString(String prefName, String keyName, Callback resultCallback) {
    SharedPreferences sharedPreferences = this.reactContext.getSharedPreferences(prefName, 0);

    String result = sharedPreferences.getString(keyName, "");
    resultCallback.invoke(result);
  }

  @ReactMethod
  public void putString(String prefName, String keyName, String value, Callback resultCallback) {
    SharedPreferences sharedPreferences = this.reactContext.getSharedPreferences(prefName, 0);

    boolean commitResult = sharedPreferences.edit().putString(keyName, value).commit();
    resultCallback.invoke(commitResult);
  }
}