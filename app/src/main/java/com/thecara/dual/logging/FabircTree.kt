package com.thecara.dual.logging

import timber.log.Timber
import java.lang.IllegalStateException

/**
 *   by:Thecara home
 *   date:2020/10/9
 */
class FabircTree :Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        try {
            if (t!=null){

            }else{

            }
        } catch (e:IllegalStateException) {

        }
    }
}