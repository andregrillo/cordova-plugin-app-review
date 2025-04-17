package com.cordova.plugin.appreview.vendor;

import androidx.annotation.Keep;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Keep
public @interface CordovaMethod {
    ExecutionThread value() default ExecutionThread.MAIN;
    String action() default "";
}