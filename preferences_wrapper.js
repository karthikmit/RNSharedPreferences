import { NativeModules } from 'react-native';
const { RNSharedPreferences } = NativeModules;


class PreferencesWrapper {

    constructor(prefFileName) {
        this.prefFileName = prefFileName;
    }

    getString(keyName, callback) {
        console.log("Key to retrieve :: " + keyName);
        return RNSharedPreferences.getString(this.prefFileName, keyName, callback);
    }

    putString(keyName, value, callback) {
        console.log("Key to put :: " + keyName + " And Value is :: " + value);
        return RNSharedPreferences.putString(this.prefFileName, keyName, value, callback);
    }
}

export default PreferencesWrapper;
