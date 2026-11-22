package com.qingmei2.rximagepicker.di;

import androidx.fragment.app.FragmentActivity;

import com.qingmei2.rximagepicker.core.IImagePickerProcessor;
import com.qingmei2.rximagepicker.delegate.ProxyTranslator;
import com.qingmei2.rximagepicker.entity.CustomPickConfigurations;

import dagger.Component;

@Component(modules = RxImagePickerModule.class)
public interface RxImagePickerComponent {

    IImagePickerProcessor rxImagePickerProcessor();

    ProxyTranslator proxyTranslator();

    FragmentActivity fragmentActivity();

    CustomPickConfigurations customPickConfigurations();
}

