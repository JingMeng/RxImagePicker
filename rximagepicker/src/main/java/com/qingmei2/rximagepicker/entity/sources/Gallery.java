package com.qingmei2.rximagepicker.entity.sources;

import androidx.annotation.IdRes;

import com.qingmei2.rximagepicker.ui.DefaultImagePicker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation will be marked open Gallery锛宨t will conflict with {@link Camera}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Gallery {
    
    String viewKey() default DefaultImagePicker.DEFAULT_PICKER_GALLERY;

    @IdRes int containerViewId() default 0;
}

