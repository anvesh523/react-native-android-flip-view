package com.ReactNative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class FlipReactModule extends ReactContextBaseJavaModule {

    private static final String REACT_MODULE = "RnFlip";
    private ReactContext mReactContext;

    public FlipReactModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.mReactContext = reactContext;
    }

    @Override
    public String getName() {
        return REACT_MODULE;
    }

}
