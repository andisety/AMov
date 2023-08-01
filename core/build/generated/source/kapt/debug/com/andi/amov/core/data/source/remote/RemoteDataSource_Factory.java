package com.andi.amov.core.data.source.remote;

import com.andi.amov.core.data.source.remote.network.ApiService;
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
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<ApiService> apiServiceProvider;

  public RemoteDataSource_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RemoteDataSource_Factory create(Provider<ApiService> apiServiceProvider) {
    return new RemoteDataSource_Factory(apiServiceProvider);
  }

  public static RemoteDataSource newInstance(ApiService apiService) {
    return new RemoteDataSource(apiService);
  }
}
