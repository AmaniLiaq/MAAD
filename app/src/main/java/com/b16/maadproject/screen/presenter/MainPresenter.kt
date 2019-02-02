package com.b16.maadproject.screen.presenter

import android.util.Log
import com.b16.maadproject.model.CharacterType
import com.b16.maadproject.screen.contract.MainContract
import com.b16.maadproject.screen.model.MainActivityModel
import io.reactivex.schedulers.Schedulers
import java.util.logging.Logger

import javax.inject.Inject

class MainPresenter @Inject constructor(private val mainActivityModel: MainActivityModel) : MainContract.IPresenter {

    private var mainView: MainContract.IView? = null

    fun onAttach(mainView: MainContract.IView) {
        this.mainView = mainView
    }

    fun create() {
        //make network call
        mainActivityModel.loadCharacters(CharacterType.SIMPSONS)
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .subscribe({
            Log.INFO
            })

    }

}