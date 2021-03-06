package com.dimeno.commons.toolbar.impl

import android.app.Activity
import android.view.View

/**
 * base toolbar
 * Created by wangzhen on 2020/8/28.
 */
abstract class Toolbar(protected val activity: Activity) {
    private var view: View? = null
    abstract fun layoutRes(): Int
    open fun onViewCreated(view: View) {}

    fun createView(): View {
        if (view == null) {
            view = activity.layoutInflater.inflate(layoutRes(), null)
            onViewCreated(view!!)
        }
        return view!!
    }
}