package database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTaskEntity;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskEntity = new EntityInsertionAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `task_entity`(`id`,`name`,`isDone`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp;
        _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(3, _tmp);
      }
    };
    this.__deletionAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `task_entity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `task_entity` SET `id` = ?,`name` = ?,`isDone` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final int _tmp;
        _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public long addTask(TaskEntity taskEntity) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTaskEntity.insertAndReturnId(taskEntity);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteTask(TaskEntity taskEntity) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfTaskEntity.handle(taskEntity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateTask(TaskEntity taskEntity) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfTaskEntity.handle(taskEntity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<TaskEntity> getAllTask() {
    final String _sql = "SELECT * FROM task_entity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfIsDone = _cursor.getColumnIndexOrThrow("isDone");
      final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TaskEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final boolean _tmpIsDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsDone);
        _tmpIsDone = _tmp != 0;
        _item = new TaskEntity(_tmpId,_tmpName,_tmpIsDone);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TaskEntity getTaskById(long id) {
    final String _sql = "SELECT * FROM task_entity where id like ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfIsDone = _cursor.getColumnIndexOrThrow("isDone");
      final TaskEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final boolean _tmpIsDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsDone);
        _tmpIsDone = _tmp != 0;
        _result = new TaskEntity(_tmpId,_tmpName,_tmpIsDone);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
