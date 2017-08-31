
# react-native-shared-preferences

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

// TODO: What to do with the module?
RNSharedPreferences;
```
  