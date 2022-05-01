package com.geektech.photoselection.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geektech.photoselection.data.model.Picture


class PhotosViewModel : ViewModel() {

    private val _listState = MutableLiveData<List<Picture>>()
    var listState: MutableLiveData<List<Picture>> = _listState

    fun putPicture(list: List<Picture>) {
        _listState.postValue(list)
    }
}