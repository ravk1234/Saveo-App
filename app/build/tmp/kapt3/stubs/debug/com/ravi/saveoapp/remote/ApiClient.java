package com.ravi.saveoapp.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/ravi/saveoapp/remote/ApiClient;", "", "getShows", "", "Lcom/ravi/saveoapp/modelClass/ResponseClass;", "contentType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShows2", "Lcom/ravi/saveoapp/modelhorizontal/HorizonalClass;", "app_debug"})
public abstract interface ApiClient {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/shows?q=god")
    @retrofit2.http.Headers(value = {"Accept: application/json"})
    public abstract java.lang.Object getShows(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ravi.saveoapp.modelClass.ResponseClass>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "shows?page=1")
    @retrofit2.http.Headers(value = {"Accept: application/json"})
    public abstract java.lang.Object getShows2(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.ravi.saveoapp.modelhorizontal.HorizonalClass>> continuation);
}