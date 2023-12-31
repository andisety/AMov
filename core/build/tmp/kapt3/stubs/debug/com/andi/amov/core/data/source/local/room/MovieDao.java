package com.andi.amov.core.data.source.local.room;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001f\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/andi/amov/core/data/source/local/room/MovieDao;", "", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/andi/amov/core/data/source/local/entity/MovieEntity;", "getFavoriteTourism", "insertTourism", "", "tourism", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteTourism", "core_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM movies")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.data.source.local.entity.MovieEntity>> getAllTourism();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM movies where isFavorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.data.source.local.entity.MovieEntity>> getFavoriteTourism();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTourism(@org.jetbrains.annotations.NotNull
    java.util.List<com.andi.amov.core.data.source.local.entity.MovieEntity> tourism, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Update
    public abstract void updateFavoriteTourism(@org.jetbrains.annotations.NotNull
    com.andi.amov.core.data.source.local.entity.MovieEntity tourism);
}