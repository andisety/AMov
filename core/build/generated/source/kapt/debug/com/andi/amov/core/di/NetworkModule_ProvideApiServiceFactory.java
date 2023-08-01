package com.andi.amov.core.di;

import com.andi.amov.core.data.source.remote.network.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvideApiServiceFactory(NetworkModule module,
      Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(module, clientProvider.get());
  }

  public static NetworkModule_ProvideApiServiceFactory create(NetworkModule module,
      Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvideApiServiceFactory(module, clientProvider);
  }

  public static ApiService provideApiService(NetworkModule instance, OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiService(client));
  }
}
