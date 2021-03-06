package xyz.twbkg.stock.application

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.jakewharton.retrofit2.adapter.rxjava2.HttpException
import xyz.twbkg.stock.di.common.Injectable
import xyz.twbkg.stock.ui.common.Resolution


abstract class BaseFragment : androidx.fragment.app.Fragment(), Injectable {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    fun updateTitle(title: String) {
        (activity as AppCompatActivity).supportActionBar?.title = title
    }
}