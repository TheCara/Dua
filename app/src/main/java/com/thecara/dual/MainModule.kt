package com.thecara.dual

import android.app.Application
import android.content.ComponentName
import android.content.ContentResolver
import org.koin.dsl.module.module

/**
 *   by:Thecara home
 *   date:2020/10/10
 */
const val MAIN = "main"
val mainModule= module {
    factory<ContentResolver> {
        // 指定类型<>
        // 指定实例类型
        get<Application>().contentResolver
    }
    single {
        val component = ComponentName(get(),)
    }
}