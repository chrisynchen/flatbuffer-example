package com.chris.flatbuffer_example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.ByteBuffer

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputStream = resources.openRawResource(R.raw.personinjson)
        val reader = InputStreamReader(inputStream, "UTF-8")

        //Gson
        val t1 = System.currentTimeMillis()
        val data = Gson().fromJson(
            reader,
            Person::class.java
        )
        Log.d(TAG, "json load time : " + (System.currentTimeMillis() - t1).toString() + " ms")

        //Flatbuffer
        val flatbufferInputStream = resources.openRawResource(R.raw.person)
        val flatbufferByteArray = convertStreamToByteArray(flatbufferInputStream)
        val bb = ByteBuffer.wrap(flatbufferByteArray)

        val t3 = System.currentTimeMillis()
        val flatbufferData1 =
            com.chris.flatbuffer_example.data.Person.getRootAsPerson(bb)
        Log.d(TAG, "flatbuffer load time1: " + (System.currentTimeMillis() - t3) + " ms")
    }

    private fun convertStreamToByteArray(inputStream: InputStream): ByteArray {
        val baos = ByteArrayOutputStream()
        val buff = ByteArray(inputStream.available())
        var i = inputStream.read(buff, 0, buff.size)
        while (i > 0) {
            baos.write(buff, 0, i)
            i = inputStream.read(buff, 0, buff.size)
        }

        return baos.toByteArray() // be sure to close InputStream in calling function
    }
}
