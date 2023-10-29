package cf.zalnars.carlinkshortcut

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    private fun open() {
        val intent = Intent()
        intent.setClassName("com.syu.carlink", "com.syu.carlink.MainActivity")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finishActivity(0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        open()
    }

    override fun onResume() {
        super.onResume()
        open()
    }
}