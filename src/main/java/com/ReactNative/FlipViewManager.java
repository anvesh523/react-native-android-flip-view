package com.ReactNative;

import android.app.Activity;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class FlipViewManager extends SimpleViewManager<ReactFlipView> {

    private final static String REACT_CLASS = "RCTFlipView";
    private Activity mActivity = null;

    public FlipViewManager(Activity activity) {
        mActivity = activity;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactFlipView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactFlipView(themedReactContext);
    }

}
