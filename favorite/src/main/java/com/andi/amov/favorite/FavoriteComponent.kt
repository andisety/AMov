package com.andi.amov.favorite

import android.content.Context
import com.andi.amov.di.FavoriteModuleDepedencies
import dagger.BindsInstance
import dagger.Component


@Component(dependencies = [FavoriteModuleDepedencies::class])

interface FavoriteComponent {
    fun inject(activity:FavoriteActivity)
    @Component.Builder
    interface Builder{
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(mapsModuleDependencies: FavoriteModuleDepedencies): Builder
        fun build(): FavoriteComponent
    }
}