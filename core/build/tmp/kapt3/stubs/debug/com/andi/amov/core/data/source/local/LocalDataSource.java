package com.andi.amov.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/andi/amov/core/data/source/local/LocalDataSource;", "", "movieDao", "Lcom/andi/amov/core/data/source/local/room/MovieDao;", "(Lcom/andi/amov/core/data/source/local/room/MovieDao;)V", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/andi/amov/core/data/source/local/entity/MovieEntity;", "getFavoriteTourism", "insertTourism", "", "tourismList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavoriteTourism", "tourism", "newState", "", "core_debug"})
@javax.inject.Singleton
public final class LocalDataSource {
    private final com.andi.amov.core.data.source.local.room.MovieDao movieDao = null;
    
    @javax.inject.Inject
    public LocalDataSource(@org.jetbrains.annotations.NotNull
    com.andi.amov.core.data.source.local.room.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.data.source.local.entity.MovieEntity>> getAllTourism() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.data.source.local.entity.MovieEntity>> getFavoriteTourism() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertTourism(@org.jetbrains.annotations.NotNull
    java.util.List<com.andi.amov.core.data.source.local.entity.MovieEntity> tourismList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void setFavoriteTourism(@org.jetbrains.annotations.NotNull
    com.andi.amov.core.data.source.local.entity.MovieEntity tourism, boolean newState) {
    }
}