package com.example.nativeimageexample;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.image.ReactImageView;
import android.support.annotation.Nullable;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ImageResizeMode;

/**
 * Created by Necfol on 3/22/18.
 */

public class NativeImageExampleManager extends SimpleViewManager<ReactImageView> {
    public static final String REACT_CLASS = "RCTImageView";
    private Object mCallerContext;
    public NativeImageExampleManager(Object mCallerContext) {
        this.mCallerContext = mCallerContext;
    }
    @Override
    public String getName() {
        return REACT_CLASS;
    }
    @Override
    public ReactImageView createViewInstance(ThemedReactContext context) {
//        mCallerContext
        return new ReactImageView(context, Fresco.newDraweeControllerBuilder(), null, mCallerContext);
    }
    @ReactProp(name = "src")
    public void setSrc(ReactImageView view, @Nullable ReadableArray src) {
        view.setSource(src);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(ReactImageView view, float borderRadius) {
        view.setBorderRadius(borderRadius);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(ReactImageView view, @Nullable String resizeMode) {
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
    }
}

