package com.thecara.dual

import android.app.Application
import com.thecara.dual.BuildConfig.DEBUG
import com.thecara.dual.logging.FabircTree
import timber.log.Timber

/**
 *   by:Thecara home
 *   date:2020/10/9
 */
class TimberXApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (DEBUG) {
            // Timber 的使用主要通过添加Tree实例，添加 Tree 实例可以通过方法Timber.plant 完成
            // DebugTree 自动实例化
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(FabircTree())
        }
    }
}