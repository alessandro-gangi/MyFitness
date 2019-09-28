package com.example.myfitness.model.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myfitness.model.dataClasses.Richiesta;
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
public final class RichiesteDao_Impl implements RichiesteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Richiesta> __insertionAdapterOfRichiesta;

  private final EntityDeletionOrUpdateAdapter<Richiesta> __deletionAdapterOfRichiesta;

  public RichiesteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRichiesta = new EntityInsertionAdapter<Richiesta>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `richieste_table` (`richiestaId`,`data`,`numGiorni`,`tipologia`,`commento`,`utente_usernameId`,`utente_mail`,`utente_password`,`utente_flagAllenatore`,`utente_nome`,`utente_cognome`,`utente_eta`,`utente_descrizione`,`utente_imageURI`,`utente_peso`,`utente_altezza`,`utente_genere`,`utente_allenatore`,`allenatore_usernameId`,`allenatore_mail`,`allenatore_password`,`allenatore_flagAllenatore`,`allenatore_nome`,`allenatore_cognome`,`allenatore_eta`,`allenatore_descrizione`,`allenatore_imageURI`,`allenatore_peso`,`allenatore_altezza`,`allenatore_genere`,`allenatore_allenatore`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Richiesta value) {
        stmt.bindLong(1, value.getRichiestaId());
        if (value.getData() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getData());
        }
        stmt.bindLong(3, value.getNumGiorni());
        if (value.getTipologia() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTipologia());
        }
        if (value.getCommento() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCommento());
        }
        final Utente _tmpUtente = value.getUtente();
        if(_tmpUtente != null) {
          if (_tmpUtente.getUsernameId() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpUtente.getUsernameId());
          }
          if (_tmpUtente.getMail() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpUtente.getMail());
          }
          if (_tmpUtente.getPassword() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpUtente.getPassword());
          }
          final int _tmp;
          _tmp = _tmpUtente.getFlagAllenatore() ? 1 : 0;
          stmt.bindLong(9, _tmp);
          if (_tmpUtente.getNome() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpUtente.getNome());
          }
          if (_tmpUtente.getCognome() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpUtente.getCognome());
          }
          if (_tmpUtente.getEta() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindLong(12, _tmpUtente.getEta());
          }
          if (_tmpUtente.getDescrizione() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpUtente.getDescrizione());
          }
          if (_tmpUtente.getImageURI() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpUtente.getImageURI());
          }
          if (_tmpUtente.getPeso() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindDouble(15, _tmpUtente.getPeso());
          }
          if (_tmpUtente.getAltezza() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindLong(16, _tmpUtente.getAltezza());
          }
          stmt.bindLong(17, _tmpUtente.getGenere());
          if (_tmpUtente.getAllenatore() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindString(18, _tmpUtente.getAllenatore());
          }
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
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
        }
        final Utente _tmpAllenatore = value.getAllenatore();
        if(_tmpAllenatore != null) {
          if (_tmpAllenatore.getUsernameId() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpAllenatore.getUsernameId());
          }
          if (_tmpAllenatore.getMail() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpAllenatore.getMail());
          }
          if (_tmpAllenatore.getPassword() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpAllenatore.getPassword());
          }
          final int _tmp_1;
          _tmp_1 = _tmpAllenatore.getFlagAllenatore() ? 1 : 0;
          stmt.bindLong(22, _tmp_1);
          if (_tmpAllenatore.getNome() == null) {
            stmt.bindNull(23);
          } else {
            stmt.bindString(23, _tmpAllenatore.getNome());
          }
          if (_tmpAllenatore.getCognome() == null) {
            stmt.bindNull(24);
          } else {
            stmt.bindString(24, _tmpAllenatore.getCognome());
          }
          if (_tmpAllenatore.getEta() == null) {
            stmt.bindNull(25);
          } else {
            stmt.bindLong(25, _tmpAllenatore.getEta());
          }
          if (_tmpAllenatore.getDescrizione() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpAllenatore.getDescrizione());
          }
          if (_tmpAllenatore.getImageURI() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindString(27, _tmpAllenatore.getImageURI());
          }
          if (_tmpAllenatore.getPeso() == null) {
            stmt.bindNull(28);
          } else {
            stmt.bindDouble(28, _tmpAllenatore.getPeso());
          }
          if (_tmpAllenatore.getAltezza() == null) {
            stmt.bindNull(29);
          } else {
            stmt.bindLong(29, _tmpAllenatore.getAltezza());
          }
          stmt.bindLong(30, _tmpAllenatore.getGenere());
          if (_tmpAllenatore.getAllenatore() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindString(31, _tmpAllenatore.getAllenatore());
          }
        } else {
          stmt.bindNull(19);
          stmt.bindNull(20);
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
        }
      }
    };
    this.__deletionAdapterOfRichiesta = new EntityDeletionOrUpdateAdapter<Richiesta>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `richieste_table` WHERE `richiestaId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Richiesta value) {
        stmt.bindLong(1, value.getRichiestaId());
      }
    };
  }

  @Override
  public long addRichiesta(final Richiesta richiesta) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfRichiesta.insertAndReturnId(richiesta);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRichiesta(final Richiesta richiesta) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRichiesta.handle(richiesta);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Richiesta>> getObservableRichieste(final String username) {
    final String _sql = "SELECT * FROM richieste_table WHERE allenatore_usernameId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"richieste_table"}, false, new Callable<List<Richiesta>>() {
      @Override
      public List<Richiesta> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfRichiestaId = CursorUtil.getColumnIndexOrThrow(_cursor, "richiestaId");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "numGiorni");
          final int _cursorIndexOfTipologia = CursorUtil.getColumnIndexOrThrow(_cursor, "tipologia");
          final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
          final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_usernameId");
          final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_mail");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_password");
          final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_flagAllenatore");
          final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_nome");
          final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_cognome");
          final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_eta");
          final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_descrizione");
          final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_imageURI");
          final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_peso");
          final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_altezza");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_genere");
          final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_allenatore");
          final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_usernameId");
          final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_mail");
          final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_password");
          final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_flagAllenatore");
          final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_nome");
          final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_cognome");
          final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_eta");
          final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_descrizione");
          final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_imageURI");
          final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_peso");
          final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_altezza");
          final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_genere");
          final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_allenatore");
          final List<Richiesta> _result = new ArrayList<Richiesta>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Richiesta _item;
            final int _tmpRichiestaId;
            _tmpRichiestaId = _cursor.getInt(_cursorIndexOfRichiestaId);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final int _tmpNumGiorni;
            _tmpNumGiorni = _cursor.getInt(_cursorIndexOfNumGiorni);
            final String _tmpTipologia;
            _tmpTipologia = _cursor.getString(_cursorIndexOfTipologia);
            final String _tmpCommento;
            _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
            final Utente _tmpUtente;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
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
              final String _tmpAllenatore_1;
              _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore);
              _tmpUtente = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore_1);
            }  else  {
              _tmpUtente = null;
            }
            final Utente _tmpAllenatore;
            if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
              final String _tmpUsernameId_1;
              _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
              final String _tmpMail_1;
              _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
              final String _tmpPassword_1;
              _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
              final boolean _tmpFlagAllenatore_1;
              final int _tmp_1;
              _tmp_1 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
              _tmpFlagAllenatore_1 = _tmp_1 != 0;
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
              final String _tmpAllenatore_2;
              _tmpAllenatore_2 = _cursor.getString(_cursorIndexOfAllenatore_1);
              _tmpAllenatore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_2);
            }  else  {
              _tmpAllenatore = null;
            }
            _item = new Richiesta(_tmpRichiestaId,_tmpUtente,_tmpAllenatore,_tmpData,_tmpNumGiorni,_tmpTipologia,_tmpCommento);
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
  public Richiesta getRichiestaFromAtoB(final String utenteUsername,
      final String allenatoreUsername) {
    final String _sql = "SELECT * FROM richieste_table WHERE utente_usernameId = ? AND allenatore_usernameId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (utenteUsername == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, utenteUsername);
    }
    _argIndex = 2;
    if (allenatoreUsername == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, allenatoreUsername);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfRichiestaId = CursorUtil.getColumnIndexOrThrow(_cursor, "richiestaId");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
      final int _cursorIndexOfNumGiorni = CursorUtil.getColumnIndexOrThrow(_cursor, "numGiorni");
      final int _cursorIndexOfTipologia = CursorUtil.getColumnIndexOrThrow(_cursor, "tipologia");
      final int _cursorIndexOfCommento = CursorUtil.getColumnIndexOrThrow(_cursor, "commento");
      final int _cursorIndexOfUsernameId = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_usernameId");
      final int _cursorIndexOfMail = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_mail");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_password");
      final int _cursorIndexOfFlagAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_flagAllenatore");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_nome");
      final int _cursorIndexOfCognome = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_cognome");
      final int _cursorIndexOfEta = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_eta");
      final int _cursorIndexOfDescrizione = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_descrizione");
      final int _cursorIndexOfImageURI = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_imageURI");
      final int _cursorIndexOfPeso = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_peso");
      final int _cursorIndexOfAltezza = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_altezza");
      final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_genere");
      final int _cursorIndexOfAllenatore = CursorUtil.getColumnIndexOrThrow(_cursor, "utente_allenatore");
      final int _cursorIndexOfUsernameId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_usernameId");
      final int _cursorIndexOfMail_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_mail");
      final int _cursorIndexOfPassword_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_password");
      final int _cursorIndexOfFlagAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_flagAllenatore");
      final int _cursorIndexOfNome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_nome");
      final int _cursorIndexOfCognome_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_cognome");
      final int _cursorIndexOfEta_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_eta");
      final int _cursorIndexOfDescrizione_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_descrizione");
      final int _cursorIndexOfImageURI_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_imageURI");
      final int _cursorIndexOfPeso_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_peso");
      final int _cursorIndexOfAltezza_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_altezza");
      final int _cursorIndexOfGenere_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_genere");
      final int _cursorIndexOfAllenatore_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "allenatore_allenatore");
      final Richiesta _result;
      if(_cursor.moveToFirst()) {
        final int _tmpRichiestaId;
        _tmpRichiestaId = _cursor.getInt(_cursorIndexOfRichiestaId);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        final int _tmpNumGiorni;
        _tmpNumGiorni = _cursor.getInt(_cursorIndexOfNumGiorni);
        final String _tmpTipologia;
        _tmpTipologia = _cursor.getString(_cursorIndexOfTipologia);
        final String _tmpCommento;
        _tmpCommento = _cursor.getString(_cursorIndexOfCommento);
        final Utente _tmpUtente;
        if (! (_cursor.isNull(_cursorIndexOfUsernameId) && _cursor.isNull(_cursorIndexOfMail) && _cursor.isNull(_cursorIndexOfPassword) && _cursor.isNull(_cursorIndexOfFlagAllenatore) && _cursor.isNull(_cursorIndexOfNome) && _cursor.isNull(_cursorIndexOfCognome) && _cursor.isNull(_cursorIndexOfEta) && _cursor.isNull(_cursorIndexOfDescrizione) && _cursor.isNull(_cursorIndexOfImageURI) && _cursor.isNull(_cursorIndexOfPeso) && _cursor.isNull(_cursorIndexOfAltezza) && _cursor.isNull(_cursorIndexOfGenere) && _cursor.isNull(_cursorIndexOfAllenatore))) {
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
          final String _tmpAllenatore_1;
          _tmpAllenatore_1 = _cursor.getString(_cursorIndexOfAllenatore);
          _tmpUtente = new Utente(_tmpUsernameId,_tmpMail,_tmpPassword,_tmpFlagAllenatore,_tmpNome,_tmpCognome,_tmpEta,_tmpDescrizione,_tmpImageURI,_tmpPeso,_tmpAltezza,_tmpGenere,_tmpAllenatore_1);
        }  else  {
          _tmpUtente = null;
        }
        final Utente _tmpAllenatore;
        if (! (_cursor.isNull(_cursorIndexOfUsernameId_1) && _cursor.isNull(_cursorIndexOfMail_1) && _cursor.isNull(_cursorIndexOfPassword_1) && _cursor.isNull(_cursorIndexOfFlagAllenatore_1) && _cursor.isNull(_cursorIndexOfNome_1) && _cursor.isNull(_cursorIndexOfCognome_1) && _cursor.isNull(_cursorIndexOfEta_1) && _cursor.isNull(_cursorIndexOfDescrizione_1) && _cursor.isNull(_cursorIndexOfImageURI_1) && _cursor.isNull(_cursorIndexOfPeso_1) && _cursor.isNull(_cursorIndexOfAltezza_1) && _cursor.isNull(_cursorIndexOfGenere_1) && _cursor.isNull(_cursorIndexOfAllenatore_1))) {
          final String _tmpUsernameId_1;
          _tmpUsernameId_1 = _cursor.getString(_cursorIndexOfUsernameId_1);
          final String _tmpMail_1;
          _tmpMail_1 = _cursor.getString(_cursorIndexOfMail_1);
          final String _tmpPassword_1;
          _tmpPassword_1 = _cursor.getString(_cursorIndexOfPassword_1);
          final boolean _tmpFlagAllenatore_1;
          final int _tmp_1;
          _tmp_1 = _cursor.getInt(_cursorIndexOfFlagAllenatore_1);
          _tmpFlagAllenatore_1 = _tmp_1 != 0;
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
          final String _tmpAllenatore_2;
          _tmpAllenatore_2 = _cursor.getString(_cursorIndexOfAllenatore_1);
          _tmpAllenatore = new Utente(_tmpUsernameId_1,_tmpMail_1,_tmpPassword_1,_tmpFlagAllenatore_1,_tmpNome_1,_tmpCognome_1,_tmpEta_1,_tmpDescrizione_1,_tmpImageURI_1,_tmpPeso_1,_tmpAltezza_1,_tmpGenere_1,_tmpAllenatore_2);
        }  else  {
          _tmpAllenatore = null;
        }
        _result = new Richiesta(_tmpRichiestaId,_tmpUtente,_tmpAllenatore,_tmpData,_tmpNumGiorni,_tmpTipologia,_tmpCommento);
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
