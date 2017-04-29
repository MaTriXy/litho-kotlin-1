package pl.mg6.kotho

import android.app.Activity
import android.os.Bundle

class TestActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contentView {
            text {
                text("Hello, Kotho!")
                textSizeDip(50f)
            }
        }
    }
}
