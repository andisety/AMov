package com.dicoding.tourismapp.core.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppExecutors_Factory implements Factory<AppExecutors> {
  @Override
  public AppExecutors get() {
    return newInstance();
  }

  public static AppExecutors_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppExecutors newInstance() {
    return new AppExecutors();
  }

  private static final class InstanceHolder {
    private static final AppExecutors_Factory INSTANCE = new AppExecutors_Factory();
  }
}
