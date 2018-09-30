package xyz.twbkg.stock.data.source.local.common

import android.support.annotation.NonNull
import io.reactivex.Completable
import io.reactivex.Flowable

interface BaseDataSource<T> {

    fun findLastId(): Flowable<T>

    fun findAll(): Flowable<List<T>>

    fun findById(@NonNull id: Int): Flowable<T>

    fun save(@NonNull model: T): Completable

    fun saveAll(@NonNull model: List<T>): Completable

    fun update(@NonNull model: T): Completable

    fun refreshData()

    fun deleteAll(): Completable

    fun delete(@NonNull id: Int): Completable
}