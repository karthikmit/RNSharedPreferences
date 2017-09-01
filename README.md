
# react-native-shared-preferences

Simple react native plugin for accessing Android SharedPreferences.

 getSharedPreferences should be called with a proper preferences file name. So, essentially every SharedPreferences JS Object is bound with a single preferences file.

 After getting the instance, methods like putString, getString shall be called as given in the Usage section.

 Since this plugin simply wraps the Android SharedPreferences, all the thread safety and performance guarantees will be intact.


## Getting started

`$ npm install react-native-android-shared-preferences --save`

### Mostly automatic installation

`$ react-native link react-native-android-shared-preferences`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.makemytrip.sharedpref.RNSharedPreferencesPackage;` to the imports at the top of the file
  - Add `new RNSharedPreferencesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-android-shared-preferences'
  	project(':react-native-android-shared-preferences').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-android-shared-preferences/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-android-shared-preferences')
  	```

## Usage
```javascript
import RNSharedPreferences from 'react-native-android-shared-preferences';

var sharedPreferences = RNSharedPreferences.getSharedPreferences("userInfo");
sharedPreferences.putString("name", "Karthik", (result) => {
 // Should return true here, if PUT is successful.
 console.log("PUT result :: " + result);
});

console.log(sharedPreferences.getString("name", (result) => {
     // Should return Karthik here ...
     console.log("Get result :: " + result);
}));

```
  