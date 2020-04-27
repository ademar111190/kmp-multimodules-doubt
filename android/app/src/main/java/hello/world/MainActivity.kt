package hello.world

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import hello.world.modulea.HelloWorld
import hello.world.moduleb.egassem

class MainActivity : Activity() {

    private val hello by lazy { findViewById<TextView>(R.id.hello) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = HelloWorld("Greetings from Android!")
        val text = "${helloWorld.message}\n${helloWorld.egassem()}"
        hello.text = text
    }

}
