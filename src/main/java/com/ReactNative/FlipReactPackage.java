package com.ReactNative;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlipReactPackage implements ReactPackage {

    public FlipReactPackage() {

    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new FlipReactModule(reactContext));
        //return modules;
        return new ArrayList<>();
    }

    // @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager> manager = new ArrayList<>();
        manager.add(new FlipViewManager());
        return manager;
    }
}

/*
import PropTypes from 'prop-types';
        import {requireNativeComponent, ViewPropTypes} from 'react-native';

        var iface = {
        name: 'FlipView',
        propTypes: {
        src: PropTypes.string,
        borderRadius: PropTypes.number,
        resizeMode: PropTypes.oneOf(['cover', 'contain', 'stretch']),
        ...ViewPropTypes, // include the default view properties
        },
        };

        module.exports = requireNativeComponent('RCTFlipView', iface);
 */

