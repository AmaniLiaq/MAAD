package com.b16.maadproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.b16.maadproject.screen.contract.MainContract
import com.b16.maadproject.screen.presenter.MainPresenter
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() , MainContract.IView{

//    @Inject lateinit var mainPresenter: MainContract.IPresenter

    @Inject lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.onAttach(this)
        mainPresenter.create()
    }
}
