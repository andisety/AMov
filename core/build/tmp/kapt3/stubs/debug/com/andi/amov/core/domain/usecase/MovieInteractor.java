package com.andi.amov.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/andi/amov/core/domain/usecase/MovieInteractor;", "Lcom/andi/amov/core/domain/usecase/MovieUseCase;", "movieRepository", "Lcom/andi/amov/core/domain/repository/IMovieRepository;", "(Lcom/andi/amov/core/domain/repository/IMovieRepository;)V", "getAllMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/andi/amov/core/data/Resource;", "", "Lcom/andi/amov/core/domain/model/Movie;", "getFavoriteMovie", "setFavoriteMovie", "", "movie", "state", "", "core_debug"})
public final class MovieInteractor implements com.andi.amov.core.domain.usecase.MovieUseCase {
    private final com.andi.amov.core.domain.repository.IMovieRepository movieRepository = null;
    
    @javax.inject.Inject()
    public MovieInteractor(@org.jetbrains.annotations.NotNull()
    com.andi.amov.core.domain.repository.IMovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.andi.amov.core.data.Resource<java.util.List<com.andi.amov.core.domain.model.Movie>>> getAllMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.domain.model.Movie>> getFavoriteMovie() {
        return null;
    }
    
    @java.lang.Override()
    public void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.andi.amov.core.domain.model.Movie movie, boolean state) {
    }
}