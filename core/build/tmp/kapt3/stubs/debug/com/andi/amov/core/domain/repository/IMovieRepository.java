package com.andi.amov.core.domain.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/andi/amov/core/domain/repository/IMovieRepository;", "", "getAllTourism", "Lkotlinx/coroutines/flow/Flow;", "Lcom/andi/amov/core/data/Resource;", "", "Lcom/andi/amov/core/domain/model/Movie;", "getFavoriteTourism", "setFavoriteTourism", "", "movie", "state", "", "core_debug"})
public abstract interface IMovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.andi.amov.core.data.Resource<java.util.List<com.andi.amov.core.domain.model.Movie>>> getAllTourism();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.andi.amov.core.domain.model.Movie>> getFavoriteTourism();
    
    public abstract void setFavoriteTourism(@org.jetbrains.annotations.NotNull()
    com.andi.amov.core.domain.model.Movie movie, boolean state);
}