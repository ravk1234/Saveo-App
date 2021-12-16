package com.ravi.saveoapp.repository;

import java.lang.System;

/**
 * This is a `M` layer in the `MVVM` architecture which gives us the data from the API
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/ravi/saveoapp/repository/MainRespository;", "", "()V", "CONTENT_TYPE", "", "apiClient", "Lcom/ravi/saveoapp/remote/ApiClient;", "kotlin.jvm.PlatformType", "getApiClient", "()Lcom/ravi/saveoapp/remote/ApiClient;", "responseHandler", "Lcom/ravi/saveoapp/remote/ResponseHandler;", "getResponseHandler", "()Lcom/ravi/saveoapp/remote/ResponseHandler;", "getListOfMovies", "Lcom/ravi/saveoapp/remote/Resource;", "", "Lcom/ravi/saveoapp/modelClass/ResponseClass;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListOfMovies2", "Lcom/ravi/saveoapp/modelhorizontal/HorizonalClass;", "app_debug"})
public final class MainRespository {
    private final java.lang.String CONTENT_TYPE = "application/json";
    private final com.ravi.saveoapp.remote.ApiClient apiClient = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ravi.saveoapp.remote.ResponseHandler responseHandler = null;
    
    public MainRespository() {
        super();
    }
    
    public final com.ravi.saveoapp.remote.ApiClient getApiClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ravi.saveoapp.remote.ResponseHandler getResponseHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getListOfMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ravi.saveoapp.remote.Resource<? extends java.util.List<com.ravi.saveoapp.modelClass.ResponseClass>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getListOfMovies2(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ravi.saveoapp.remote.Resource<? extends java.util.List<com.ravi.saveoapp.modelhorizontal.HorizonalClass>>> continuation) {
        return null;
    }
}