package pl.mg6.kotho

import android.app.Activity
import com.facebook.litho.Component
import com.facebook.litho.widget.Text

fun Activity.text(init: Text.Builder.() -> Unit): Component<Text> {
    return Text.create(componentContext)
            .apply(init)
            .build()
}
