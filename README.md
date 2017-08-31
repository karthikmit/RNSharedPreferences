
# react-native-shared-preferences

## Getting started

`$ npm install react-native-shared-preferences --save`

### Mostly automatic installation

`$ react-native link react-native-shared-preferences`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-shared-preferences` and add `RNSharedPreferences.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSharedPreferences.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNSharedPreferences.sln` in `node_modules/react-native-shared-preferences/windows/RNSharedPreferences.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNSharedPreferences;` to the usings at the top of the file
  - Add `new RNSharedPreferencesPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNSharedPreferences from 'react-native-shared-preferences';

// TODO: What to do with the module?
RNSharedPreferences;
```
  