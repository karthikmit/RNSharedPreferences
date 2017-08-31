
package com.reactlibrary;

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
  public String getString(String prefName, String keyName) {
    SharedPreferences sharedPreferences = this.reactContext.getSharedPreferences(prefName);

    return sharedPreferences.getString(keyName);
  }

  @ReactMethod
  public Boolean putString(String prefName, String keyName, String value) {
    SharedPreferences sharedPreferences = this.reactContext.getSharedPreferences(prefName);

    return sharedPreferences.sharedPreferences.edit().putString(keyName, value).commit();
  }
}