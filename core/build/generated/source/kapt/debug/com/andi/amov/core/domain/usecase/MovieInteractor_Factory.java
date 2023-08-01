package com.andi.amov.core.domain.usecase;

import com.andi.amov.core.domain.repository.IMovieRepository;
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
public final class MovieInteractor_Factory implements Factory<MovieInteractor> {
  private final Provider<IMovieRepository> movieRepositoryProvider;

  public MovieInteractor_Factory(Provider<IMovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public MovieInteractor get() {
    return newInstance(movieRepositoryProvider.get());
  }

  public static MovieInteractor_Factory create(Provider<IMovieRepository> movieRepositoryProvider) {
    return new MovieInteractor_Factory(movieRepositoryProvider);
  }

  public static MovieInteractor newInstance(IMovieRepository movieRepository) {
    return new MovieInteractor(movieRepository);
  }
}
