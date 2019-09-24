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
public final class UtentiDao_Impl implements UtentiDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Utente> __insertionAdapterOfUtente;

  private final EntityDeletionOrUpdateAdapter<Utente> __updateAdapterOfUtente;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUtente;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllUtenti;

  public UtentiDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUtente = new EntityInsertionAdapter<Utente>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `utenti_table` (`usernameId`,`mail`,`password`,`flagAllenatore`,`nome`,`cognome`,`eta`,`descrizione`,`imageURI`,`peso`,`altezza`,`genere`,`allenatore`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Utente value) {
        if (value.getUsernameId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUsernameId());
        }
        if (value.getMail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPassword());
        }
        final int _tmp;
        _tmp = value.getFlagAllenatore() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getNome() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNome());
        }
        if (value.getCognome() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCognome());
        }
        if (value.getEta() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getEta());
        }
        if (value.getDescrizione() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDescrizione());
        }
        if (value.getImageURI() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImageURI());
        }
        if (value.getPeso() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPeso());
        }
        if (value.getAltezza() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getAltezza());
        }
        stmt.bindLong(12, value.getGenere());
        if (value.getAllenatore() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getAllenatore());
        }
      }
    };
    this.__updateAdapterOfUtente = new EntityDeletionOrUpdateAdapter<Utente>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `utenti_table` SET `usernameId` = ?,`mail` = ?,`password` = ?,`flagAllenatore` = ?,`nome` = ?,`cognome` = ?,`eta` = ?,`descrizione` = ?,`imageURI` = ?,`peso` = ?,`altezza` = ?,`genere` = ?,`allenatore` = ? WHERE `usernameId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Utente value) {
        if (value.getUsernameId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUsernameId());
        }
        if (value.getMail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPassword());
        }
        final int _tmp;
        _tmp = value.getFlagAllenatore() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getNome() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNome());
        }
        if (value.getCognome() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCognome());
        }
        if (value.getEta() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getEta());
        }
        if (value.getDescrizione() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDescrizione());
        }
        if (value.getImageURI() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImageURI());
        }
        if (value.getPeso() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPeso());
        }
        if (value.getAltezza() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getAltezza());
        }
        stmt.bindLong(12, value.getGenere());
        if (value.getAllenatore() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getAllenatore());
        }
        if (value.getUsernameId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getUsernameId());
        }
      }
    };
    this.__preparedStmtOfDeleteUtente = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM utenti_table WHERE usernameId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllUtenti = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM utenti_table";
        return _query;
      }
    };
  }

  @Override
  public void addUtente(final Utente utente) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUtente.insert(utente);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUtente(final Utente utente) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUtente.handle(utente);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUtente(final String username) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUtente.acquire();
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
      __preparedStmtOfDeleteUtente.release(_stmt);
    }
  }

  @Override
  public void deleteAllUtenti() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllUtenti.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllUtenti.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Utente>> getObservableUtenti() {
    final String _sql = "SELECT * from utenti_table ORDER BY usernameId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"utenti_table"}, false, new Callable<List<Utente>>() {
      @Override
      public List<Utente> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore");
          final List<Utente> _result = new ArrayList<Utente>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Utente _item;
            final String _tmpUsernameId;
            _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
            final String _tmpMail;
            _tmpMail = _cursor.getString(_cursorIndexOfMail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final boolean _tmpFlagAllenatore;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFlagAllenatore);
            _tmpFlagAllenatore = _tmp != 0;
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
            _item = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
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
  public LiveData<List<Utente>> getObservableAllenatori(final String username) {
    final String _sql = "SELECT * from utenti_table WHERE flagAllenatore = 1 AND usernameId != ? ORDER BY usernameId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"utenti_table"}, false, new Callable<List<Utente>>() {
      @Override
      public List<Utente> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore");
          final List<Utente> _result = new ArrayList<Utente>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Utente _item;
            final String _tmpUsernameId;
            _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
            final String _tmpMail;
            _tmpMail = _cursor.getString(_cursorIndexOfMail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final boolean _tmpFlagAllenatore;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFlagAllenatore);
            _tmpFlagAllenatore = _tmp != 0;
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
            _item = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
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
  public Utente getUtente(final String username) {
    final String _sql = "SELECT * from utenti_table WHERE usernameId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "usernameId");
      final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "mail");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "flagAllenatore");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "cognome");
      final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "eta");
      final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "descrizione");
      final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "imageURI");
      final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "peso");
      final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "altezza");
      final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "genere");
      final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore");
      final Utente _result;
      if(_cursor.moveToFirst()) {
        final String _tmpUsernameId;
        _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
        final String _tmpMail;
        _tmpMail = _cursor.getString(_cursorIndexOfMail);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        final boolean _tmpFlagAllenatore;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFlagAllenatore);
        _tmpFlagAllenatore = _tmp != 0;
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
        _result = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
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
  public LiveData<Utente> getObservableUtente(final String username) {
    final String _sql = "SELECT * from utenti_table WHERE usernameId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"utenti_table"}, false, new Callable<Utente>() {
      @Override
      public Utente call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore");
          final Utente _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUsernameId;
            _tmpUsernameId = _cursor.getString(_cursorIndexOfUsernameId);
            final String _tmpMail;
            _tmpMail = _cursor.getString(_cursorIndexOfMail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final boolean _tmpFlagAllenatore;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFlagAllenatore);
            _tmpFlagAllenatore = _tmp != 0;
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
            _result = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore);
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
}
