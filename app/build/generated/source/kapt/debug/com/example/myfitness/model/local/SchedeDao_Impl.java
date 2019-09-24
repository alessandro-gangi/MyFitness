package com.example.myfitness.model.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myfitness.model.dataClasses.Esercizio;
import com.example.myfitness.model.dataClasses.Scheda;
import com.example.myfitness.model.dataClasses.Utente;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SchedeDao_Impl implements SchedeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Scheda> __insertionAdapterOfScheda;

  private final DataConverter __dataConverter = new DataConverter();

  private final EntityDeletionOrUpdateAdapter<Scheda> __updateAdapterOfScheda;

  private final SharedSQLiteStatement __preparedStmtOfSetAsCurrentScheda;

  private final SharedSQLiteStatement __preparedStmtOfRemoveCurrentScheda;

  private final SharedSQLiteStatement __preparedStmtOfDeleteScheda;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllUserSchede;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllSchede;

  public SchedeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScheda = new EntityInsertionAdapter<Scheda>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `schede_table` (`schedaId`,`num_giorni`,`data`,`tipo`,`commento`,`esercizi`,`is_current`,`autore_usernameId`,`autore_mail`,`autore_password`,`autore_flagAllenatore`,`autore_nome`,`autore_cognome`,`autore_eta`,`autore_descrizione`,`autore_imageURI`,`autore_peso`,`autore_altezza`,`autore_genere`,`autore_allenatore`,`possessore_usernameId`,`possessore_mail`,`possessore_password`,`possessore_flagAllenatore`,`possessore_nome`,`possessore_cognome`,`possessore_eta`,`possessore_descrizione`,`possessore_imageURI`,`possessore_peso`,`possessore_altezza`,`possessore_genere`,`possessore_allenatore`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Scheda value) {
        stmt.bindLong(1, value.getSchedaId());
        stmt.bindLong(2, value.getNum_giorni());
        if (value.getData() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getData());
        }
        if (value.getTipo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTipo());
        }
        if (value.getCommento() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCommento());
        }
        final String _tmp;
        _tmp = __dataConverter.eserciziToString(value.getEsercizi());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.is_current() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        final Utente _tmpAutore = value.getAutore();
        if(_tmpAutore != null) {
          if (_tmpAutore.getUsernameId() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpAutore.getUsernameId());
          }
          if (_tmpAutore.getMail() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpAutore.getMail());
          }
          if (_tmpAutore.getPassword() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpAutore.getPassword());
          }
          final int _tmp_2;
          _tmp_2 = _tmpAutore.getFlagAllenatore() ? 1 : 0;
          stmt.bindLong(11, _tmp_2);
          if (_tmpAutore.getNome() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpAutore.getNome());
          }
          if (_tmpAutore.getCognome() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpAutore.getCognome());
          }
          if (_tmpAutore.getEta() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindLong(14, _tmpAutore.getEta());
          }
          if (_tmpAutore.getDescrizione() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpAutore.getDescrizione());
          }
          if (_tmpAutore.getImageURI() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpAutore.getImageURI());
          }
          if (_tmpAutore.getPeso() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindDouble(17, _tmpAutore.getPeso());
          }
          if (_tmpAutore.getAltezza() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindLong(18, _tmpAutore.getAltezza());
          }
          stmt.bindLong(19, _tmpAutore.getGenere());
          if (_tmpAutore.getAllenatore() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpAutore.getAllenatore());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
        }
        final Utente _tmpPossessore = value.getPossessore();
        if(_tmpPossessore != null) {
          if (_tmpPossessore.getUsernameId() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpPossessore.getUsernameId());
          }
          if (_tmpPossessore.getMail() == null) {
            stmt.bindNull(22);
          } else {
            stmt.bindString(22, _tmpPossessore.getMail());
          }
          if (_tmpPossessore.getPassword() == null) {
            stmt.bindNull(23);
          } else {
            stmt.bindString(23, _tmpPossessore.getPassword());
          }
          final int _tmp_3;
          _tmp_3 = _tmpPossessore.getFlagAllenatore() ? 1 : 0;
          stmt.bindLong(24, _tmp_3);
          if (_tmpPossessore.getNome() == null) {
            stmt.bindNull(25);
          } else {
            stmt.bindString(25, _tmpPossessore.getNome());
          }
          if (_tmpPossessore.getCognome() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpPossessore.getCognome());
          }
          if (_tmpPossessore.getEta() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindLong(27, _tmpPossessore.getEta());
          }
          if (_tmpPossessore.getDescrizione() == null) {
            stmt.bindNull(28);
          } else {
            stmt.bindString(28, _tmpPossessore.getDescrizione());
          }
          if (_tmpPossessore.getImageURI() == null) {
            stmt.bindNull(29);
          } else {
            stmt.bindString(29, _tmpPossessore.getImageURI());
          }
          if (_tmpPossessore.getPeso() == null) {
            stmt.bindNull(30);
          } else {
            stmt.bindDouble(30, _tmpPossessore.getPeso());
          }
          if (_tmpPossessore.getAltezza() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindLong(31, _tmpPossessore.getAltezza());
          }
          stmt.bindLong(32, _tmpPossessore.getGenere());
          if (_tmpPossessore.getAllenatore() == null) {
            stmt.bindNull(33);
          } else {
            stmt.bindString(33, _tmpPossessore.getAllenatore());
          }
        } else {
          stmt.bindNull(21);
          stmt.bindNull(22);
          stmt.bindNull(23);
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
          stmt.bindNull(27);
          stmt.bindNull(28);
          stmt.bindNull(29);
          stmt.bindNull(30);
          stmt.bindNull(31);
          stmt.bindNull(32);
          stmt.bindNull(33);
        }
      }
    };
    this.__updateAdapterOfScheda = new EntityDeletionOrUpdateAdapter<Scheda>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `schede_table` SET `schedaId` = ?,`num_giorni` = ?,`data` = ?,`tipo` = ?,`commento` = ?,`esercizi` = ?,`is_current` = ?,`autore_usernameId` = ?,`autore_mail` = ?,`autore_password` = ?,`autore_flagAllenatore` = ?,`autore_nome` = ?,`autore_cognome` = ?,`autore_eta` = ?,`autore_descrizione` = ?,`autore_imageURI` = ?,`autore_peso` = ?,`autore_altezza` = ?,`autore_genere` = ?,`autore_allenatore` = ?,`possessore_usernameId` = ?,`possessore_mail` = ?,`possessore_password` = ?,`possessore_flagAllenatore` = ?,`possessore_nome` = ?,`possessore_cognome` = ?,`possessore_eta` = ?,`possessore_descrizione` = ?,`possessore_imageURI` = ?,`possessore_peso` = ?,`possessore_altezza` = ?,`possessore_genere` = ?,`possessore_allenatore` = ? WHERE `schedaId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Scheda value) {
        stmt.bindLong(1, value.getSchedaId());
        stmt.bindLong(2, value.getNum_giorni());
        if (value.getData() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getData());
        }
        if (value.getTipo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTipo());
        }
        if (value.getCommento() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCommento());
        }
        final String _tmp;
        _tmp = __dataConverter.eserciziToString(value.getEsercizi());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.is_current() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        final Utente _tmpAutore = value.getAutore();
        if(_tmpAutore != null) {
          if (_tmpAutore.getUsernameId() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpAutore.getUsernameId());
          }
          if (_tmpAutore.getMail() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpAutore.getMail());
          }
          if (_tmpAutore.getPassword() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpAutore.getPassword());
          }
          final int _tmp_2;
          _tmp_2 = _tmpAutore.getFlagAllenatore() ? 1 : 0;
          stmt.bindLong(11, _tmp_2);
          if (_tmpAutore.getNome() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpAutore.getNome());
          }
          if (_tmpAutore.getCognome() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpAutore.getCognome());
          }
          if (_tmpAutore.getEta() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindLong(14, _tmpAutore.getEta());
          }
          if (_tmpAutore.getDescrizione() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpAutore.getDescrizione());
          }
          if (_tmpAutore.getImageURI() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpAutore.getImageURI());
          }
          if (_tmpAutore.getPeso() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindDouble(17, _tmpAutore.getPeso());
          }
          if (_tmpAutore.getAltezza() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindLong(18, _tmpAutore.getAltezza());
          }
          stmt.bindLong(19, _tmpAutore.getGenere());
          if (_tmpAutore.getAllenatore() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpAutore.getAllenatore());
          }
        } else {
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
        }
        final Utente _tmpPossessore = value.getPossessore();
        if(_tmpPossessore != null) {
          if (_tmpPossessore.getUsernameId() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpPossessore.getUsernameId());
          }
          if (_tmpPossessore.getMail() == null) {
            stmt.bindNull(22);
          } else {
            stmt.bindString(22, _tmpPossessore.getMail());
          }
          if (_tmpPossessore.getPassword() == null) {
            stmt.bindNull(23);
          } else {
            stmt.bindString(23, _tmpPossessore.getPassword());
          }
          final int _tmp_3;
          _tmp_3 = _tmpPossessore.getFlagAllenatore() ? 1 : 0;
          stmt.bindLong(24, _tmp_3);
          if (_tmpPossessore.getNome() == null) {
            stmt.bindNull(25);
          } else {
            stmt.bindString(25, _tmpPossessore.getNome());
          }
          if (_tmpPossessore.getCognome() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpPossessore.getCognome());
          }
          if (_tmpPossessore.getEta() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindLong(27, _tmpPossessore.getEta());
          }
          if (_tmpPossessore.getDescrizione() == null) {
            stmt.bindNull(28);
          } else {
            stmt.bindString(28, _tmpPossessore.getDescrizione());
          }
          if (_tmpPossessore.getImageURI() == null) {
            stmt.bindNull(29);
          } else {
            stmt.bindString(29, _tmpPossessore.getImageURI());
          }
          if (_tmpPossessore.getPeso() == null) {
            stmt.bindNull(30);
          } else {
            stmt.bindDouble(30, _tmpPossessore.getPeso());
          }
          if (_tmpPossessore.getAltezza() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindLong(31, _tmpPossessore.getAltezza());
          }
          stmt.bindLong(32, _tmpPossessore.getGenere());
          if (_tmpPossessore.getAllenatore() == null) {
            stmt.bindNull(33);
          } else {
            stmt.bindString(33, _tmpPossessore.getAllenatore());
          }
        } else {
          stmt.bindNull(21);
          stmt.bindNull(22);
          stmt.bindNull(23);
          stmt.bindNull(24);
          stmt.bindNull(25);
          stmt.bindNull(26);
          stmt.bindNull(27);
          stmt.bindNull(28);
          stmt.bindNull(29);
          stmt.bindNull(30);
          stmt.bindNull(31);
          stmt.bindNull(32);
          stmt.bindNull(33);
        }
        stmt.bindLong(34, value.getSchedaId());
      }
    };
    this.__preparedStmtOfSetAsCurrentScheda = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE schede_table SET is_current = 1 WHERE possessore_usernameId = ? AND schedaId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveCurrentScheda = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE schede_table SET is_current = 0 WHERE possessore_usernameId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteScheda = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM schede_table WHERE schedaId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllUserSchede = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM schede_table WHERE possessore_usernameId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllSchede = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM schede_table WHERE 1 = 1";
        return _query;
      }
    };
  }

  @Override
  public void addScheda(final Scheda scheda) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfScheda.insert(scheda);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addSchede(final List<Scheda> scheda) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfScheda.insert(scheda);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateScheda(final Scheda scheda) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfScheda.handle(scheda);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void setAsCurrentScheda(final int idScheda, final String username) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetAsCurrentScheda.acquire();
    int _argIndex = 1;
    if (username == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, username);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, idScheda);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetAsCurrentScheda.release(_stmt);
    }
  }

  @Override
  public void removeCurrentScheda(final String username) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveCurrentScheda.acquire();
    int _argIndex = 1;
    if (username == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, username);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveCurrentScheda.release(_stmt);
    }
  }

  @Override
  public void deleteScheda(final int schedaId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteScheda.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, schedaId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteScheda.release(_stmt);
    }
  }

  @Override
  public void deleteAllUserSchede(final String username) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllUserSchede.acquire();
    int _argIndex = 1;
    if (username == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, username);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllUserSchede.release(_stmt);
    }
  }

  @Override
  public void deleteAllSchede() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllSchede.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllSchede.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Scheda>> getAllSchede() {
    final String _sql = "SELECT * from schede_table ORDER BY data ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"schede_table"}, false, new Callable<List<Scheda>>() {
      @Override
      public List<Scheda> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSchedaId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedaId");
          final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "num_giorni");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
          final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
          final int _cursorIndexOfEsercizi = CursorUtil.getColumnIndexOrThrow(_cursor, "esercizi");
          final int _cursorIndexOfIsCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "is_current");
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_allenatore");
          final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_usernameId");
          final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_mail");
          final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_password");
          final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_flagAllenatore");
          final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_nome");
          final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_cognome");
          final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_eta");
          final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_descrizione");
          final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_imageURI");
          final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_peso");
          final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_altezza");
          final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_genere");
          final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_allenatore");
          final List<Scheda> _result = new ArrayList<Scheda>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Scheda _item;
            final int _tmpSchedaId;
            _tmpSchedaId = _cursor.getInt(_cursorIndexOfSchedaId);
            final int _tmpNum_giorni;
            _tmpNum_giorni = _cursor.getInt(_cursorIndexOfNumGiorni);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final String _tmpTipo;
            _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
            final String _tmpCommento;
            _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
            final ArrayList<ArrayList<Esercizio>> _tmpEsercizi;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfEsercizi);
            _tmpEsercizi = __dataConverter.stringToEsercizi(_tmp);
            final boolean _tmpIs_current;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsCurrent);
            _tmpIs_current = _tmp_1 != 0;
            final Utente _tmpAutore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
              final String _tmpUsernameId;
              _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
              final String _tmpMail;
              _tmpMail = _cursor.getString(_cursorIndexOfMail);
              final String _tmpPassword;
              _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
              final boolean _tmpFlagAllenatore;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfFlagAllenatore);
              _tmpFlagAllenatore = _tmp_2 != 0;
              final String _tmpNome;
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
              final String _tmpCognome;
              _tmpCognome = _cursor.getString(_cursorIndexOfCognome);
              final Integer _tmpEta;
              if (_cursor.isNull(_cursorIndexOfEta)) {
                _tmpEta = null;
              } else {
                _tmpEta = _cursor.getInt(_cursorIndexOfEta);
              }
              final String _tmpDescrizione;
              _tmpDescrizione = _cursor.getString(_cursorIndexOfDescrizione);
              final String _tmpImageURI;
              _tmpImageURI = _cursor.getString(_cursorIndexOfImageURI);
              final Double _tmpPeso;
              if (_cursor.isNull(_cursorIndexOfPeso)) {
                _tmpPeso = null;
              } else {
                _tmpPeso = _cursor.getDouble(_cursorIndexOfPeso);
              }
              final Integer _tmpAltezza;
              if (_cursor.isNull(_cursorIndexOfAltezza)) {
                _tmpAltezza = null;
              } else {
                _tmpAltezza = _cursor.getInt(_cursorIndexOfAltezza);
              }
              final char _tmpGenere;
              _tmpGenere = (char) _cursor.getInt(_cursorIndexOfGenere);
              final String _tmpAllenatore;
              _tmpAllenatore = _cursor.getString(_cursorIndexOfAllenatore);
              _tmpAutore = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
            }  else  {
              _tmpAutore = null;
            }
            final Utente _tmpPossessore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
              final String _tmpUsernameId_1;
              _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
              final String _tmpMail_1;
              _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
              final String _tmpPassword_1;
              _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
              final boolean _tmpFlagAllenatore_1;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
              _tmpFlagAllenatore_1 = _tmp_3 != 0;
              final String _tmpNome_1;
              _tmpNome_1 = _cursor.getString(_cursorIndexOfNome_1);
              final String _tmpCognome_1;
              _tmpCognome_1 = _cursor.getString(_cursorIndexOfCognome_1);
              final Integer _tmpEta_1;
              if (_cursor.isNull(_cursorIndexOfEta_1)) {
                _tmpEta_1 = null;
              } else {
                _tmpEta_1 = _cursor.getInt(_cursorIndexOfEta_1);
              }
              final String _tmpDescrizione_1;
              _tmpDescrizione_1 = _cursor.getString(_cursorIndexOfDescrizione_1);
              final String _tmpImageURI_1;
              _tmpImageURI_1 = _cursor.getString(_cursorIndexOfImageURI_1);
              final Double _tmpPeso_1;
              if (_cursor.isNull(_cursorIndexOfPeso_1)) {
                _tmpPeso_1 = null;
              } else {
                _tmpPeso_1 = _cursor.getDouble(_cursorIndexOfPeso_1);
              }
              final Integer _tmpAltezza_1;
              if (_cursor.isNull(_cursorIndexOfAltezza_1)) {
                _tmpAltezza_1 = null;
              } else {
                _tmpAltezza_1 = _cursor.getInt(_cursorIndexOfAltezza_1);
              }
              final char _tmpGenere_1;
              _tmpGenere_1 = (char) _cursor.getInt(_cursorIndexOfGenere_1);
              final String _tmpAllenatore_1;
              _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore_1);
              _tmpPossessore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_1);
            }  else  {
              _tmpPossessore = null;
            }
            _item = new Scheda(_tmpSchedaId,_tmpNum_giorni,_tmpData,_tmpTipo,_tmpCommento,_tmpAutore,_tmpPossessore,_tmpEsercizi,_tmpIs_current);
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
  public Scheda getScheda(final int schedaId) {
    final String _sql = "SELECT * FROM schede_table WHERE schedaId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, schedaId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSchedaId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedaId");
      final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "num_giorni");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
      final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
      final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
      final int _cursorIndexOfEsercizi = CursorUtil.getColumnIndexOrThrow(_cursor, "esercizi");
      final int _cursorIndexOfIsCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "is_current");
      final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_usernameId");
      final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_mail");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_password");
      final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_flagAllenatore");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_nome");
      final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_cognome");
      final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_eta");
      final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_descrizione");
      final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_imageURI");
      final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_peso");
      final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_altezza");
      final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_genere");
      final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_allenatore");
      final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_usernameId");
      final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_mail");
      final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_password");
      final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_flagAllenatore");
      final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_nome");
      final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_cognome");
      final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_eta");
      final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_descrizione");
      final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_imageURI");
      final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_peso");
      final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_altezza");
      final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_genere");
      final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_allenatore");
      final Scheda _result;
      if(_cursor.moveToFirst()) {
        final int _tmpSchedaId;
        _tmpSchedaId = _cursor.getInt(_cursorIndexOfSchedaId);
        final int _tmpNum_giorni;
        _tmpNum_giorni = _cursor.getInt(_cursorIndexOfNumGiorni);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        final String _tmpTipo;
        _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
        final String _tmpCommento;
        _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
        final ArrayList<ArrayList<Esercizio>> _tmpEsercizi;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfEsercizi);
        _tmpEsercizi = __dataConverter.stringToEsercizi(_tmp);
        final boolean _tmpIs_current;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsCurrent);
        _tmpIs_current = _tmp_1 != 0;
        final Utente _tmpAutore;
        if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
          final String _tmpUsernameId;
          _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
          final String _tmpMail;
          _tmpMail = _cursor.getString(_cursorIndexOfMail);
          final String _tmpPassword;
          _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
          final boolean _tmpFlagAllenatore;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfFlagAllenatore);
          _tmpFlagAllenatore = _tmp_2 != 0;
          final String _tmpNome;
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
          final String _tmpCognome;
          _tmpCognome = _cursor.getString(_cursorIndexOfCognome);
          final Integer _tmpEta;
          if (_cursor.isNull(_cursorIndexOfEta)) {
            _tmpEta = null;
          } else {
            _tmpEta = _cursor.getInt(_cursorIndexOfEta);
          }
          final String _tmpDescrizione;
          _tmpDescrizione = _cursor.getString(_cursorIndexOfDescrizione);
          final String _tmpImageURI;
          _tmpImageURI = _cursor.getString(_cursorIndexOfImageURI);
          final Double _tmpPeso;
          if (_cursor.isNull(_cursorIndexOfPeso)) {
            _tmpPeso = null;
          } else {
            _tmpPeso = _cursor.getDouble(_cursorIndexOfPeso);
          }
          final Integer _tmpAltezza;
          if (_cursor.isNull(_cursorIndexOfAltezza)) {
            _tmpAltezza = null;
          } else {
            _tmpAltezza = _cursor.getInt(_cursorIndexOfAltezza);
          }
          final char _tmpGenere;
          _tmpGenere = (char) _cursor.getInt(_cursorIndexOfGenere);
          final String _tmpAllenatore;
          _tmpAllenatore = _cursor.getString(_cursorIndexOfAllenatore);
          _tmpAutore = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
        }  else  {
          _tmpAutore = null;
        }
        final Utente _tmpPossessore;
        if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
          final String _tmpUsernameId_1;
          _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
          final String _tmpMail_1;
          _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
          final String _tmpPassword_1;
          _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
          final boolean _tmpFlagAllenatore_1;
          final int _tmp_3;
          _tmp_3 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
          _tmpFlagAllenatore_1 = _tmp_3 != 0;
          final String _tmpNome_1;
          _tmpNome_1 = _cursor.getString(_cursorIndexOfNome_1);
          final String _tmpCognome_1;
          _tmpCognome_1 = _cursor.getString(_cursorIndexOfCognome_1);
          final Integer _tmpEta_1;
          if (_cursor.isNull(_cursorIndexOfEta_1)) {
            _tmpEta_1 = null;
          } else {
            _tmpEta_1 = _cursor.getInt(_cursorIndexOfEta_1);
          }
          final String _tmpDescrizione_1;
          _tmpDescrizione_1 = _cursor.getString(_cursorIndexOfDescrizione_1);
          final String _tmpImageURI_1;
          _tmpImageURI_1 = _cursor.getString(_cursorIndexOfImageURI_1);
          final Double _tmpPeso_1;
          if (_cursor.isNull(_cursorIndexOfPeso_1)) {
            _tmpPeso_1 = null;
          } else {
            _tmpPeso_1 = _cursor.getDouble(_cursorIndexOfPeso_1);
          }
          final Integer _tmpAltezza_1;
          if (_cursor.isNull(_cursorIndexOfAltezza_1)) {
            _tmpAltezza_1 = null;
          } else {
            _tmpAltezza_1 = _cursor.getInt(_cursorIndexOfAltezza_1);
          }
          final char _tmpGenere_1;
          _tmpGenere_1 = (char) _cursor.getInt(_cursorIndexOfGenere_1);
          final String _tmpAllenatore_1;
          _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore_1);
          _tmpPossessore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_1);
        }  else  {
          _tmpPossessore = null;
        }
        _result = new Scheda(_tmpSchedaId,_tmpNum_giorni,_tmpData,_tmpTipo,_tmpCommento,_tmpAutore,_tmpPossessore,_tmpEsercizi,_tmpIs_current);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Scheda>> getUserSchede(final String username) {
    final String _sql = "SELECT * FROM schede_table WHERE possessore_usernameId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"schede_table"}, false, new Callable<List<Scheda>>() {
      @Override
      public List<Scheda> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSchedaId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedaId");
          final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "num_giorni");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
          final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
          final int _cursorIndexOfEsercizi = CursorUtil.getColumnIndexOrThrow(_cursor, "esercizi");
          final int _cursorIndexOfIsCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "is_current");
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_allenatore");
          final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_usernameId");
          final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_mail");
          final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_password");
          final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_flagAllenatore");
          final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_nome");
          final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_cognome");
          final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_eta");
          final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_descrizione");
          final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_imageURI");
          final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_peso");
          final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_altezza");
          final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_genere");
          final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_allenatore");
          final List<Scheda> _result = new ArrayList<Scheda>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Scheda _item;
            final int _tmpSchedaId;
            _tmpSchedaId = _cursor.getInt(_cursorIndexOfSchedaId);
            final int _tmpNum_giorni;
            _tmpNum_giorni = _cursor.getInt(_cursorIndexOfNumGiorni);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final String _tmpTipo;
            _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
            final String _tmpCommento;
            _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
            final ArrayList<ArrayList<Esercizio>> _tmpEsercizi;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfEsercizi);
            _tmpEsercizi = __dataConverter.stringToEsercizi(_tmp);
            final boolean _tmpIs_current;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsCurrent);
            _tmpIs_current = _tmp_1 != 0;
            final Utente _tmpAutore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
              final String _tmpUsernameId;
              _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
              final String _tmpMail;
              _tmpMail = _cursor.getString(_cursorIndexOfMail);
              final String _tmpPassword;
              _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
              final boolean _tmpFlagAllenatore;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfFlagAllenatore);
              _tmpFlagAllenatore = _tmp_2 != 0;
              final String _tmpNome;
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
              final String _tmpCognome;
              _tmpCognome = _cursor.getString(_cursorIndexOfCognome);
              final Integer _tmpEta;
              if (_cursor.isNull(_cursorIndexOfEta)) {
                _tmpEta = null;
              } else {
                _tmpEta = _cursor.getInt(_cursorIndexOfEta);
              }
              final String _tmpDescrizione;
              _tmpDescrizione = _cursor.getString(_cursorIndexOfDescrizione);
              final String _tmpImageURI;
              _tmpImageURI = _cursor.getString(_cursorIndexOfImageURI);
              final Double _tmpPeso;
              if (_cursor.isNull(_cursorIndexOfPeso)) {
                _tmpPeso = null;
              } else {
                _tmpPeso = _cursor.getDouble(_cursorIndexOfPeso);
              }
              final Integer _tmpAltezza;
              if (_cursor.isNull(_cursorIndexOfAltezza)) {
                _tmpAltezza = null;
              } else {
                _tmpAltezza = _cursor.getInt(_cursorIndexOfAltezza);
              }
              final char _tmpGenere;
              _tmpGenere = (char) _cursor.getInt(_cursorIndexOfGenere);
              final String _tmpAllenatore;
              _tmpAllenatore = _cursor.getString(_cursorIndexOfAllenatore);
              _tmpAutore = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
            }  else  {
              _tmpAutore = null;
            }
            final Utente _tmpPossessore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
              final String _tmpUsernameId_1;
              _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
              final String _tmpMail_1;
              _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
              final String _tmpPassword_1;
              _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
              final boolean _tmpFlagAllenatore_1;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
              _tmpFlagAllenatore_1 = _tmp_3 != 0;
              final String _tmpNome_1;
              _tmpNome_1 = _cursor.getString(_cursorIndexOfNome_1);
              final String _tmpCognome_1;
              _tmpCognome_1 = _cursor.getString(_cursorIndexOfCognome_1);
              final Integer _tmpEta_1;
              if (_cursor.isNull(_cursorIndexOfEta_1)) {
                _tmpEta_1 = null;
              } else {
                _tmpEta_1 = _cursor.getInt(_cursorIndexOfEta_1);
              }
              final String _tmpDescrizione_1;
              _tmpDescrizione_1 = _cursor.getString(_cursorIndexOfDescrizione_1);
              final String _tmpImageURI_1;
              _tmpImageURI_1 = _cursor.getString(_cursorIndexOfImageURI_1);
              final Double _tmpPeso_1;
              if (_cursor.isNull(_cursorIndexOfPeso_1)) {
                _tmpPeso_1 = null;
              } else {
                _tmpPeso_1 = _cursor.getDouble(_cursorIndexOfPeso_1);
              }
              final Integer _tmpAltezza_1;
              if (_cursor.isNull(_cursorIndexOfAltezza_1)) {
                _tmpAltezza_1 = null;
              } else {
                _tmpAltezza_1 = _cursor.getInt(_cursorIndexOfAltezza_1);
              }
              final char _tmpGenere_1;
              _tmpGenere_1 = (char) _cursor.getInt(_cursorIndexOfGenere_1);
              final String _tmpAllenatore_1;
              _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore_1);
              _tmpPossessore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_1);
            }  else  {
              _tmpPossessore = null;
            }
            _item = new Scheda(_tmpSchedaId,_tmpNum_giorni,_tmpData,_tmpTipo,_tmpCommento,_tmpAutore,_tmpPossessore,_tmpEsercizi,_tmpIs_current);
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
  public LiveData<Scheda> getCurrentScheda(final String username) {
    final String _sql = "SELECT * FROM schede_table WHERE is_current = 1 AND possessore_usernameId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"schede_table"}, false, new Callable<Scheda>() {
      @Override
      public Scheda call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSchedaId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedaId");
          final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "num_giorni");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
          final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
          final int _cursorIndexOfEsercizi = CursorUtil.getColumnIndexOrThrow(_cursor, "esercizi");
          final int _cursorIndexOfIsCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "is_current");
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_allenatore");
          final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_usernameId");
          final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_mail");
          final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_password");
          final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_flagAllenatore");
          final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_nome");
          final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_cognome");
          final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_eta");
          final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_descrizione");
          final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_imageURI");
          final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_peso");
          final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_altezza");
          final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_genere");
          final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_allenatore");
          final Scheda _result;
          if(_cursor.moveToFirst()) {
            final int _tmpSchedaId;
            _tmpSchedaId = _cursor.getInt(_cursorIndexOfSchedaId);
            final int _tmpNum_giorni;
            _tmpNum_giorni = _cursor.getInt(_cursorIndexOfNumGiorni);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final String _tmpTipo;
            _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
            final String _tmpCommento;
            _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
            final ArrayList<ArrayList<Esercizio>> _tmpEsercizi;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfEsercizi);
            _tmpEsercizi = __dataConverter.stringToEsercizi(_tmp);
            final boolean _tmpIs_current;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsCurrent);
            _tmpIs_current = _tmp_1 != 0;
            final Utente _tmpAutore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
              final String _tmpUsernameId;
              _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
              final String _tmpMail;
              _tmpMail = _cursor.getString(_cursorIndexOfMail);
              final String _tmpPassword;
              _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
              final boolean _tmpFlagAllenatore;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfFlagAllenatore);
              _tmpFlagAllenatore = _tmp_2 != 0;
              final String _tmpNome;
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
              final String _tmpCognome;
              _tmpCognome = _cursor.getString(_cursorIndexOfCognome);
              final Integer _tmpEta;
              if (_cursor.isNull(_cursorIndexOfEta)) {
                _tmpEta = null;
              } else {
                _tmpEta = _cursor.getInt(_cursorIndexOfEta);
              }
              final String _tmpDescrizione;
              _tmpDescrizione = _cursor.getString(_cursorIndexOfDescrizione);
              final String _tmpImageURI;
              _tmpImageURI = _cursor.getString(_cursorIndexOfImageURI);
              final Double _tmpPeso;
              if (_cursor.isNull(_cursorIndexOfPeso)) {
                _tmpPeso = null;
              } else {
                _tmpPeso = _cursor.getDouble(_cursorIndexOfPeso);
              }
              final Integer _tmpAltezza;
              if (_cursor.isNull(_cursorIndexOfAltezza)) {
                _tmpAltezza = null;
              } else {
                _tmpAltezza = _cursor.getInt(_cursorIndexOfAltezza);
              }
              final char _tmpGenere;
              _tmpGenere = (char) _cursor.getInt(_cursorIndexOfGenere);
              final String _tmpAllenatore;
              _tmpAllenatore = _cursor.getString(_cursorIndexOfAllenatore);
              _tmpAutore = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
            }  else  {
              _tmpAutore = null;
            }
            final Utente _tmpPossessore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
              final String _tmpUsernameId_1;
              _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
              final String _tmpMail_1;
              _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
              final String _tmpPassword_1;
              _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
              final boolean _tmpFlagAllenatore_1;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
              _tmpFlagAllenatore_1 = _tmp_3 != 0;
              final String _tmpNome_1;
              _tmpNome_1 = _cursor.getString(_cursorIndexOfNome_1);
              final String _tmpCognome_1;
              _tmpCognome_1 = _cursor.getString(_cursorIndexOfCognome_1);
              final Integer _tmpEta_1;
              if (_cursor.isNull(_cursorIndexOfEta_1)) {
                _tmpEta_1 = null;
              } else {
                _tmpEta_1 = _cursor.getInt(_cursorIndexOfEta_1);
              }
              final String _tmpDescrizione_1;
              _tmpDescrizione_1 = _cursor.getString(_cursorIndexOfDescrizione_1);
              final String _tmpImageURI_1;
              _tmpImageURI_1 = _cursor.getString(_cursorIndexOfImageURI_1);
              final Double _tmpPeso_1;
              if (_cursor.isNull(_cursorIndexOfPeso_1)) {
                _tmpPeso_1 = null;
              } else {
                _tmpPeso_1 = _cursor.getDouble(_cursorIndexOfPeso_1);
              }
              final Integer _tmpAltezza_1;
              if (_cursor.isNull(_cursorIndexOfAltezza_1)) {
                _tmpAltezza_1 = null;
              } else {
                _tmpAltezza_1 = _cursor.getInt(_cursorIndexOfAltezza_1);
              }
              final char _tmpGenere_1;
              _tmpGenere_1 = (char) _cursor.getInt(_cursorIndexOfGenere_1);
              final String _tmpAllenatore_1;
              _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore_1);
              _tmpPossessore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_1);
            }  else  {
              _tmpPossessore = null;
            }
            _result = new Scheda(_tmpSchedaId,_tmpNum_giorni,_tmpData,_tmpTipo,_tmpCommento,_tmpAutore,_tmpPossessore,_tmpEsercizi,_tmpIs_current);
          } else {
            _result = null;
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
  public LiveData<List<Scheda>> getRichiesteCompletate(final String username) {
    final String _sql = "SELECT * FROM schede_table WHERE autore_usernameId = ? AND possessore_usernameId != ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    _argIndex = 2;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"schede_table"}, false, new Callable<List<Scheda>>() {
      @Override
      public List<Scheda> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSchedaId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedaId");
          final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "num_giorni");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfTipo = CursorUtil.getColumnIndexOrThrow(_cursor, "tipo");
          final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
          final int _cursorIndexOfEsercizi = CursorUtil.getColumnIndexOrThrow(_cursor, "esercizi");
          final int _cursorIndexOfIsCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "is_current");
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "autore_allenatore");
          final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_usernameId");
          final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_mail");
          final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_password");
          final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_flagAllenatore");
          final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_nome");
          final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_cognome");
          final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_eta");
          final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_descrizione");
          final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_imageURI");
          final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_peso");
          final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_altezza");
          final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_genere");
          final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "possessore_allenatore");
          final List<Scheda> _result = new ArrayList<Scheda>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Scheda _item;
            final int _tmpSchedaId;
            _tmpSchedaId = _cursor.getInt(_cursorIndexOfSchedaId);
            final int _tmpNum_giorni;
            _tmpNum_giorni = _cursor.getInt(_cursorIndexOfNumGiorni);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final String _tmpTipo;
            _tmpTipo = _cursor.getString(_cursorIndexOfTipo);
            final String _tmpCommento;
            _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
            final ArrayList<ArrayList<Esercizio>> _tmpEsercizi;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfEsercizi);
            _tmpEsercizi = __dataConverter.stringToEsercizi(_tmp);
            final boolean _tmpIs_current;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsCurrent);
            _tmpIs_current = _tmp_1 != 0;
            final Utente _tmpAutore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
              final String _tmpUsernameId;
              _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
              final String _tmpMail;
              _tmpMail = _cursor.getString(_cursorIndexOfMail);
              final String _tmpPassword;
              _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
              final boolean _tmpFlagAllenatore;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfFlagAllenatore);
              _tmpFlagAllenatore = _tmp_2 != 0;
              final String _tmpNome;
              _tmpNome = _cursor.getString(_cursorIndexOfNome);
              final String _tmpCognome;
              _tmpCognome = _cursor.getString(_cursorIndexOfCognome);
              final Integer _tmpEta;
              if (_cursor.isNull(_cursorIndexOfEta)) {
                _tmpEta = null;
              } else {
                _tmpEta = _cursor.getInt(_cursorIndexOfEta);
              }
              final String _tmpDescrizione;
              _tmpDescrizione = _cursor.getString(_cursorIndexOfDescrizione);
              final String _tmpImageURI;
              _tmpImageURI = _cursor.getString(_cursorIndexOfImageURI);
              final Double _tmpPeso;
              if (_cursor.isNull(_cursorIndexOfPeso)) {
                _tmpPeso = null;
              } else {
                _tmpPeso = _cursor.getDouble(_cursorIndexOfPeso);
              }
              final Integer _tmpAltezza;
              if (_cursor.isNull(_cursorIndexOfAltezza)) {
                _tmpAltezza = null;
              } else {
                _tmpAltezza = _cursor.getInt(_cursorIndexOfAltezza);
              }
              final char _tmpGenere;
              _tmpGenere = (char) _cursor.getInt(_cursorIndexOfGenere);
              final String _tmpAllenatore;
              _tmpAllenatore = _cursor.getString(_cursorIndexOfAllenatore);
              _tmpAutore = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
            }  else  {
              _tmpAutore = null;
            }
            final Utente _tmpPossessore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
              final String _tmpUsernameId_1;
              _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
              final String _tmpMail_1;
              _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
              final String _tmpPassword_1;
              _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
              final boolean _tmpFlagAllenatore_1;
              final int _tmp_3;
              _tmp_3 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
              _tmpFlagAllenatore_1 = _tmp_3 != 0;
              final String _tmpNome_1;
              _tmpNome_1 = _cursor.getString(_cursorIndexOfNome_1);
              final String _tmpCognome_1;
              _tmpCognome_1 = _cursor.getString(_cursorIndexOfCognome_1);
              final Integer _tmpEta_1;
              if (_cursor.isNull(_cursorIndexOfEta_1)) {
                _tmpEta_1 = null;
              } else {
                _tmpEta_1 = _cursor.getInt(_cursorIndexOfEta_1);
              }
              final String _tmpDescrizione_1;
              _tmpDescrizione_1 = _cursor.getString(_cursorIndexOfDescrizione_1);
              final String _tmpImageURI_1;
              _tmpImageURI_1 = _cursor.getString(_cursorIndexOfImageURI_1);
              final Double _tmpPeso_1;
              if (_cursor.isNull(_cursorIndexOfPeso_1)) {
                _tmpPeso_1 = null;
              } else {
                _tmpPeso_1 = _cursor.getDouble(_cursorIndexOfPeso_1);
              }
              final Integer _tmpAltezza_1;
              if (_cursor.isNull(_cursorIndexOfAltezza_1)) {
                _tmpAltezza_1 = null;
              } else {
                _tmpAltezza_1 = _cursor.getInt(_cursorIndexOfAltezza_1);
              }
              final char _tmpGenere_1;
              _tmpGenere_1 = (char) _cursor.getInt(_cursorIndexOfGenere_1);
              final String _tmpAllenatore_1;
              _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore_1);
              _tmpPossessore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_1);
            }  else  {
              _tmpPossessore = null;
            }
            _item = new Scheda(_tmpSchedaId,_tmpNum_giorni,_tmpData,_tmpTipo,_tmpCommento,_tmpAutore,_tmpPossessore,_tmpEsercizi,_tmpIs_current);
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
}
