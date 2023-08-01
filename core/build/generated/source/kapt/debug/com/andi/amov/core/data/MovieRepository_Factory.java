// Generated by Dagger (https://dagger.dev).
package com.andi.amov.core.data;

import com.andi.amov.core.data.source.local.LocalDataSource;
import com.andi.amov.core.data.source.remote.RemoteDataSource;
import com.dicoding.tourismapp.core.utils.AppExecutors;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieRepository_Factory implements Factory<MovieRepository> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<LocalDataSource> localDataSourceProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public MovieRepository_Factory(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<LocalDataSource> localDataSourceProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  @Override
  public MovieRepository get() {
    return newInstance(remoteDataSourceProvider.get(), localDataSourceProvider.get(), appExecutorsProvider.get());
  }

  public static MovieRepository_Factory create(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<LocalDataSource> localDataSourceProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new MovieRepository_Factory(remoteDataSourceProvider, localDataSourceProvider, appExecutorsProvider);
  }

  public static MovieRepository newInstance(RemoteDataSource remoteDataSource,
      LocalDataSource localDataSource, AppExecutors appExecutors) {
    return new MovieRepository(remoteDataSource, localDataSource, appExecutors);
  }
}
