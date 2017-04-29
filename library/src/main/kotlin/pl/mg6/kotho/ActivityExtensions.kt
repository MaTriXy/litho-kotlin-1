package pl.mg6.kotho

import android.app.Activity
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun Activity.contentView(componentFactory: () -> Component<*>) {
    setContentView(componentFactory())
}

fun Activity.setContentView(component: Component<*>) {
    setContentView(LithoView.create(componentContext, component))
}

internal val Activity.componentContext by ComponentContextProvider()

internal class ComponentContextProvider : ReadOnlyProperty<Activity, ComponentContext> {

    private var initialized: Boolean = false
    private lateinit var value: ComponentContext

    override fun getValue(thisRef: Activity, property: KProperty<*>): ComponentContext {
        if (!initialized) {
            value = ComponentContext(thisRef)
        }
        return value
    }
}
