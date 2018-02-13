package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import com.github.aoriani.rnstacktracer.StackTracePackage;

public class StackTracerPlugin implements ReactPlugin<StackTracerPlugin.Config> {

    public ReactPackage hook(@NonNull Application application,
                     @NonNull Config config) {
        if (config.isEnabled) {
            return new StackTracePackage();
        } else {
            return null;
        }
    }

    public static class Config implements ReactPluginConfig  {
        private boolean isEnabled;

        public Config() {
            isEnabled = true;
        }

        public Config enabled(boolean value) {
            this.isEnabled = value;
            return this;
        }
    }
}
