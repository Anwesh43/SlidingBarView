package com.anwesh.uiprojects.linkedslidingbouncybarview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.slidingbouncybarview.SlidingBouncyBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SlidingBouncyBarView.create(this)
    }
}
