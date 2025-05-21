package cf.zalnars.carlinkshortcut

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
    private val packageNames: Array<String> = arrayOf(
        "com.syu.carlink"
    )

    private fun open() {
        try {
            val intent = Intent()
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            packageNames.forEach {
                try {
                    intent.setClassName(it, "$it.MainActivity")
                    startActivity(intent)
                    Toast.makeText(this,"Success", Toast.LENGTH_SHORT).show()
                } finally {
                    finishActivity(0)
                }
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Failed to open carlink, you probably don't have the right installed. Please report it.", Toast.LENGTH_LONG).show()
        } finally {
            finishActivity(0)
            finish()
            return
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        open()
    }

    override fun onResume() {
        super.onResume()
        finishActivity(0)
        finish()
    }
}