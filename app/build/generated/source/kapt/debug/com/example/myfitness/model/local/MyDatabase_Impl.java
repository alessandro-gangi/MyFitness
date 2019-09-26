package com.example.myfitness.model.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyDatabase_Impl extends MyDatabase {
  private volatile UtentiDao _utentiDao;

  private volatile SchedeDao _schedeDao;

  private volatile RichiesteDao _richiesteDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(17) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `utenti_table` (`usernameId` TEXT NOT NULL, `mail` TEXT NOT NULL, `password` TEXT NOT NULL, `flagAllenatore` INTEGER NOT NULL, `nome` TEXT NOT NULL, `cognome` TEXT NOT NULL, `eta` INTEGER, `descrizione` TEXT, `imageURI` TEXT, `peso` REAL, `altezza` INTEGER, `genere` INTEGER NOT NULL, `allenatore` TEXT, PRIMARY KEY(`usernameId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `schede_table` (`schedaId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `num_giorni` INTEGER NOT NULL, `data` TEXT NOT NULL, `tipo` TEXT NOT NULL, `commento` TEXT NOT NULL, `esercizi` TEXT NOT NULL, `is_current` INTEGER NOT NULL, `autore_usernameId` TEXT NOT NULL, `autore_mail` TEXT NOT NULL, `autore_password` TEXT NOT NULL, `autore_flagAllenatore` INTEGER NOT NULL, `autore_nome` TEXT NOT NULL, `autore_cognome` TEXT NOT NULL, `autore_eta` INTEGER, `autore_descrizione` TEXT, `autore_imageURI` TEXT, `autore_peso` REAL, `autore_altezza` INTEGER, `autore_genere` INTEGER NOT NULL, `autore_allenatore` TEXT, `possessore_usernameId` TEXT NOT NULL, `possessore_mail` TEXT NOT NULL, `possessore_password` TEXT NOT NULL, `possessore_flagAllenatore` INTEGER NOT NULL, `possessore_nome` TEXT NOT NULL, `possessore_cognome` TEXT NOT NULL, `possessore_eta` INTEGER, `possessore_descrizione` TEXT, `possessore_imageURI` TEXT, `possessore_peso` REAL, `possessore_altezza` INTEGER, `possessore_genere` INTEGER NOT NULL, `possessore_allenatore` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `richieste_table` (`richiestaId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `data` TEXT NOT NULL, `numGiorni` INTEGER NOT NULL, `tipologia` TEXT NOT NULL, `commento` TEXT NOT NULL, `utente_usernameId` TEXT NOT NULL, `utente_mail` TEXT NOT NULL, `utente_password` TEXT NOT NULL, `utente_flagAllenatore` INTEGER NOT NULL, `utente_nome` TEXT NOT NULL, `utente_cognome` TEXT NOT NULL, `utente_eta` INTEGER, `utente_descrizione` TEXT, `utente_imageURI` TEXT, `utente_peso` REAL, `utente_altezza` INTEGER, `utente_genere` INTEGER NOT NULL, `utente_allenatore` TEXT, `allenatore_usernameId` TEXT NOT NULL, `allenatore_mail` TEXT NOT NULL, `allenatore_password` TEXT NOT NULL, `allenatore_flagAllenatore` INTEGER NOT NULL, `allenatore_nome` TEXT NOT NULL, `allenatore_cognome` TEXT NOT NULL, `allenatore_eta` INTEGER, `allenatore_descrizione` TEXT, `allenatore_imageURI` TEXT, `allenatore_peso` REAL, `allenatore_altezza` INTEGER, `allenatore_genere` INTEGER NOT NULL, `allenatore_allenatore` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '194ca180c4ceb0080ae4a9d3e2faa7e7')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `utenti_table`");
        _db.execSQL("DROP TABLE IF EXISTS `schede_table`");
        _db.execSQL("DROP TABLE IF EXISTS `richieste_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUtentiTable = new HashMap<String, TableInfo.Column>(13);
        _columnsUtentiTable.put("usernameId", new TableInfo.Column("usernameId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("mail", new TableInfo.Column("mail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("flagAllenatore", new TableInfo.Column("flagAllenatore", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("nome", new TableInfo.Column("nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("cognome", new TableInfo.Column("cognome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("eta", new TableInfo.Column("eta", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("descrizione", new TableInfo.Column("descrizione", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("imageURI", new TableInfo.Column("imageURI", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("peso", new TableInfo.Column("peso", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("altezza", new TableInfo.Column("altezza", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("genere", new TableInfo.Column("genere", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUtentiTable.put("allenatore", new TableInfo.Column("allenatore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUtentiTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUtentiTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUtentiTable = new TableInfo("utenti_table", _columnsUtentiTable, _foreignKeysUtentiTable, _indicesUtentiTable);
        final TableInfo _existingUtentiTable = TableInfo.read(_db, "utenti_table");
        if (! _infoUtentiTable.equals(_existingUtentiTable)) {
          return new RoomOpenHelper.ValidationResult(false, "utenti_table(com.example.myfitness.model.dataClasses.Utente).\n"
                  + " Expected:\n" + _infoUtentiTable + "\n"
                  + " Found:\n" + _existingUtentiTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSchedeTable = new HashMap<String, TableInfo.Column>(33);
        _columnsSchedeTable.put("schedaId", new TableInfo.Column("schedaId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("num_giorni", new TableInfo.Column("num_giorni", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("tipo", new TableInfo.Column("tipo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("commento", new TableInfo.Column("commento", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("esercizi", new TableInfo.Column("esercizi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("is_current", new TableInfo.Column("is_current", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_usernameId", new TableInfo.Column("autore_usernameId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_mail", new TableInfo.Column("autore_mail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_password", new TableInfo.Column("autore_password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_flagAllenatore", new TableInfo.Column("autore_flagAllenatore", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_nome", new TableInfo.Column("autore_nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_cognome", new TableInfo.Column("autore_cognome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_eta", new TableInfo.Column("autore_eta", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_descrizione", new TableInfo.Column("autore_descrizione", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_imageURI", new TableInfo.Column("autore_imageURI", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_peso", new TableInfo.Column("autore_peso", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_altezza", new TableInfo.Column("autore_altezza", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_genere", new TableInfo.Column("autore_genere", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("autore_allenatore", new TableInfo.Column("autore_allenatore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_usernameId", new TableInfo.Column("possessore_usernameId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_mail", new TableInfo.Column("possessore_mail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_password", new TableInfo.Column("possessore_password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_flagAllenatore", new TableInfo.Column("possessore_flagAllenatore", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_nome", new TableInfo.Column("possessore_nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_cognome", new TableInfo.Column("possessore_cognome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_eta", new TableInfo.Column("possessore_eta", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_descrizione", new TableInfo.Column("possessore_descrizione", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_imageURI", new TableInfo.Column("possessore_imageURI", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_peso", new TableInfo.Column("possessore_peso", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_altezza", new TableInfo.Column("possessore_altezza", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_genere", new TableInfo.Column("possessore_genere", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSchedeTable.put("possessore_allenatore", new TableInfo.Column("possessore_allenatore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSchedeTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSchedeTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSchedeTable = new TableInfo("schede_table", _columnsSchedeTable, _foreignKeysSchedeTable, _indicesSchedeTable);
        final TableInfo _existingSchedeTable = TableInfo.read(_db, "schede_table");
        if (! _infoSchedeTable.equals(_existingSchedeTable)) {
          return new RoomOpenHelper.ValidationResult(false, "schede_table(com.example.myfitness.model.dataClasses.Scheda).\n"
                  + " Expected:\n" + _infoSchedeTable + "\n"
                  + " Found:\n" + _existingSchedeTable);
        }
        final HashMap<String, TableInfo.Column> _columnsRichiesteTable = new HashMap<String, TableInfo.Column>(31);
        _columnsRichiesteTable.put("richiestaId", new TableInfo.Column("richiestaId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("numGiorni", new TableInfo.Column("numGiorni", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("tipologia", new TableInfo.Column("tipologia", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("commento", new TableInfo.Column("commento", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_usernameId", new TableInfo.Column("utente_usernameId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_mail", new TableInfo.Column("utente_mail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_password", new TableInfo.Column("utente_password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_flagAllenatore", new TableInfo.Column("utente_flagAllenatore", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_nome", new TableInfo.Column("utente_nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_cognome", new TableInfo.Column("utente_cognome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_eta", new TableInfo.Column("utente_eta", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_descrizione", new TableInfo.Column("utente_descrizione", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_imageURI", new TableInfo.Column("utente_imageURI", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_peso", new TableInfo.Column("utente_peso", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_altezza", new TableInfo.Column("utente_altezza", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_genere", new TableInfo.Column("utente_genere", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("utente_allenatore", new TableInfo.Column("utente_allenatore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_usernameId", new TableInfo.Column("allenatore_usernameId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_mail", new TableInfo.Column("allenatore_mail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_password", new TableInfo.Column("allenatore_password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_flagAllenatore", new TableInfo.Column("allenatore_flagAllenatore", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_nome", new TableInfo.Column("allenatore_nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_cognome", new TableInfo.Column("allenatore_cognome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_eta", new TableInfo.Column("allenatore_eta", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_descrizione", new TableInfo.Column("allenatore_descrizione", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_imageURI", new TableInfo.Column("allenatore_imageURI", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_peso", new TableInfo.Column("allenatore_peso", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_altezza", new TableInfo.Column("allenatore_altezza", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_genere", new TableInfo.Column("allenatore_genere", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRichiesteTable.put("allenatore_allenatore", new TableInfo.Column("allenatore_allenatore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRichiesteTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRichiesteTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRichiesteTable = new TableInfo("richieste_table", _columnsRichiesteTable, _foreignKeysRichiesteTable, _indicesRichiesteTable);
        final TableInfo _existingRichiesteTable = TableInfo.read(_db, "richieste_table");
        if (! _infoRichiesteTable.equals(_existingRichiesteTable)) {
          return new RoomOpenHelper.ValidationResult(false, "richieste_table(com.example.myfitness.model.dataClasses.Richiesta).\n"
                  + " Expected:\n" + _infoRichiesteTable + "\n"
                  + " Found:\n" + _existingRichiesteTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "194ca180c4ceb0080ae4a9d3e2faa7e7", "220effabb60905cbd25f01683fbd391a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "utenti_table","schede_table","richieste_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `utenti_table`");
      _db.execSQL("DELETE FROM `schede_table`");
      _db.execSQL("DELETE FROM `richieste_table`");
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
  public UtentiDao UtentiDao() {
    if (_utentiDao != null) {
      return _utentiDao;
    } else {
      synchronized(this) {
        if(_utentiDao == null) {
          _utentiDao = new UtentiDao_Impl(this);
        }
        return _utentiDao;
      }
    }
  }

  @Override
  public SchedeDao SchedeDao() {
    if (_schedeDao != null) {
      return _schedeDao;
    } else {
      synchronized(this) {
        if(_schedeDao == null) {
          _schedeDao = new SchedeDao_Impl(this);
        }
        return _schedeDao;
      }
    }
  }

  @Override
  public RichiesteDao RichiesteDao() {
    if (_richiesteDao != null) {
      return _richiesteDao;
    } else {
      synchronized(this) {
        if(_richiesteDao == null) {
          _richiesteDao = new RichiesteDao_Impl(this);
        }
        return _richiesteDao;
      }
    }
  }
}
