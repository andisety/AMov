package com.andi.amov.core.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/andi/amov/core/data/MovieRepository;", "Lcom/andi/amov/core/domain/repository/IMovieRepository;", "remoteDataSource", "Lcom/andi/amov/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/andi/amov/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/dicoding/tourismapp/core/utils/AppExecutors;", "(Lcom/andi/amov/core/data/source/remote/RemoteDataSource;Lcom/andi/amov/core/data/source/local/LocalDataSource;Lcom/dicoding/tourismapp/core/utils/AppExecutors;)V", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "Lcom/andi/amov/core/data/Resource;", "", "Lcom/andi/amov/core/domain/model/Movie;", "getFavoriteTourism", "setFavoriteTourism", "", "tourism", "state", "", "core_debug"})
@javax.inject.Singleton
public final class MovieRepository implements com.andi.amov.core.domain.repository.IMovieRepository {
    private final com.andi.amov.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.andi.amov.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.dicoding.tourismapp.core.utils.AppExecutors appExecutors = null;
    
    @javax.inject.Inject
    public MovieRepository(@org.jetbrains.annotations.NotNull
    com.andi.amov.core.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.andi.amov.core.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull
    com.dicoding.tourismapp.core.utils.AppExecutors appExecutors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.andi.amov.core.data.Resource<java.util.List<com.andi.amov.core.domain.model.Movie>>> getAllTourism() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.domain.model.Movie>> getFavoriteTourism() {
        return null;
    }
    
    @java.lang.Override
    public void setFavoriteTourism(@org.jetbrains.annotations.NotNull
    com.andi.amov.core.domain.model.Movie tourism, boolean state) {
    }
}