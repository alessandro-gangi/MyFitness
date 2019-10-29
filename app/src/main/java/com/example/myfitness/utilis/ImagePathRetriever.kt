package com.example.myfitness.utilis

import android.app.Activity
import android.content.Context
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.provider.MediaStore
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


object ImagePathRetriever {

    fun getRealPathFromURI(activity: Activity, contentURI: Uri): String {
        val result: String
        val cursor: Cursor? = activity.contentResolver.query(contentURI, null, null, null, null)
        if (cursor == null) {
            result = contentURI.path!!
        } else {
            cursor.moveToFirst()
            val index: Int = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
            result = cursor.getString(index)
            cursor.close()
        }
        return result
    }
}