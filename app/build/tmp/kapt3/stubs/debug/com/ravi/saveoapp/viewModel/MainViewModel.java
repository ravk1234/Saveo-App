package com.ravi.saveoapp.viewModel;

import java.lang.System;

/**
 * This is a VM layer in the `MVVM` architecture, where we are notifying the Activity/view about the
 * response changes via live data
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ravi/saveoapp/viewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "repository", "Lcom/ravi/saveoapp/repository/MainRespository;", "getMovie", "Landroidx/lifecycle/LiveData;", "", "Lcom/ravi/saveoapp/modelClass/ResponseClass;", "getMovie2", "Lcom/ravi/saveoapp/modelhorizontal/HorizonalClass;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.ravi.saveoapp.repository.MainRespository repository = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ravi.saveoapp.modelClass.ResponseClass>> getMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ravi.saveoapp.modelhorizontal.HorizonalClass>> getMovie2() {
        return null;
    }
}