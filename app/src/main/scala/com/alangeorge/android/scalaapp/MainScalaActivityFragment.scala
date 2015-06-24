package com.alangeorge.android.scalaapp

import android.support.v4.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

object MainScalaActivityFragment {
  private val TAG: String = "MainScalaActivityFragment"
}

class MainScalaActivityFragment extends Fragment {
  import MainScalaActivityFragment._

  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): View = {
    Log.d(TAG, "onCreateView")
    inflater.inflate(R.layout.fragment_main, container, false)
  }
}
