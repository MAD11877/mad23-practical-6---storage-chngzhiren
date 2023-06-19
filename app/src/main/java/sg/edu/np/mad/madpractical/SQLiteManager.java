package sg.edu.np.mad.madpractical;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.xml.namespace.QName;


public class SQLiteManager extends SQLiteOpenHelper
{

    private static SQLiteManager sqLiteManager;
    private static final String DATABASE_NAME = "Users";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "User";

    private static final String NAME_FIELD = "name";
    private static final String DESCRIPTION_FIELD = "description";
    private static final String ID_FIELD = "id";
    private static final String FOLLOWED_FIELD = "followed";


    public SQLiteManager(Context context)
    {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        StringBuilder sql;
        sql = new StringBuilder()
                .append("CREATE TABLE")
                .append(TABLE_NAME)
                .append(NAME_FIELD)
                .append(DESCRIPTION_FIELD)
                .append(ID_FIELD)
                .append(FOLLOWED_FIELD);
        db.execSQL(sql.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
