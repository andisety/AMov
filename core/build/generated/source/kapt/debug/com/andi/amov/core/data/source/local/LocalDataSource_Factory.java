package com.andi.amov.core.data.source.local;

import com.andi.amov.core.data.source.local.room.MovieDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataSource_Factory implements Factory<LocalDataSource> {
  private final Provider<MovieDao> movieDaoProvider;

  public LocalDataSource_Factory(Provider<MovieDao> movieDaoProvider) {
    this.movieDaoProvider = movieDaoProvider;
  }

  @Override
  public LocalDataSource get() {
    return newInstance(movieDaoProvider.get());
  }

  public static LocalDataSource_Factory create(Provider<MovieDao> movieDaoProvider) {
    return new LocalDataSource_Factory(movieDaoProvider);
  }

  public static LocalDataSource newInstance(MovieDao movieDao) {
    return new LocalDataSource(movieDao);
  }
}
