package net.di.producer1.controllers

import android.content.Context
import net.di.lib.controllers.Builder
import net.di.producer1.features.FeatureBinder

class FeatureDirectoryBuilder {

    companion object {
        fun build(context: Context) {
            Builder(context)
                .version(1)
                .advertiseDataList(FeatureBinder.getProperties())
                .build(FeatureController())
        }
    }
}