package com.project.segunfrancis.crypto_info.util

/**
 * Created by SegunFrancis
 */

class Resource<out T> constructor(
    val status: ResourceState,
    val data: T? = null,
    val message: String? = null,
    val throwable: Throwable? = null
) {
    fun <T> success(data: T): Resource<T> {
        return Resource(ResourceState.SUCCESS, data, null)
    }

    fun <T> error(message: String?): Resource<T> {
        return Resource(ResourceState.ERROR, null, message, throwable)
    }

    fun <T> loading(): Resource<T> {
        return Resource(ResourceState.LOADING, null, null)
    }
}