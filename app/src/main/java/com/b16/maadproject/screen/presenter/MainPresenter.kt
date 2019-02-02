package com.b16.maadproject.screen.presenter

import com.b16.maadproject.screen.contract.MainContract
import com.b16.maadproject.screen.model.MainActivityModel
import javax.inject.Inject

class MainPresenter @Inject constructor(private val mainActivityModel: MainActivityModel)
    : MainContract.IPresenter{

}