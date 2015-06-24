package com.alangeorge.android.scalaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

object MainScalaActivity {
  private val TAG: String = "MainScalaActivity"
}

class MainScalaActivity extends AppCompatActivity {
  import MainScalaActivity._

  protected override def onCreate(savedInstanceState: Bundle) {
    Log.d(TAG, "onCreate")
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater.inflate(R.menu.menu_main, menu)
    true
  }

  override def onOptionsItemSelected(item: MenuItem): Boolean = {
    val id: Int = item.getItemId
    if (id == R.id.action_settings) true
    else super.onOptionsItemSelected(item)
  }
}
