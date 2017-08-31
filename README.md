
# react-native-shared-preferences

## Getting started

`$ npm install react-native-shared-preferences --save`

### Mostly automatic installation

`$ react-native link react-native-shared-preferences`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSharedPreferencesPackage;` to the imports at the top of the file
  - Add `new RNSharedPreferencesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-shared-preferences'
  	project(':react-native-shared-preferences').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-shared-preferences/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-shared-preferences')
  	```

## Usage
```javascript
import RNSharedPreferences from 'react-native-shared-preferences';

// TODO: What to do with the module?
RNSharedPreferences;
```
  