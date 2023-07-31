package com.andi.amov.core.data.source.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "movies")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003JY\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001d\u00a8\u00063"}, d2 = {"Lcom/andi/amov/core/data/source/local/entity/MovieEntity;", "", "movieId", "", "title", "", "poster_path", "popularity", "", "overview", "release_date", "vote_average", "isFavorite", "", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DZ)V", "()Z", "setFavorite", "(Z)V", "getMovieId", "()I", "setMovieId", "(I)V", "getOverview", "()Ljava/lang/String;", "setOverview", "(Ljava/lang/String;)V", "getPopularity", "()D", "setPopularity", "(D)V", "getPoster_path", "setPoster_path", "getRelease_date", "setRelease_date", "getTitle", "setTitle", "getVote_average", "setVote_average", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "core_debug"})
public final class MovieEntity {
    @androidx.room.ColumnInfo(name = "movieId")
    @androidx.room.PrimaryKey
    private int movieId;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "poster_path")
    private java.lang.String poster_path;
    @androidx.room.ColumnInfo(name = "popularity")
    private double popularity;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "overview")
    private java.lang.String overview;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "release_date")
    private java.lang.String release_date;
    @androidx.room.ColumnInfo(name = "vote_average")
    private double vote_average;
    @androidx.room.ColumnInfo(name = "isFavorite")
    private boolean isFavorite;
    
    @org.jetbrains.annotations.NotNull
    public final com.andi.amov.core.data.source.local.entity.MovieEntity copy(int movieId, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String poster_path, double popularity, @org.jetbrains.annotations.NotNull
    java.lang.String overview, @org.jetbrains.annotations.NotNull
    java.lang.String release_date, double vote_average, boolean isFavorite) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MovieEntity(int movieId, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String poster_path, double popularity, @org.jetbrains.annotations.NotNull
    java.lang.String overview, @org.jetbrains.annotations.NotNull
    java.lang.String release_date, double vote_average, boolean isFavorite) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getMovieId() {
        return 0;
    }
    
    public final void setMovieId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    public final void setPoster_path(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    public final void setPopularity(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    public final void setRelease_date(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getVote_average() {
        return 0.0;
    }
    
    public final void setVote_average(double p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
}