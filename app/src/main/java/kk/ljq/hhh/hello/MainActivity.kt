package kk.ljq.hhh.hello

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import kk.ljq.hhh.hello.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    internal var viewModel = ViewModelC(this)


    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main);

        val binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVa(viewModel)
        viewModel.onCreate()
    }

    protected fun onPause() {
        super.onPause()
        viewModel.onPause()
    }

    protected fun onResume() {
        super.onResume()
        viewModel.onResume()
    }

    protected fun onDestroy() {
        super.onDestroy()
        viewModel.onDestroy()
    }
}
