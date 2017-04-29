package pl.mg6.kotho

import android.app.Application
import com.facebook.soloader.SoLoader

fun Application.initSoLoader() = SoLoader.init(this, false)
