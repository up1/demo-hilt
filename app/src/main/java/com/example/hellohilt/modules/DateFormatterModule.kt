package com.example.hellohilt.modules

import com.example.hellohilt.date.DateFormatterService
import com.example.hellohilt.date.RealDateFormatterService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
abstract class DateFormatterModule {
    @Binds
    abstract fun bindDateFormatterService(impl: RealDateFormatterService): DateFormatterService
}