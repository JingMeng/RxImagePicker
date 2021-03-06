package com.qingmei2.rximagepicker.entity.sources;

import android.support.annotation.IdRes;

import com.qingmei2.rximagepicker.ui.DefaultImagePicker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation will be marked open Gallery，it will conflict with {@link Gallery}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Camera {

    String viewKey() default DefaultImagePicker.DEFAULT_PICKER_CAMERA;

    @IdRes int containerViewId() default 0;
}
