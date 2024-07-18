package cf.zalnars.carlinkshortcut

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    private val packageNames: Array<String> = arrayOf(
        "com.syu.carlink"
    )

    private fun open() {
        val intent = Intent()
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        packageNames.forEach {
            try {
                intent.setClassName(it, "$it.MainActivity")
                startActivity(intent)
            } finally {
                finishActivity(0)
            }
        }
        finishActivity(0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        open()
    }

    override fun onResume() {
        super.onResume()
        finishActivity(0)
    }
}