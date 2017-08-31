import { NativeModules } from 'react-native';
const { RNSharedPreferences } = NativeModules;


class PreferencesWrapper {

    constructor(prefFileName) {
        this.prefFileName = prefFileName;
        this.sharedPreferences = RNSharedPreferences.getSharedPreferences(this.prefFileName);
    }

    getString(keyName) {
        this.sharedPreferences.getString(keyName);
    }

    putString(keyName, value) {
        this.sharedPreferences.putString(keyName, value);
    }
}

export default PreferencesWrapper;
