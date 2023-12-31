// Generated by Dagger (https://dagger.dev).
package com.andi.amov.core.di;

import com.andi.amov.core.data.source.local.room.MovieDao;
import com.andi.amov.core.data.source.local.room.MovieDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideTourismDaoFactory implements Factory<MovieDao> {
  private final DatabaseModule module;

  private final Provider<MovieDatabase> databaseProvider;

  public DatabaseModule_ProvideTourismDaoFactory(DatabaseModule module,
      Provider<MovieDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MovieDao get() {
    return provideTourismDao(module, databaseProvider.get());
  }

  public static DatabaseModule_ProvideTourismDaoFactory create(DatabaseModule module,
      Provider<MovieDatabase> databaseProvider) {
    return new DatabaseModule_ProvideTourismDaoFactory(module, databaseProvider);
  }

  public static MovieDao provideTourismDao(DatabaseModule instance, MovieDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideTourismDao(database));
  }
}
