package com.jaquadro.minecraft.storagedrawers.core;

import com.jaquadro.minecraft.storagedrawers.StorageDrawers;
import com.jaquadro.minecraft.storagedrawers.api.IStorageDrawersApi;
import com.jaquadro.minecraft.storagedrawers.api.config.IUserConfig;
import com.jaquadro.minecraft.storagedrawers.api.registry.IRecipeHandlerRegistry;
import com.jaquadro.minecraft.storagedrawers.api.registry.IRenderRegistry;
import com.jaquadro.minecraft.storagedrawers.api.registry.IWailaRegistry;

public class Api implements IStorageDrawersApi
{
    public static IStorageDrawersApi instance;

    public Api () {
        instance = this;
    }

    @Override
    public IRecipeHandlerRegistry recipeHandlerRegistry () {
        return StorageDrawers.recipeHandlerRegistry;
    }

    @Override
    public IRenderRegistry renderRegistry () {
        return StorageDrawers.renderRegistry;
    }

    @Override
    public IWailaRegistry wailaRegistry () {
        return StorageDrawers.wailaRegistry;
    }

    @Override
    public IUserConfig userConfig () {
        return StorageDrawers.config.userConfig;
    }
}
