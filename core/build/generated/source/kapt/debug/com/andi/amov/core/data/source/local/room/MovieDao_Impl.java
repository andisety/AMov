package com.andi.amov.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.andi.amov.core.data.source.local.entity.MovieEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __updateAdapterOfMovieEntity;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movies` (`movieId`,`title`,`poster_path`,`popularity`,`overview`,`release_date`,`vote_average`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getMovieId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPoster_path() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPoster_path());
        }
        stmt.bindDouble(4, value.getPopularity());
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRelease_date());
        }
        stmt.bindDouble(7, value.getVote_average());
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__updateAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `movies` SET `movieId` = ?,`title` = ?,`poster_path` = ?,`popularity` = ?,`overview` = ?,`release_date` = ?,`vote_average` = ?,`isFavorite` = ? WHERE `movieId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getMovieId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPoster_path() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPoster_path());
        }
        stmt.bindDouble(4, value.getPopularity());
        if (value.getOverview() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOverview());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getRelease_date());
        }
        stmt.bindDouble(7, value.getVote_average());
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        stmt.bindLong(9, value.getMovieId());
      }
    };
  }

  @Override
  public Object insertTourism(final List<MovieEntity> tourism,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(tourism);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void updateFavoriteTourism(final MovieEntity tourism) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMovieEntity.handle(tourism);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<MovieEntity>> getAllTourism() {
    final String _sql = "SELECT * FROM movies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movies"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movieId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpMovieId;
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpPoster_path;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPoster_path = null;
            } else {
              _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpRelease_date;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpRelease_date = null;
            } else {
              _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final double _tmpVote_average;
            _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new MovieEntity(_tmpMovieId,_tmpTitle,_tmpPoster_path,_tmpPopularity,_tmpOverview,_tmpRelease_date,_tmpVote_average,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getFavoriteTourism() {
    final String _sql = "SELECT * FROM movies where isFavorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movies"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movieId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final int _tmpMovieId;
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpPoster_path;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPoster_path = null;
            } else {
              _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpRelease_date;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpRelease_date = null;
            } else {
              _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final double _tmpVote_average;
            _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new MovieEntity(_tmpMovieId,_tmpTitle,_tmpPoster_path,_tmpPopularity,_tmpOverview,_tmpRelease_date,_tmpVote_average,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
