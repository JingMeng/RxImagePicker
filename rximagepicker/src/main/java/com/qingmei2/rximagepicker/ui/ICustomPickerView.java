package com.qingmei2.rximagepicker.ui;

import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.fragment.app.FragmentActivity;

import io.reactivex.Observable;

/**
 * <p>
 * It is responsible for controlling the presentation of the user interface layer.
 * </p>
 * <p>
 * For the developer, it may be an {@link android.app.Activity}. Of course, in some cases, it may
 * also be partially displayed in the {@link android.app.Activity} as a {@link androidx.fragment.app.Fragment}.</p>
 * <p>
 * If the ImagePicker's page was displayed as a {@link android.app.Activity}, The controller
 * {@link com.qingmei2.rximagepicker.core.ActivityPickerProjector} will manage the display logic of
 * {@link android.app.Activity}.</p>
 * <p>
 * If the ImagePicker's page was displayed as a {@link androidx.fragment.app.Fragment}, it's holder
 * activity will place it in the corresponding {@link android.view.ViewGroup} container and display it.
 * <p/>
 *
 * @see com.qingmei2.rximagepicker.core.ActivityPickerProjector
 * @see BaseSystemPickerView
 */
public interface ICustomPickerView {

    void display(FragmentActivity fragmentActivity,
                 @IdRes int viewContainer,
                 String tag,
                 ICustomPickerConfiguration configuration);

    Observable<Uri> pickImage();

}

