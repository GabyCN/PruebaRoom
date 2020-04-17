package database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class TaskDatabase_Impl extends TaskDatabase {
  private volatile TaskDao _taskDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `task_entity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `isDone` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"ed19901c52849b714e82b9275f72825a\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `task_entity`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTaskEntity = new HashMap<String, TableInfo.Column>(3);
        _columnsTaskEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsTaskEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsTaskEntity.put("isDone", new TableInfo.Column("isDone", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTaskEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTaskEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTaskEntity = new TableInfo("task_entity", _columnsTaskEntity, _foreignKeysTaskEntity, _indicesTaskEntity);
        final TableInfo _existingTaskEntity = TableInfo.read(_db, "task_entity");
        if (! _infoTaskEntity.equals(_existingTaskEntity)) {
          throw new IllegalStateException("Migration didn't properly handle task_entity(database.TaskEntity).\n"
                  + " Expected:\n" + _infoTaskEntity + "\n"
                  + " Found:\n" + _existingTaskEntity);
        }
      }
    }, "ed19901c52849b714e82b9275f72825a", "5f1c586ea1c69c9067779d472ec2b399");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "task_entity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `task_entity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TaskDao taskDao() {
    if (_taskDao != null) {
      return _taskDao;
    } else {
      synchronized(this) {
        if(_taskDao == null) {
          _taskDao = new TaskDao_Impl(this);
        }
        return _taskDao;
      }
    }
  }
}
