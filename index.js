import PreferencesWrapper from './preferences_wrapper';

export default {
    getSharedPreferences: (prefName) => {
        return new PreferencesWrapper(prefName);
    }
};
